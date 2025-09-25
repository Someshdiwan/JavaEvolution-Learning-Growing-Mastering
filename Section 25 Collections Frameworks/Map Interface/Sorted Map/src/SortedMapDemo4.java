import java.util.*;

public class SortedMapDemo4 {
    public static void main(String[] args) {
        // SortedMap is an interface, TreeMap is its implementation.
        // TreeMap maintains keys in sorted (natural) order by default.
        SortedMap<String, Integer> sortedMap = new TreeMap<>();

        // Adding entries
        sortedMap.put("Vivek", 91);
        sortedMap.put("Shubham", 99);
        sortedMap.put("Mohit", 78);
        sortedMap.put("Vipul", 77);

        // Printing full map - automatically sorted by keys (ascending order)
        System.out.println("Full Map: " + sortedMap);

        // firstKey() - smallest key
        System.out.println("First Key: " + sortedMap.firstKey());

        // lastKey() - largest key
        System.out.println("Last Key: " + sortedMap.lastKey());

        // headMap(toKey) - keys < toKey
        System.out.println("headMap(\"Vivek\"): " + sortedMap.headMap("Vivek"));

        // tailMap(fromKey) - keys >= fromKey
        System.out.println("tailMap(\"Vivek\"): " + sortedMap.tailMap("Vivek"));

        // subMap(fromKey, toKey) - keys in [fromKey, toKey)
        System.out.println("subMap(\"Mohit\", \"Vivek\"): " + sortedMap.subMap("Mohit", "Vivek"));

        // containsKey() and containsValue()
        System.out.println("Contains key 'Shubham'? " + sortedMap.containsKey("Shubham"));
        System.out.println("Contains value 100? " + sortedMap.containsValue(100));

        // Get a value by key
        System.out.println("Value for 'Vipul': " + sortedMap.get("Vipul"));

        // Views
        System.out.println("Key Set: " + sortedMap.keySet());
        System.out.println("Values: " + sortedMap.values());


        // Example with custom Comparator
        SortedMap<Integer, String> descMap = new TreeMap<>(Comparator.reverseOrder());
        descMap.put(91, "Vivek");
        descMap.put(99, "Shubham");
        descMap.put(78, "Mohit");
        descMap.put(77, "Vipul");

        System.out.println("\nCustom Comparator (Descending Order): " + descMap);
        System.out.println("First Key (Highest): " + descMap.firstKey());
        System.out.println("Last Key  (Lowest): " + descMap.lastKey());
    }
}
