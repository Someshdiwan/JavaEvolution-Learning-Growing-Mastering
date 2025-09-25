package Package1;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesDemo2 {
    public static void main(String[] args) throws Exception {
        Properties p1 = new Properties();

        p1.load(new FileInputStream("/Users/somesh/Java SE/JavaEvolution-Learning-Growing-Mastering/Section23JavaIOStreams/Properties/src/Package1/Drink.txt"));

        System.out.println(p1.getProperty("Name"));
        System.out.println(p1.getProperty("Brand"));
        System.out.println(p1.getProperty("Type"));
        System.out.println(p1);
    }
}
