package HashMapDemo;

import java.util.Hashtable;

public class HashTable {
    public static void main(String[] args) {
        Hashtable<Integer, String> hashtable = new Hashtable<>();

        //HashTable is Synchronized
        //No Null key or value
        //Legacy class, ConcurrentHashMap
        //Slower than HashMap
        //only linked list in case of collision
        //all methods are synchronized

        hashtable.put(1,"Apple");
        hashtable.put(2,"Banana");
        hashtable.put(3,"Cherry");
        System.out.println(hashtable);
        System.out.println("Value for key 2: "+ hashtable.get(2));

        System.out.println(hashtable.containsKey(2));

        hashtable.put(null, "value"); // Throws exception
        hashtable.put(4, null);   // Throws exception*/
    }
}