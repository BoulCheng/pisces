package so.dian.pisces.dao.mapper;


import so.dian.pisces.domain.BasicDataDTO;
import so.dian.pisces.domain.ForecastShopDayDO;

import java.util.List;

/**
 * @author yuanming
 * Created on 2019/10/25
 * Description
 */
public interface BasicDataMapper {

    List<ForecastShopDayDO> pagePast(BasicDataDTO basicDataDTO);

    Long countPast(BasicDataDTO basicDataDTO);

    List<ForecastShopDayDO> pageFuture(BasicDataDTO basicDataDTO);

    Long countFuture(BasicDataDTO basicDataDTO);
}


