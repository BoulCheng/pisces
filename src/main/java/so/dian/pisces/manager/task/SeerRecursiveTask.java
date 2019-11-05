package so.dian.pisces.manager.task;
import org.jpmml.evaluator.Evaluator;
import so.dian.pisces.common.seer.Seer;
import so.dian.pisces.config.SeerConfiguration;
import so.dian.pisces.domain.ForecastPastOrderDO;
import so.dian.pisces.domain.ForecastShopDayDO;

import java.lang.reflect.Field;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.RecursiveTask;

/**
 * @author yuanming
 * Created on 2019/10/23
 * Description
 */
public class SeerRecursiveTask extends RecursiveTask<Long> {

    private int currDepth;
    private int begin;
    private int end;
    private SeerConfiguration seerConfiguration;
    private List<ForecastShopDayDO> forecastDOList;

    public SeerRecursiveTask(int currDepth, int begin, int end, SeerConfiguration seerConfiguration, List<ForecastShopDayDO> forecastDOList) {
        this.currDepth = currDepth;
        this.begin = begin;
        this.end = end;
        this.seerConfiguration = seerConfiguration;
        this.forecastDOList = forecastDOList;
    }

    @Override
    protected Long compute() {
        if (this.currDepth == seerConfiguration.getRecursiveDepth()) {
            Evaluator evaluator = seerConfiguration.getNextEvaluator();
            ForecastPastOrderDO forecastPastOrderDO;
            ForecastShopDayDO forecastDO;
            List<ForecastPastOrderDO> forecastPastOrderDOList = new ArrayList<>(3005);

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

                forecastPastOrderDO = new ForecastPastOrderDO();
                forecastPastOrderDO.setSource_id(forecastDO.getId());
                forecastPastOrderDO.setShop_id(forecastDO.getShop_id());
                forecastPastOrderDO.setPay_orders_original(forecastDO.getPay_orders());
                forecastPastOrderDO.setBiz_date(forecastDO.getBiz_date());
                forecastPastOrderDO.setCreate_time(new Date());

                boolean flag = true;
                EnumMap<Seer.SeerReturnEnum, Object> result;
                try {
                    result = Seer.predict(evaluator, map, seerConfiguration);
                    forecastPastOrderDO.setPay_orders_forecast(Math.expm1((Double) result.get(Seer.SeerReturnEnum.RESULT)));
                } catch (Exception e) {
                    e.printStackTrace();
                    flag = false;
                }

                if (!flag) {
                    forecastPastOrderDO.setStatus(1);
                } else {
                    forecastPastOrderDO.setStatus(0);
                }
                forecastPastOrderDOList.add(forecastPastOrderDO);
                if (forecastPastOrderDOList.size() > 3000 || (this.end - 1 == i)) {
                    try {
                        this.seerConfiguration.getForecastDataManager().batchInsert(forecastPastOrderDOList);
                        forecastPastOrderDOList.clear();
                    } catch (Exception e) {
                        // log
                        e.printStackTrace();
                    }
                }
            }

        } else {
            int middle = (begin + end) / 2;
            currDepth++;
            SeerRecursiveTask seerRecursiveTask = new SeerRecursiveTask(currDepth, begin, middle, seerConfiguration, forecastDOList);
            SeerRecursiveTask seerRecursiveTask2 = new SeerRecursiveTask(currDepth, middle, end, seerConfiguration, forecastDOList);

            seerRecursiveTask.fork();
            seerRecursiveTask.join();

            seerRecursiveTask2.fork();
            seerRecursiveTask2.join();
        }
        return null;
    }
}
