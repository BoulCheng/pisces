package so.dian.pisces.dao.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import so.dian.pisces.domain.ForecastFutureOrderDO;
import so.dian.pisces.domain.ForecastFutureOrderDOExample;

public interface ForecastFutureOrderMapper {
    long countByExample(ForecastFutureOrderDOExample example);

    int deleteByExample(ForecastFutureOrderDOExample example);

    int deleteByPrimaryKey(Integer id);

    int batchInsert(@Param("items") List<ForecastFutureOrderDO> forecastPastOrderDOS);

    int insert(ForecastFutureOrderDO record);

    int insertSelective(ForecastFutureOrderDO record);

    List<ForecastFutureOrderDO> selectByExample(ForecastFutureOrderDOExample example);

    ForecastFutureOrderDO selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ForecastFutureOrderDO record, @Param("example") ForecastFutureOrderDOExample example);

    int updateByExample(@Param("record") ForecastFutureOrderDO record, @Param("example") ForecastFutureOrderDOExample example);

    int updateByPrimaryKeySelective(ForecastFutureOrderDO record);

    int updateByPrimaryKey(ForecastFutureOrderDO record);
}