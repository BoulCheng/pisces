package so.dian.pisces;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import so.dian.pisces.config.SeerConfiguration;
import so.dian.pisces.manager.SeerManager;

/**
 * @author yuanming
 * Created on 2019/10/16
 * Description
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class SeerTest {

    @Autowired
    private SeerManager seerManager;

    @Test
    public void predict() {
        seerManager.predict("20191025", SeerConfiguration.RecursiveTaskEnum.AMOUNT);
    }
}