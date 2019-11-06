package so.dian.pisces.manager.task;

import so.dian.pisces.common.seer.Seer;
import so.dian.pisces.config.SeerConfiguration;
import so.dian.pisces.domain.ForecastFutureOrderDO;
import so.dian.pisces.domain.ForecastShopDayDO;

import java.util.Date;
import java.util.EnumMap;
import java.util.List;
import java.util.concurrent.RecursiveTask;

/**
 * @author yuanming
 * Created on 2019/10/23
 * Description 预测未来订单数
 */
public class ForecastFutureOrderRecursiveTask extends AbstractSeerRecursiveTask<ForecastFutureOrderDO> {

    public ForecastFutureOrderRecursiveTask(int currDepth, int begin, int end, SeerConfiguration seerConfiguration, List<ForecastShopDayDO> forecastDOList) {
        super(currDepth, begin, end, seerConfiguration, forecastDOList);
    }

    @Override
    protected ForecastFutureOrderDO generateDo(EnumMap<Seer.SeerReturnEnum, Object> result, ForecastShopDayDO forecastDO) {
        ForecastFutureOrderDO forecastFutureOrderDO = new ForecastFutureOrderDO();
        forecastFutureOrderDO.setSource_id(forecastDO.getId());
        forecastFutureOrderDO.setShop_id(forecastDO.getShop_id());
        forecastFutureOrderDO.setBiz_date(forecastDO.getBiz_date());
        forecastFutureOrderDO.setCreate_time(new Date());
        forecastFutureOrderDO.setStatus(getStatus(result));
        forecastFutureOrderDO.setPay_orders_forecast(correctResult(result));
        return forecastFutureOrderDO;
    }

    @Override
    protected void batchInsert(List<ForecastFutureOrderDO> list) {
        this.seerConfiguration.getForecastDataManager().batchInsertForFutureOrder(list);
    }

    @Override
    protected RecursiveTask newInstance(int currDepth, int begin, int end, SeerConfiguration seerConfiguration, List<ForecastShopDayDO> forecastDOList) {
        return new ForecastFutureOrderRecursiveTask(currDepth, begin, end, seerConfiguration, forecastDOList);
    }
}
