package so.dian.pisces.manager.task;
import org.jpmml.evaluator.Evaluator;
import so.dian.pisces.common.seer.Seer;
import so.dian.pisces.config.SeerConfiguration;
import so.dian.pisces.domain.ForecastPastAmountDO;
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
public class SeerAmountRecursiveTask extends AbstractSeerRecursiveTask {

    public SeerAmountRecursiveTask(int currDepth, int begin, int end, SeerConfiguration seerConfiguration, List<ForecastShopDayDO> forecastDOList) {
        super(currDepth, begin, end, seerConfiguration, forecastDOList);
    }

    @Override
    protected void execute() {
        Evaluator evaluator = seerConfiguration.getNextEvaluator();
        ForecastPastAmountDO forecastPastAmountDO;
        ForecastShopDayDO forecastDO;
        List<ForecastPastAmountDO> forecastPastAmountDOList = new ArrayList<>(3005);
        Date date = new Date();
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

            forecastPastAmountDO = new ForecastPastAmountDO();
            forecastPastAmountDO.setSource_id(forecastDO.getId());
            forecastPastAmountDO.setShop_id(forecastDO.getShop_id());
            forecastPastAmountDO.setPayment_amount_original(forecastDO.getPayment_amount());
            forecastPastAmountDO.setBiz_date(forecastDO.getBiz_date());
            forecastPastAmountDO.setCreate_time(date);

            boolean flag = true;
            EnumMap<Seer.SeerReturnEnum, Object> result;
            try {
                result = Seer.predict(evaluator, map, seerConfiguration);
                forecastPastAmountDO.setPayment_amount_forecast(Math.expm1((Double) result.get(Seer.SeerReturnEnum.RESULT)));
            } catch (Exception e) {
                e.printStackTrace();
                flag = false;
            }

            if (!flag) {
                forecastPastAmountDO.setStatus(1);
            } else {
                forecastPastAmountDO.setStatus(0);
            }
            forecastPastAmountDOList.add(forecastPastAmountDO);
            if (forecastPastAmountDOList.size() > 3000 || (this.end - 1 == i)) {
                try {
                    this.seerConfiguration.getForecastPastManager().batchInsertForPaymentAmount(forecastPastAmountDOList);
                    forecastPastAmountDOList.clear();
                } catch (Exception e) {
                    // log
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    protected RecursiveTask newRecursiveTask(int currDepth, int begin, int end, SeerConfiguration seerConfiguration, List<ForecastShopDayDO> forecastDOList) {
        return new SeerAmountRecursiveTask(currDepth, begin, end, seerConfiguration, forecastDOList);
    }
}
