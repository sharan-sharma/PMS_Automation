package PropertyUtility;

import java.io.FileInputStream;
import java.util.Properties;

public class propertyUtilities {
    static String path="E:/PMS/src/main/resources/sheets/propertiesfile";
    public static String readdata(String key)
    {
        Properties prop= new Properties();
        try {
            FileInputStream fis=new FileInputStream(path);
            prop.load(fis);
        } catch (Exception e) {
            // TODO: handle exception
        }
        return prop.getProperty(key);

    }
}