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
 * Description 预测过去订单
 */
public class ForecastPastOrderRecursiveTask extends AbstractSeerRecursiveTask {

    public ForecastPastOrderRecursiveTask(int currDepth, int begin, int end, SeerConfiguration seerConfiguration, List<ForecastShopDayDO> forecastDOList) {
        super(currDepth, begin, end, seerConfiguration, forecastDOList);
    }

    @Override
    protected void execute() {
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
                    this.seerConfiguration.getForecastDataManager().batchInsertForPastOrder(forecastPastOrderDOList);
                    forecastPastOrderDOList.clear();
                } catch (Exception e) {
                    // log
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    protected RecursiveTask newRecursiveTask(int currDepth, int begin, int end, SeerConfiguration seerConfiguration, List<ForecastShopDayDO> forecastDOList) {
        return new ForecastPastOrderRecursiveTask(currDepth, begin, end, seerConfiguration, forecastDOList);
    }
}
