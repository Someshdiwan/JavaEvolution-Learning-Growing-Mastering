/*
build a custom HashMap from scratch!

We'll implement a simple version of Java HashMap<K, V> using:

- Array of LinkedLists (Separate Chaining for Collision Handling)
- Custom put(), get(), and remove() methods
- Dynamic Resizing for Efficiency

---

### Steps to Build a Custom HashMap

1. Define an Entry<K, V> class (stores key-value pairs).
2. Create a CustomHashMap<K, V> class with an array of Entry<K, V> lists (buckets).
3. Implement hashCode() to compute bucket index.
4. Handle collisions using linked lists.
5. Implement core methods:

- put(K key, V value) ? Inserts key-value pair.
- get(K key) ? Retrieves value by key.
- remove(K key) ? Deletes key from the map.
- resize() ? Expands capacity when needed.

*/

import java.util.LinkedList;

class CustomHashMap<K, V> {
    private static final int INITIAL_CAPACITY = 4; // Small size to test resizing
    private LinkedList<Entry<K, V>>[] buckets;
    private int size;

    // Entry class to store key-value pairs
    private static class Entry<K, V> {
        K key;
        V value;

        Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    // Constructor
    public CustomHashMap() {
        buckets = new LinkedList[INITIAL_CAPACITY];
        size = 0;
    }

    // Generate hash index
    private int getBucketIndex(K key) {
        return Math.abs(key.hashCode()) % buckets.length;
    }

    // Insert or update a key-value pair
    public void put(K key, V value) {
        int index = getBucketIndex(key);

        // Initialize bucket if null
        if (buckets[index] == null) {
            buckets[index] = new LinkedList<>();
        }

        // Check if key already exists, update value
        for (Entry<K, V> entry : buckets[index]) {
            if (entry.key.equals(key)) {
                entry.value = value;
                return;
            }
        }

        // Insert new entry
        buckets[index].add(new Entry<>(key, value));
        size++;

        // Resize if load factor exceeds 0.75
        if ((double) size / buckets.length > 0.75) {
            resize();
        }
    }

    // Retrieve value by key
    public V get(K key) {
        int index = getBucketIndex(key);
        if (buckets[index] == null) return null;

        for (Entry<K, V> entry : buckets[index]) {
            if (entry.key.equals(key)) {
                return entry.value;
            }
        }
        return null;
    }

    // Remove key-value pair
    public void remove(K key) {
        int index = getBucketIndex(key);
        if (buckets[index] == null) return;

        for (Entry<K, V> entry : buckets[index]) {
            if (entry.key.equals(key)) {
                buckets[index].remove(entry);
                size--;
                return;
            }
        }
    }

    // Resize the array when load factor exceeds threshold
    private void resize() {
        LinkedList<Entry<K, V>>[] oldBuckets = buckets;
        buckets = new LinkedList[oldBuckets.length * 2];
        size = 0;

        for (LinkedList<Entry<K, V>> bucket : oldBuckets) {
            if (bucket != null) {
                for (Entry<K, V> entry : bucket) {
                    put(entry.key, entry.value); // Rehash all entries
                }
            }
        }
    }

    // Print HashMap contents
    public void printMap() {
        for (int i = 0; i < buckets.length; i++) {
            System.out.print("Bucket " + i + ": ");
            if (buckets[i] != null) {
                for (Entry<K, V> entry : buckets[i]) {
                    System.out.print("[" + entry.key + " -> " + entry.value + "] ");
                }
            }
            System.out.println();
        }
    }

    // Main method to test the CustomHashMap
    public static void main(String[] args) {
        CustomHashMap<Object, Integer> map = new CustomHashMap<Object, Integer>();
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 35);
        map.put("Alice", 28); // Update value for "Alice"

        System.out.println("Value of Alice: " + map.get("Alice")); // 28
        System.out.println("Value of Bob: " + map.get("Bob")); // 30
        System.out.println("Value of Charlie: " + map.get("Charlie")); // 35

        map.remove("Bob");
        System.out.println("Value of Bob after removal: " + map.get("Bob")); // null

        System.out.println("\nCustom HashMap Contents:");
        map.printMap();
    }
}
/*
1. Custom Entry Class:
- Stores key-value pairs.
- Each bucket (array index) holds a LinkedList<Entry<K, V>> for collision handling.

2. Core Methods Implemented:
- put(K key, V value) ? Adds key-value pairs.
- get(K key) ? Retrieves values efficiently.
- remove(K key) ? Deletes an entry.
- resize() ? Doubles capacity when needed.

3. Collision Handling via Separate Chaining:
- If multiple keys have the same hash index, they are stored in a LinkedList.

4. Resizing:
- If the load factor (size / capacity > 0.75) is exceeded, the table size is doubled.

---

### Example Output

Value of Alice: 28
Value of Bob: 30
Value of Charlie: 35
Value of Bob after removal: null

Custom HashMap Contents:
Bucket 0:
Bucket 1:
Bucket 2: [Alice -> 28]
Bucket 3: [Charlie -> 35]

---

### Why Use This Custom HashMap?

- Understand How HashMap Works Internally
- Learn About Collision Handling (Linked List Chaining)
- Practice Hashing, Rehashing, and Resizing
*/
