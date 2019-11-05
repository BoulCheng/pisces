package so.dian.pisces.dao.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import so.dian.pisces.domain.ForecastPastOrderDO;
import so.dian.pisces.domain.ForecastPastOrderDOExample;

public interface ForecastPastOrderMapper {
    long countByExample(ForecastPastOrderDOExample example);

    int deleteByExample(ForecastPastOrderDOExample example);

    int deleteByPrimaryKey(Integer id);

    int batchInsert(@Param("items") List<ForecastPastOrderDO> forecastPastOrderDOS);

    int insert(ForecastPastOrderDO record);

    int insertSelective(ForecastPastOrderDO record);

    List<ForecastPastOrderDO> selectByExample(ForecastPastOrderDOExample example);

    ForecastPastOrderDO selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ForecastPastOrderDO record, @Param("example") ForecastPastOrderDOExample example);

    int updateByExample(@Param("record") ForecastPastOrderDO record, @Param("example") ForecastPastOrderDOExample example);

    int updateByPrimaryKeySelective(ForecastPastOrderDO record);

    int updateByPrimaryKey(ForecastPastOrderDO record);
}