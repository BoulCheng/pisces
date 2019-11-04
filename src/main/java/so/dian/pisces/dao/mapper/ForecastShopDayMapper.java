package so.dian.pisces.dao.mapper;

import org.apache.ibatis.annotations.Param;
import so.dian.pisces.domain.ForecastShopDayDO;
import so.dian.pisces.domain.ForecastShopDayDOExample;

import java.util.List;

public interface ForecastShopDayMapper {
    long countByExample(ForecastShopDayDOExample example);

    int deleteByExample(ForecastShopDayDOExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ForecastShopDayDO record);

    int insertSelective(ForecastShopDayDO record);

    List<ForecastShopDayDO> selectByExample(ForecastShopDayDOExample example);

    ForecastShopDayDO selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ForecastShopDayDO record, @Param("example") ForecastShopDayDOExample example);

    int updateByExample(@Param("record") ForecastShopDayDO record, @Param("example") ForecastShopDayDOExample example);

    int updateByPrimaryKeySelective(ForecastShopDayDO record);

    int updateByPrimaryKey(ForecastShopDayDO record);
}