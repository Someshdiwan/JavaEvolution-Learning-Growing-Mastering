package Properties;

import java.io.FileOutputStream;
import java.util.Properties;

public class PropertiesDemo {
    public static void main(String[] args)throws Exception {
        Properties p = new Properties();

        p.setProperty("Brand Name: ", "Dell");
        p.setProperty("Processor: ", "i7");
        p.setProperty("OS: ", "Windows");
        p.setProperty("Model: ", "Latitude");

        // Properties class stores configuration settings in key-value pairs
        // It is commonly used for storing application settings, configurations, or metadata

        p.store(new FileOutputStream("C://Users//somes//Downloads//JAVA SE//Section25CollectionFramework//src//Properties//MyData.txt"),"laptop" );

        p.storeToXML(new FileOutputStream("C://Users//somes//Downloads//JAVA SE//Section25CollectionFramework//src//Properties//Laptop.xml"), "Properties XML File");

        System.out.println(p);
    }
}