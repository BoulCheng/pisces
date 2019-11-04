package so.dian.pisces.dao.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import so.dian.pisces.domain.ForecastPastAmountDO;
import so.dian.pisces.domain.ForecastPastAmountDOExample;

public interface ForecastPastAmountMapper {
    long countByExample(ForecastPastAmountDOExample example);

    int deleteByExample(ForecastPastAmountDOExample example);

    int deleteByPrimaryKey(Integer id);

    int batchInsert(@Param("items") List<ForecastPastAmountDO> forecastPastAmountDOS);

    int insert(ForecastPastAmountDO record);

    int insertSelective(ForecastPastAmountDO record);

    List<ForecastPastAmountDO> selectByExample(ForecastPastAmountDOExample example);

    ForecastPastAmountDO selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ForecastPastAmountDO record, @Param("example") ForecastPastAmountDOExample example);

    int updateByExample(@Param("record") ForecastPastAmountDO record, @Param("example") ForecastPastAmountDOExample example);

    int updateByPrimaryKeySelective(ForecastPastAmountDO record);

    int updateByPrimaryKey(ForecastPastAmountDO record);
}