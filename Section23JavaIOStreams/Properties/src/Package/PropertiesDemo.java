package Package;

import java.io.FileOutputStream;
import java.util.Properties;

public class PropertiesDemo {
    public static void main(String[] args)throws Exception {
        Properties p = new Properties();

        p.setProperty("Brand: ", "Apple Mac Book Air");
        p.setProperty("Brand Name: ", "Dell");
        p.setProperty("Processor: ", "i7");
        p.setProperty("OS: ", "Windows");
        p.setProperty("Model: ", "Latitude");

        // Property class stores configuration settings in key-value pairs
        // It is commonly used for storing application settings, configurations, or metadata

        p.store(new FileOutputStream("/Users/somesh/Java SE/JavaEvolution-Learning-Growing-Mastering/Section23JavaIOStreams/Properties/src/Package/MyData.txt"),"laptop" );

        p.storeToXML(new FileOutputStream("/Users/somesh/Java SE/JavaEvolution-Learning-Growing-Mastering/Section23JavaIOStreams/Properties/src/Package/Laptop.xml"), "Properties XML File");

        System.out.println(p);
    }
}
