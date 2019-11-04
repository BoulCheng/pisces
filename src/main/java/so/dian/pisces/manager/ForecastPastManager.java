package so.dian.pisces.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import so.dian.pisces.dao.mapper.ForecastPastMapper;
import so.dian.pisces.domain.ForecastPastDO;

import java.util.List;

/**
 * @author yuanming
 * Created on 2019/11/1
 * Description
 */
@Service
public class ForecastPastManager {


    @Autowired
    private ForecastPastMapper forecastPastMapper;

    public int insertSelective(ForecastPastDO forecastPastDO) {
        return forecastPastMapper.insertSelective(forecastPastDO);
    }

    public int batchInsert(List<ForecastPastDO> forecastPastDOS) {
        return forecastPastMapper.batchInsert(forecastPastDOS);
    }
}