import java.util.NavigableMap;
import java.util.TreeMap;
import java.util.Map;

/**
 * Demonstrates NavigableMap features (TreeMap implements NavigableMap).
 *
 * This focuses on navigation methods:
 * - lowerKey, ceilingKey, higherEntry, descendingMap
 */

public class NavigableMapDemo {
    public static void main(String[] args) {
        NavigableMap<Integer, String> navigableMap = new TreeMap<>();

        // Insert entries (TreeMap uses natural ordering by default)
        navigableMap.put(1, "One");
        navigableMap.put(5, "Five");
        navigableMap.put(3, "Three");

        // Print the map (natural ascending order of keys)
        System.out.println(navigableMap); // {1=One, 3=Three, 5=Five}

        // Find the greatest key strictly less than 4
        System.out.println("lowerKey(4): " + navigableMap.lowerKey(4));

        // Find the least key greater than or equal to 3
        System.out.println("ceilingKey(3): " + navigableMap.ceilingKey(3));

        // Find the entry with the least key strictly greater than 1
        Map.Entry<Integer, String> higher = navigableMap.higherEntry(1);
        System.out.println("higherEntry(1): " + higher);

        // Get a reverse-order view of the map
        System.out.println("descendingMap(): " + navigableMap.descendingMap());
    }
}

/*
Insert: 1, 5, 3

Tree (in-order traversal): 1 3 5
Printed map: {1=One, 3=Three, 5=Five}
*/
