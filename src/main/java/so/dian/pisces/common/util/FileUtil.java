package so.dian.pisces.common.util;

import java.io.InputStream;

/**
 * @author yuanming
 * Created on 2019/10/23
 * Description
 */
public class FileUtil {

    public static InputStream getFileInputStream(){
        InputStream inputStream = null;
        try {
            inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("lightgbm_1028_country_orders_online_2500_64.pmml");
//            inputStream = new FileInputStream("/Users/apple/Documents/xd/lightgbm_1028_country_orders_online_2500.pmml");
        } catch (Exception e) {
            //log
            e.printStackTrace();
        }
        return inputStream;
    }

}
