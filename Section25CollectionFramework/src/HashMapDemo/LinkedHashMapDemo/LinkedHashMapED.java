package HashMapDemo.LinkedHashMapDemo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapED {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        //But it maintain order.

        linkedHashMap.put("Orange",10);
        linkedHashMap.put("Apple",20);
        linkedHashMap.put("Guava",13);
        for(Map.Entry<String,Integer> entry : linkedHashMap.entrySet())
        {
            System.out.println(entry.getKey()+": "+entry.getValue());
        }

        System.out.println("\n");

        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Orange",10);
        hashMap.put("Apple",20);
        hashMap.put("Guava",13);
        //HashMap Doesn't maintain any order.

        for(Map.Entry<String,Integer> entry : hashMap.entrySet())
        {
            System.out.println(entry.getKey()+": "+entry.getValue());
        }
    }
}

//Key Takeaways
//LinkedHashMap maintains insertion order.
//HashMap does not maintain any order—it is based on hash codes.
//The difference in ordering is clearly visible in the output.