import java.util.SortedMap;
import java.util.TreeMap;

/**
 * Demonstrates SortedMap using TreeMap with a custom comparator (reverse order).
 * This file focuses on basic SortedMap operations: put, get, containsKey, containsValue, and views.

 * Note: TreeMap implements SortedMap and keeps keys in sorted order determined by either:
 *  - natural ordering (Comparable), or
 *  - a provided Comparator (as shown here).
 */

public class SortedMapDemo {
    public static void main(String[] args) {
        // Create a SortedMap backed by a TreeMap with a custom comparator (descending order).
        SortedMap<Integer, String> map = new TreeMap<>((a, b) -> b - a);

        // Insert entries (keys will be kept in descending order because of comparator).
        map.put(91, "Vivek");
        map.put(99, "Shubham");
        map.put(78, "Mohit");
        map.put(77, "Vipul");

        // Access/queries (these do not change map ordering)
        map.get(77);            // returns "Vipul"
        map.containsKey(78);    // true
        map.containsValue(77);  // false (77 is a key, not a value)

        // Uncomment the lines below to inspect map contents and views:
        // System.out.println(map);               // Shows entries in descending key order
        // System.out.println(map.firstKey());    // Highest key (because we used descending comparator)
        // System.out.println(map.lastKey());     // Lowest key
        // System.out.println(map.headMap(91));   // Keys strictly greater (in comparator order) than 91
        // System.out.println(map.tailMap(91));   // Keys <= 91 in this comparator ordering
    }
}

/*
Insert: 91, 99, 78, 77

Comparator: descending
Print order: 99, 91, 78, 77
map.firstKey() -> 99
map.lastKey()  -> 77
*/
