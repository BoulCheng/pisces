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
        try {
            if (SeerConfiguration.RecursiveTaskEnum.ORDER.equals(recursiveTaskEnum)) {
                inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("lightgbm_1028_country_orders_online_2500_64.pmml");
            } else if (SeerConfiguration.RecursiveTaskEnum.AMOUNT.equals(recursiveTaskEnum)) {
                inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("lightgbm_1028_country_amount_online_2500_64.pmml");
            }
//            inputStream = new FileInputStream("/Users/apple/Documents/xd/lightgbm_1028_country_orders_online_2500.pmml");
        } catch (Exception e) {
            //log
            e.printStackTrace();
        }
        return inputStream;
    }

}
