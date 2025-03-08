package Properties;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesDemo2 {
    public static void main(String[] args) throws Exception {
        Properties p1 = new Properties();

        p1.load(new FileInputStream("C://Users//somes//Downloads//JAVA SE//Section25CollectionFramework//src//Properties//Drink.txt"));

        System.out.println(p1.getProperty("Name"));
        System.out.println(p1.getProperty("Brand"));
        System.out.println(p1);
    }
}