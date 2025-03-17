package HashMapDemo.LinkedHashMapDemo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapED2 {
    public static void main(String[] args) {

        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>(11, 0.3f, true); // double linked list
        linkedHashMap.put("Orange", 10);
        linkedHashMap.put("Apple", 20);
        linkedHashMap.put("Guava", 13);

        linkedHashMap.get("Apple");
        linkedHashMap.get("Orange");
        linkedHashMap.get("Guava");
        linkedHashMap.get("Apple");
        linkedHashMap.get("Orange");
        linkedHashMap.get("Apple");
        linkedHashMap.get("Guava");

        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet())
        {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        HashMap<String, Integer> hashMap = new HashMap<>();
        LinkedHashMap linkedHashMap1 = new LinkedHashMap(hashMap);

        hashMap.put("Shubham", 91);
        hashMap.put("Bob", 80);
        hashMap.put("Akshit", 78);

        Integer res = hashMap.getOrDefault("Vipul", 0);
        hashMap.put("Shubham", 92);
        System.out.println(hashMap);
        /*Returns the value to which the specified key is mapped, or defaultValue if this map contains no mapping for the key.

        Overrides:
        getOrDefault in interface Map

        Params: key – the key whose associated value is to be returned defaultValue – the default mapping of the key
        Returns:
        the value to which the specified key is mapped, or defaultValue if this map contains no mapping for the key*/
    }
}