package Properties;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadXMLUsingPropertieClass {
    public static void main(String[] args)throws Exception
    {
        Properties p = new Properties();

        p.loadFromXML(new FileInputStream("C://Users//somes//Downloads//JAVA SE//Section25CollectionFramework//src//Properties//Person.xml"));

        System.out.println(p);

        System.out.println(p.getProperty("Name: "));
    }
}
