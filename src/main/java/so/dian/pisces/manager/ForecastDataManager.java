package so.dian.pisces.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import so.dian.pisces.dao.mapper.ForecastFutureAmountMapper;
import so.dian.pisces.dao.mapper.ForecastPastAmountMapper;
import so.dian.pisces.dao.mapper.ForecastPastOrderMapper;
import so.dian.pisces.domain.ForecastFutureAmountDO;
import so.dian.pisces.domain.ForecastPastAmountDO;
import so.dian.pisces.domain.ForecastPastOrderDO;

import java.util.List;

/**
 * @author yuanming
 * Created on 2019/11/1
 * Description
 */
@Service
public class ForecastDataManager {


    @Autowired
    private ForecastPastOrderMapper forecastPastOrderMapper;

    @Autowired
    private ForecastPastAmountMapper forecastPastAmountMapper;

    @Autowired
    private ForecastFutureAmountMapper forecastFutureAmountMapper;


    public int batchInsertForPastOrder(List<ForecastPastOrderDO> forecastPastOrderDOS) {
        return forecastPastOrderMapper.batchInsert(forecastPastOrderDOS);
    }

    public int batchInsertForPaymentAmount(List<ForecastPastAmountDO> forecastPastAmountDOS) {
        return forecastPastAmountMapper.batchInsert(forecastPastAmountDOS);
    }

    public int batchInsertForFuturePaymentAmount(List<ForecastFutureAmountDO> forecastFutureAmountDOS) {
        return forecastFutureAmountMapper.batchInsert(forecastFutureAmountDOS);
    }

}
