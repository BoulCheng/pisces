package so.dian.pisces.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
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

    public List<ForecastShopDayDO> page(BasicDataDTO basicDataDTO) {
        return basicDataMapper.page(basicDataDTO);
    }

    public Long count(BasicDataDTO basicDataDTO) {
        return basicDataMapper.count(basicDataDTO);
    }
}
