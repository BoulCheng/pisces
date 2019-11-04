package so.dian.pisces.dao.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import so.dian.pisces.domain.ForecastFutureAmountDO;
import so.dian.pisces.domain.ForecastFutureAmountDOExample;

public interface ForecastFutureAmountMapper {
    long countByExample(ForecastFutureAmountDOExample example);

    int deleteByExample(ForecastFutureAmountDOExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ForecastFutureAmountDO record);

    int batchInsert(@Param("items") List<ForecastFutureAmountDO> forecastFutureAmountDOS);

    int insertSelective(ForecastFutureAmountDO record);

    List<ForecastFutureAmountDO> selectByExample(ForecastFutureAmountDOExample example);

    ForecastFutureAmountDO selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ForecastFutureAmountDO record, @Param("example") ForecastFutureAmountDOExample example);

    int updateByExample(@Param("record") ForecastFutureAmountDO record, @Param("example") ForecastFutureAmountDOExample example);

    int updateByPrimaryKeySelective(ForecastFutureAmountDO record);

    int updateByPrimaryKey(ForecastFutureAmountDO record);
}