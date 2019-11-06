package so.dian.pisces.job;

import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;
import org.springframework.beans.factory.annotation.Autowired;
import so.dian.pisces.manager.SeerManager;

/**
 * @author yuanming
 * Created on 2019/11/6
 * Description
 */
public class SeerJob implements SimpleJob {

    @Autowired
    private SeerManager seerManager;

    @Override
    public void execute(ShardingContext shardingContext) {
        seerManager.predict();
    }
}
