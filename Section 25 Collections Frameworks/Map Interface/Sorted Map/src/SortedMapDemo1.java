import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapDemo1 {
    public static void main(String[] args) {
        SortedMap<Integer, String> map = new TreeMap<>();
        // In SortedMap order is maintained low to high (natural order for Integer keys).

        // If you want descending order, you could construct TreeMap with a comparator:
        // SortedMap<Integer, String> map = new TreeMap<>((a,b)->b-a);

        map.put(91, "Vivek");
        map.put(99, "Shubham");
        map.put(78, "Mohit");
        map.put(77, "Vipul");

        // Print the whole map (entries are shown in ascending key order)
        System.out.println(map);

        // First (smallest) key in the map
        System.out.println(map.firstKey());

        // Last (largest) key in the map
        System.out.println(map.lastKey());

        // headMap(91) -> returns a view of the portion whose keys are strictly less than 91
        System.out.println(map.headMap(91));

        // tailMap(91) -> returns a view of the portion whose keys are greater than or equal to 91
        System.out.println(map.tailMap(91));

        // Example note: subMap() can be used for a range view (not shown here)
        // map.subMap(fromKey, toKey)

        // Sorting is based on keys (not values)
        System.out.println(map);

        // Get value by key
        System.out.println(map.get(77));

        // Check existence of a key
        System.out.println(map.containsKey(78));

        // Check existence of a value (note: containsValue checks values, not keys)
        System.out.println(map.containsValue(77));
    }
}

/*
•	TreeMap implements SortedMap and keeps entries sorted by keys.
•	Using a TreeMap<Integer, String> will order entries by Integer natural order (ascending).
•	firstKey() / lastKey() return the smallest / largest key respectively (according to the map’s ordering).
•	headMap(k) returns a view with keys < k.
•	tailMap(k) returns a view with keys >= k.
•	get(key), containsKey(key), and containsValue(value) are standard lookup operations
(note containsValue searches values, so containsValue(77) is false here because 77 is a key not a value).

Why ordering matters
•	TreeMap uses a balanced tree (Red-Black tree) internally.
•	Most operations are O(log n): put, get, remove, navigation methods.
•	If you need fast unordered lookups and don’t care about order, HashMap is typically faster (O(1) avg).
•	Use TreeMap when you need sorted traversal or range queries (subMap/headMap/tailMap).

Important gotchas / reminders
•	TreeMap does NOT accept null keys (will throw NullPointerException). It does accept null values.
•	If you supply a custom comparator (e.g., descending),
    all ordering and navigation semantics change to follow that comparator.
•	headMap and tailMap return views — modifying them modifies the original map.

How keys are ordered:
Inserted keys: 91, 99, 78, 77

Tree in-order traversal (ascending):
    77  78  91  99

Printed map: {77=Vipul, 78=Mohit, 91=Vivek, 99=Shubham}
*/
