package TreeSetDemo;

import java.util.Map;
import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args)
    {
        HashMap<Integer, String> HM = new HashMap<>(Map.of(0,"A",1,"B",2,"C",3,"D"));

        HM.put(4, "E");
        HM.put(5, "F");
        HM.put(6, "G");

        System.out.println(HM);
    }
}