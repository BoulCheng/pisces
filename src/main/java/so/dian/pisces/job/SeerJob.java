package so.dian.pisces.job;

import com.alibaba.fastjson.JSON;
import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import so.dian.pisces.manager.SeerManager;

/**
 * @author yuanming
 * Created on 2019/11/6
 * Description
 */
public class SeerJob implements SimpleJob {
    private Logger log = LoggerFactory.getLogger(getClass());

    @Autowired
    private SeerManager seerManager;

    @Override
    public void execute(ShardingContext shardingContext) {
        log.info("SeerJob start... shardingContext:{}", JSON.toJSONString(shardingContext));
        seerManager.predict();
    }
}
