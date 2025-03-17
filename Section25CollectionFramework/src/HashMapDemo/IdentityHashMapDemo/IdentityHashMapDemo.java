package HashMapDemo.IdentityHashMapDemo;

import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new IdentityHashMap<>();

        /*
        This class implements the Map interface with a hash table, using reference-equality in place of
        object-equality when comparing keys (and values). In other words, in an IdentityHashMap,
        two keys k1 and k2 are considered equal if and only if (k1==k2). (In normal Map implementations (like HashMap)
        two keys k1 and k2 are considered equal if and only if (k1==null ? k2==null : k1.equals(k2)).)
        */

        //Map<String, Integer> map = new HashMap<>();
        //Uncomment and run the code.

        String key1 = new String("Akshit");
        String key2 = new String("Akshit");

        map.put(key1, 90);
        map.put(key2, 92);

        System.out.println(System.identityHashCode(key1));
        System.out.println(System.identityHashCode(key2));

        //Equals se check karte hai HashCode barabar hai ki nahi.
        //otherwise Insert it into LinkedList.
        //Object ka Hash Code Run hoga. both hashCode are object and both different here.

        //Hashcode and == Equality check hoti hai yaha par refrences se memeory address check hota hai.

        //System.out.println(key1.equals(key2));
        System.out.println(map);
    }
}