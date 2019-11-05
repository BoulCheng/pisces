package so.dian.pisces.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import so.dian.pisces.config.SeerConfiguration;
import so.dian.pisces.dao.mapper.BasicDataMapper;
import so.dian.pisces.domain.BasicDataDTO;
import so.dian.pisces.domain.ForecastShopDayDO;

import java.util.List;

/**
 * @author yuanming
 * Created on 2019/11/4
 * Description
 */
@Service
public class BasicDataManager {

    @Autowired
    private BasicDataMapper basicDataMapper;

    public List<ForecastShopDayDO> page(BasicDataDTO basicDataDTO, SeerConfiguration.RecursiveTaskEnum recursiveTaskEnum) {
        if (recursiveTaskEnum.isPast()) {
            return pagePast(basicDataDTO);
        }

        if (recursiveTaskEnum.isFuture()) {
            return pageFuture(basicDataDTO);
        }
        // error log
        return null;
    }

    public Long count(BasicDataDTO basicDataDTO, SeerConfiguration.RecursiveTaskEnum recursiveTaskEnum) {
        if (recursiveTaskEnum.isPast()) {
            return countPast(basicDataDTO);
        }

        if (recursiveTaskEnum.isFuture()) {
            return countFuture(basicDataDTO);
        }
        // error log
        return null;
    }

    public List<ForecastShopDayDO> pagePast(BasicDataDTO basicDataDTO) {
        return basicDataMapper.pagePast(basicDataDTO);
    }

    public Long countPast(BasicDataDTO basicDataDTO) {
        return basicDataMapper.countPast(basicDataDTO);
    }

    public List<ForecastShopDayDO> pageFuture(BasicDataDTO basicDataDTO) {
        return basicDataMapper.pageFuture(basicDataDTO);
    }

    public Long countFuture(BasicDataDTO basicDataDTO) {
        return basicDataMapper.countFuture(basicDataDTO);
    }
}
