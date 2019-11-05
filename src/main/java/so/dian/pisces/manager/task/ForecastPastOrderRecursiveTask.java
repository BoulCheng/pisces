package so.dian.pisces.manager.task;
import so.dian.pisces.common.seer.Seer;
import so.dian.pisces.config.SeerConfiguration;
import so.dian.pisces.domain.ForecastPastOrderDO;
import so.dian.pisces.domain.ForecastShopDayDO;

import java.util.*;
import java.util.concurrent.RecursiveTask;

/**
 * @author yuanming
 * Created on 2019/10/23
 * Description 预测过去订单
 */
public class ForecastPastOrderRecursiveTask extends AbstractSeerRecursiveTask<ForecastPastOrderDO> {

    public ForecastPastOrderRecursiveTask(int currDepth, int begin, int end, SeerConfiguration seerConfiguration, List<ForecastShopDayDO> forecastDOList) {
        super(currDepth, begin, end, seerConfiguration, forecastDOList);
    }

    @Override
    protected ForecastPastOrderDO generateDo(EnumMap<Seer.SeerReturnEnum, Object> result, ForecastShopDayDO forecastDO) {
        ForecastPastOrderDO forecastPastOrderDO = new ForecastPastOrderDO();
        forecastPastOrderDO.setSource_id(forecastDO.getId());
        forecastPastOrderDO.setShop_id(forecastDO.getShop_id());
        forecastPastOrderDO.setPay_orders_original(forecastDO.getPay_orders());
        forecastPastOrderDO.setBiz_date(forecastDO.getBiz_date());
        forecastPastOrderDO.setCreate_time(new Date());
        forecastPastOrderDO.setStatus(getStatus(result));
        forecastPastOrderDO.setPay_orders_forecast(correctResult(result));
        return forecastPastOrderDO;
    }

    @Override
    protected void batchInsert(List<ForecastPastOrderDO> list) {
        this.seerConfiguration.getForecastDataManager().batchInsertForPastOrder(list);
    }

    @Override
    protected RecursiveTask newInstance(int currDepth, int begin, int end, SeerConfiguration seerConfiguration, List<ForecastShopDayDO> forecastDOList) {
        return new ForecastPastOrderRecursiveTask(currDepth, begin, end, seerConfiguration, forecastDOList);
    }
}
