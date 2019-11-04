package so.dian.pisces.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import so.dian.pisces.dao.mapper.BasicDataMapper;
import so.dian.pisces.domain.BasicDataDTO;
import so.dian.pisces.domain.ForecastShopDayDO;

import java.util.List;

/**
 * @author yuanming
 * Created on 2019/10/16
 * Description
 */
@Service
public class ForecastDataService {

    @Autowired
    private BasicDataMapper basicDataMapper;

    public List<ForecastShopDayDO> page(BasicDataDTO basicDataDTO) {
        return basicDataMapper.page(basicDataDTO);
    }

    public Long count(BasicDataDTO basicDataDTO) {
        return basicDataMapper.count(basicDataDTO);
    }

}
