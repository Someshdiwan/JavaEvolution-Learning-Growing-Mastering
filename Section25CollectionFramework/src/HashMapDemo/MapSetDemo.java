package HashMapDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapSetDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(31,"Smith");
        map.put(11,"Shubham");
        map.put(2,"John");

        System.out.println("Original Map: " + map);

        //List of entries.
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for (Map.Entry<Integer, String> entry : entries)
        {
            // Print key and value
            System.out.println(entry.getKey() + ": " + entry.getValue());

            // Print the value in uppercase
            System.out.println(entry.getValue().toUpperCase());
        }
        System.out.println("Final Map: " + map);
    }
}
/*
The reason your HashMap appears to print in natural order (sorted order of keys) in this case is purely coincidental and
depends on the internal hashing mechanism.

Why Does It Appear in Sorted Order?

HashMap does not guarantee order – The ordering of elements depends on the hash function and bucket allocation.

Small number of elements – When a HashMap has only a few elements, it sometimes places them in an order that may seem
sorted, but this is not reliable.

JDK Version & HashMap implementation – In some versions of Java, the hash function and bucket assignments may make it
appear sorted in certain cases, but this should never be relied upon.
*/