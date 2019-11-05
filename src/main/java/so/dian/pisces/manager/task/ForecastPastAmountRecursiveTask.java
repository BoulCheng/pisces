package so.dian.pisces.manager.task;
import so.dian.pisces.common.seer.Seer;
import so.dian.pisces.config.SeerConfiguration;
import so.dian.pisces.domain.ForecastPastAmountDO;
import so.dian.pisces.domain.ForecastShopDayDO;

import java.util.*;
import java.util.concurrent.RecursiveTask;

/**
 * @author yuanming
 * Created on 2019/10/23
 * Description 预测过去支付金额
 */
public class ForecastPastAmountRecursiveTask extends AbstractSeerRecursiveTask<ForecastPastAmountDO> {

    public ForecastPastAmountRecursiveTask(int currDepth, int begin, int end, SeerConfiguration seerConfiguration, List<ForecastShopDayDO> forecastDOList) {
        super(currDepth, begin, end, seerConfiguration, forecastDOList);
    }

    @Override
    protected ForecastPastAmountDO generateDo(EnumMap<Seer.SeerReturnEnum, Object> result, ForecastShopDayDO forecastDO) {
        ForecastPastAmountDO forecastPastAmountDO = new ForecastPastAmountDO();
        forecastPastAmountDO.setSource_id(forecastDO.getId());
        forecastPastAmountDO.setShop_id(forecastDO.getShop_id());
        forecastPastAmountDO.setPayment_amount_original(forecastDO.getPayment_amount());
        forecastPastAmountDO.setBiz_date(forecastDO.getBiz_date());
        forecastPastAmountDO.setCreate_time(new Date());
        forecastPastAmountDO.setPayment_amount_forecast(correctResult(result));
        forecastPastAmountDO.setStatus(getStatus(result));
        return forecastPastAmountDO;
    }

    @Override
    protected void batchInsert(List<ForecastPastAmountDO> list) {
        this.seerConfiguration.getForecastDataManager().batchInsertForPaymentAmount(list);
    }

    @Override
    protected RecursiveTask newInstance(int currDepth, int begin, int end, SeerConfiguration seerConfiguration, List<ForecastShopDayDO> forecastDOList) {
        return new ForecastPastAmountRecursiveTask(currDepth, begin, end, seerConfiguration, forecastDOList);
    }
}
