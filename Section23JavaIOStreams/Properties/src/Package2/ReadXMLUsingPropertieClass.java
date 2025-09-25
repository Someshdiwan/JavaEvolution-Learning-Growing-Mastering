package Package2;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadXMLUsingPropertieClass {
    public static void main(String[] args)throws Exception {
        Properties p = new Properties();
        p.loadFromXML(new FileInputStream("/Users/somesh/Java SE/JavaEvolution-Learning-Growing-Mastering/Section23JavaIOStreams/Properties/src/Package2/Person.xml"));

        System.out.println(p);
        System.out.println(p.getProperty("Name: "));
    }
}
