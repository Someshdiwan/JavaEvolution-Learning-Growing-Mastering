import java.util.Collection;
import java.util.Comparator;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapDemo3 {
    public static void main(String[] args) {
        // SortedMap is an interface. TreeMap is a common implementation that
        // keeps keys in sorted order (natural order by default).
        SortedMap<String, Integer> map = new TreeMap<>();

        // Put some entries
        map.put("Vivek", 91);
        map.put("Shubham", 99);
        map.put("Mohit", 78);
        map.put("Vipul", 77);

        // Print full map (keys in sorted order)
        System.out.println("Full map (natural order): " + map);

        // firstKey() and lastKey()
        System.out.println("First key: " + map.firstKey()); // smallest key
        System.out.println("Last key:  " + map.lastKey());  // largest key

        // headMap(toKey): returns a view of the map whose keys are strictly < toKey
        System.out.println("headMap(\"Vivek\"): " + map.headMap("Vivek"));

        // tailMap(fromKey): returns a view of the map whose keys are >= fromKey
        System.out.println("tailMap(\"Vivek\"): " + map.tailMap("Vivek"));

        // subMap(fromKey, toKey): keys in [fromKey, toKey)
        System.out.println("subMap(\"Mohit\", \"Vivek\"): " + map.subMap("Mohit", "Vivek"));

        // keySet(), values(), entrySet() - examples of views
        Set<String> keys = map.keySet();
        Collection<Integer> values = map.values();
        System.out.println("Keys view:   " + keys);
        System.out.println("Values view: " + values);

        // containsKey / containsValue / get
        System.out.println("Contains key 'Mohit'?   " + map.containsKey("Mohit"));
        System.out.println("Contains value 100?     " + map.containsValue(100));
        System.out.println("Value for 'Vipul':     " + map.get("Vipul"));

        // Demonstrate custom comparator (descending) by creating a new TreeMap
        SortedMap<Integer, String> descMap = new TreeMap<>(Comparator.reverseOrder());
        descMap.put(91, "Vivek");
        descMap.put(99, "Shubham");
        descMap.put(78, "Mohit");
        descMap.put(77, "Vipul");
        System.out.println("Descending-key TreeMap: " + descMap);

        // firstKey / lastKey reflect ordering of the map
        System.out.println("First key in descending map (highest): " + descMap.firstKey());
        System.out.println("Last key in descending map  (lowest):  " + descMap.lastKey());
    }
}
