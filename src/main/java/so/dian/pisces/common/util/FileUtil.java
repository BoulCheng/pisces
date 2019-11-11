package so.dian.pisces.common.util;

import so.dian.pisces.config.SeerConfiguration;

import java.io.InputStream;

/**
 * @author yuanming
 * Created on 2019/10/23
 * Description
 */
public class FileUtil {

    public static InputStream getFileInputStream(SeerConfiguration.RecursiveTaskEnum recursiveTaskEnum){
        InputStream inputStream = null;
        if (recursiveTaskEnum.isOrder()) {
            inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("lightgbm_1028_country_orders_online_2500_64.pmml");
        } else if (recursiveTaskEnum.isAmount()) {
            inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("lightgbm_1028_country_amount_online_2500_64.pmml");
        }
        return inputStream;
    }

}
