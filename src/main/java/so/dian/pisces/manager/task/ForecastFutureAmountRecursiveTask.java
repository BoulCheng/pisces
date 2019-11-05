package so.dian.pisces.manager.task;
import so.dian.pisces.common.seer.Seer;
import so.dian.pisces.config.SeerConfiguration;
import so.dian.pisces.domain.ForecastFutureAmountDO;
import so.dian.pisces.domain.ForecastShopDayDO;

import java.util.*;
import java.util.concurrent.RecursiveTask;

/**
 * @author yuanming
 * Created on 2019/10/23
 * Description 预测未来支付金额
 */
public class ForecastFutureAmountRecursiveTask extends AbstractSeerRecursiveTask<ForecastFutureAmountDO> {

    public ForecastFutureAmountRecursiveTask(int currDepth, int begin, int end, SeerConfiguration seerConfiguration, List<ForecastShopDayDO> forecastDOList) {
        super(currDepth, begin, end, seerConfiguration, forecastDOList);
    }

    @Override
    protected ForecastFutureAmountDO generateDo(EnumMap<Seer.SeerReturnEnum, Object> result, ForecastShopDayDO forecastDO) {
        ForecastFutureAmountDO forecastFutureAmountDO = new ForecastFutureAmountDO();
        forecastFutureAmountDO.setSource_id(forecastDO.getId());
        forecastFutureAmountDO.setShop_id(forecastDO.getShop_id());
        forecastFutureAmountDO.setBiz_date(forecastDO.getBiz_date());
        forecastFutureAmountDO.setCreate_time(new Date());
        forecastFutureAmountDO.setStatus(getStatus(result));
        forecastFutureAmountDO.setPayment_amount_forecast(correctResult(result));
        return forecastFutureAmountDO;
    }

    @Override
    protected void batchInsert(List<ForecastFutureAmountDO> list) {
        this.seerConfiguration.getForecastDataManager().batchInsertForFuturePaymentAmount(list);
    }

    @Override
    protected RecursiveTask newInstance(int currDepth, int begin, int end, SeerConfiguration seerConfiguration, List<ForecastShopDayDO> forecastDOList) {
        return new ForecastFutureAmountRecursiveTask(currDepth, begin, end, seerConfiguration, forecastDOList);
    }
}
