package so.dian.pisces.manager.task;


import org.jpmml.evaluator.Evaluator;
import so.dian.pisces.common.seer.Seer;
import so.dian.pisces.config.SeerConfiguration;
import so.dian.pisces.domain.ForecastShopDayDO;

import java.lang.reflect.Field;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.RecursiveTask;

/**
 * @author yuanming
 * Created on 2019/11/4
 * Description 任务基类
 */
public abstract class AbstractSeerRecursiveTask<T> extends RecursiveTask<Long> {

    private static final int BATCH_INSERT_THRESHOLD = 3000;

    protected int currDepth;
    protected int begin;
    protected int end;
    protected SeerConfiguration seerConfiguration;
    protected List<ForecastShopDayDO> forecastDOList;

    public AbstractSeerRecursiveTask(int currDepth, int begin, int end, SeerConfiguration seerConfiguration, List<ForecastShopDayDO> forecastDOList) {
        this.currDepth = currDepth;
        this.begin = begin;
        this.end = end;
        this.seerConfiguration = seerConfiguration;
        this.forecastDOList = forecastDOList;
    }

    @Override
    protected final Long compute() {
        if (this.currDepth == seerConfiguration.getRecursiveDepth()) {
            execute();
        } else {
            int middle = (begin + end) / 2;
            currDepth++;
            RecursiveTask seerRecursiveTask = newInstance(currDepth, begin, middle, seerConfiguration, forecastDOList);
            RecursiveTask seerRecursiveTask2 = newInstance(currDepth, middle, end, seerConfiguration, forecastDOList);

            seerRecursiveTask.fork();
            seerRecursiveTask.join();

            seerRecursiveTask2.fork();
            seerRecursiveTask2.join();
        }
        return null;
    }

    private void execute() {
        Evaluator evaluator = seerConfiguration.getNextEvaluator();
        ForecastShopDayDO forecastDO;
        List<T> list = new ArrayList<>(BATCH_INSERT_THRESHOLD + 5);

        for (int i = this.begin; i < this.end; i++) {
            forecastDO = this.forecastDOList.get(i);
            Field[] fields = forecastDO.getClass().getDeclaredFields();
            Map<String, Object> map = new ConcurrentHashMap<>();
            try {
                for (Field field : fields) {
                    field.setAccessible(true);
                    if (field.get(forecastDO) != null) {
                        map.put(field.getName(), field.get(forecastDO));
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

            EnumMap<Seer.SeerReturnEnum, Object> result;
            try {
                result = Seer.predict(evaluator, map, seerConfiguration);
            } catch (Exception e) {
                result = new EnumMap<>(Seer.SeerReturnEnum.class);
                result.put(Seer.SeerReturnEnum.EXCEPTION, Boolean.TRUE);
                e.printStackTrace();
            }

            list.add(generateDo(result, forecastDO));
            if (list.size() >= BATCH_INSERT_THRESHOLD || (this.end - 1 == i)) {
                try {
                    batchInsert(list);
                    list.clear();
                } catch (Exception e) {
                    // log
                    e.printStackTrace();
                }
            }
        }
    }

    protected abstract T generateDo(EnumMap<Seer.SeerReturnEnum, Object> result, ForecastShopDayDO forecastDO);

    protected abstract void batchInsert(List<T> list);

    protected abstract RecursiveTask newInstance(int currDepth, int begin, int end, SeerConfiguration seerConfiguration, List<ForecastShopDayDO> forecastDOList);

    protected final Integer getStatus(EnumMap<Seer.SeerReturnEnum, Object> result) {
        return Boolean.TRUE.equals(result.get(Seer.SeerReturnEnum.EXCEPTION)) ? 1 : 0;
    }

    protected final Double correctResult(EnumMap<Seer.SeerReturnEnum, Object> result) {
        return !Boolean.TRUE.equals(result.get(Seer.SeerReturnEnum.EXCEPTION)) ? Math.expm1((Double) result.get(Seer.SeerReturnEnum.RESULT)) : null;
    }
}
