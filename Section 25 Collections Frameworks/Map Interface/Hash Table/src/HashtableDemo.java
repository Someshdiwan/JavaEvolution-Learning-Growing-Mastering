import java.util.Enumeration;
import java.util.Hashtable;

public class HashtableDemo {
    public static void main(String[] args) {
        // Older collection class (synchronized). Non-generic raw usage (keeps your original logic).
        Hashtable ht = new Hashtable();

        // Put some entries
        ht.put(1, "A");
        ht.put(2, "B");
        ht.put(3, "C");
        ht.put(4, "D");
        ht.put(5, "E");

        // get returns Object because we used raw Hashtable — cast to String to use it as string.
        String s = (String) ht.get(3);
        System.out.println("Value at key 3: " + s);

        // Demonstrate compute: update value at key 2 by appending "Z" (B -> BZ)
        ht.compute(2, (k, v) -> v + "Z");

        // computeIfAbsent: if key 7 not present, compute and put "Z7"
        ht.computeIfAbsent(7, (k) -> "Z" + k);

        // Enumerations for values and keys (legacy iteration style)
        Enumeration e = ht.elements(); // enumeration of values
        Enumeration e1 = ht.keys();    // enumeration of keys

        System.out.println("\nHashtable Values:");
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }

        System.out.println("\nHashtable Keys:");
        while (e1.hasMoreElements()) {
            System.out.println(e1.nextElement());
        }

        /* Notes:
           This shows put/get, compute(), computeIfAbsent(), and enumeration over elements/keys.
           This file kept your original raw Hashtable usage and cast for get().
           Hashtable is synchronized (legacy); prefer ConcurrentHashMap / HashMap in new code.
        */
    }
}
