package HashMapDemo.LinkedHashMapDemo;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K, V> extends LinkedHashMap<K, V> {
    private int capacity;

    public LRUCache(int capacity) {
        super(capacity, 0.75f, true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > capacity;
    }

    public static void main(String[] args) {
        LRUCache<String, Integer> studentMap = new LRUCache<>(3);
        studentMap.put("Bob", 99);
        studentMap.put("Alice", 89);
        studentMap.put("Ram", 91);
        studentMap.put("Bob", 100);
        studentMap.put("Vipul", 89);

        System.out.println(studentMap);
    }
}
/*
the most recently accessed element moves to the end. This method ensures that the eldest entry (least recently used)
is removed once the cache exceeds the given capacity.

studentMap.put("Bob", 99);   ["Bob"]
studentMap.put("Alice", 89); ["Bob", "Alice"]
studentMap.put("Ram", 91);   ["Bob", "Alice", "Ram"]
studentMap.put("Bob", 100);  Bob is accessed again -> moves to the end ["Alice", "Ram", "Bob"]
studentMap.put("Vipul", 89); "Alice" (least recently used) is removed -> ["Ram", "Bob", "Vipul"]
*/
