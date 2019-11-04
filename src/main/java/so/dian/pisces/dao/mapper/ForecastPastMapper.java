package so.dian.pisces.dao.mapper;

import org.apache.ibatis.annotations.Param;
import so.dian.pisces.domain.ForecastPastDO;
import so.dian.pisces.domain.ForecastPastDOExample;

import java.util.List;

public interface ForecastPastMapper {
    long countByExample(ForecastPastDOExample example);

    int deleteByExample(ForecastPastDOExample example);

    int deleteByPrimaryKey(Integer id);

    int batchInsert(@Param("items") List<ForecastPastDO> forecastPastDOS);

    int insert(ForecastPastDO record);

    int insertSelective(ForecastPastDO record);

    List<ForecastPastDO> selectByExample(ForecastPastDOExample example);

    ForecastPastDO selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ForecastPastDO record, @Param("example") ForecastPastDOExample example);

    int updateByExample(@Param("record") ForecastPastDO record, @Param("example") ForecastPastDOExample example);

    int updateByPrimaryKeySelective(ForecastPastDO record);

    int updateByPrimaryKey(ForecastPastDO record);
}