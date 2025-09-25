import java.util.Enumeration;
import java.util.Hashtable;

public class HashtableEnumerationDemo {
    public static void main(String[] args) {
        Hashtable<Integer, String> ht = new Hashtable<>();
        ht.put(1, "A");
        ht.put(2, "BZ"); // assume compute already applied
        ht.put(3, "C");
        ht.put(7, "Z7");

        // Enumeration of values
        Enumeration<String> valuesEnum = ht.elements();

        System.out.println("Values via Enumeration:");
        while (valuesEnum.hasMoreElements()) {
            String val = valuesEnum.nextElement();
            System.out.println(val);
        }

        // Enumeration of keys
        Enumeration<Integer> keysEnum = ht.keys();

        System.out.println("\nKeys via Enumeration:");
        while (keysEnum.hasMoreElements()) {
            Integer k = keysEnum.nextElement();
            System.out.println(k);
        }

        /*
         - Enumeration is the old style for iterating Hashtable.
         - For modern collections prefer Iterator or forEach.
         - Hashtable is synchronized; Enumeration does not support fail-fast semantics like Iterator.
           iterating values() and keys(), Shows legacy-style iteration used with Hashtable
           (Enumeration rather than Iterator).
        */
    }
}
