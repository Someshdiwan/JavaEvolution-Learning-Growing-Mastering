package CustomHashMapDemo;

/*
extended version of the custom HashMap that includes:

- Iteration: Implements the Iterable interface so you can loop over all entries.
- Dynamic Size Tracking: A method (`size()`) returns the current number of key-value pairs.
- Load Factor Tuning: A configurable load factor (with getters and setters) and a constructor that accepts an initial capacity and load factor.

  Extended Custom HashMap Implementation
*/

import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class HashMapCustom<K, V> implements Iterable<HashMapCustom.Entry<K, V>> {
    private static final int DEFAULT_INITIAL_CAPACITY = 4;
    private static final double DEFAULT_LOAD_FACTOR = 0.75;

    private LinkedList<Entry<K, V>>[] buckets;
    private int size;
    private double loadFactor;

    // Entry class to store key-value pairs.
    public static class Entry<K, V> {
        K key;
        V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        @Override
        public String toString() {
            return "[" + key + " -> " + value + "]";
        }
    }

    // Default constructor.
    public HashMapCustom() {
        this(DEFAULT_INITIAL_CAPACITY, DEFAULT_LOAD_FACTOR);
    }

    // Constructor with custom initial capacity and load factor.
    public HashMapCustom(int initialCapacity, double loadFactor) {
        buckets = new LinkedList[initialCapacity];
        this.loadFactor = loadFactor;
        this.size = 0;
    }

    // Returns the current number of key-value pairs.
    public int size() {
        return size;
    }

    // Returns the current load factor.
    public double getLoadFactor() {
        return loadFactor;
    }

    // Allows tuning of the load factor.
    public void setLoadFactor(double loadFactor) {
        if (loadFactor <= 0) {
            throw new IllegalArgumentException("Load factor must be positive.");
        }
        this.loadFactor = loadFactor;
    }

    // Computes the bucket index for a given key.
    private int getBucketIndex(K key) {
        return Math.abs(key.hashCode()) % buckets.length;
    }

    // Inserts or updates a key-value pair.
    public void put(K key, V value) {
        int index = getBucketIndex(key);

        if (buckets[index] == null) {
            buckets[index] = new LinkedList<>();
        }

        // Update value if key exists.
        for (Entry<K, V> entry : buckets[index]) {
            if (entry.key.equals(key)) {
                entry.value = value;
                return;
            }
        }

        // Add new entry.
        buckets[index].add(new Entry<>(key, value));
        size++;

        // Resize if the load factor is exceeded.
        if ((double) size / buckets.length > loadFactor) {
            resize();
        }
    }

    // Retrieves the value associated with the key.
    public V get(K key) {
        int index = getBucketIndex(key);
        if (buckets[index] == null) {
            return null;
        }
        for (Entry<K, V> entry : buckets[index]) {
            if (entry.key.equals(key)) {
                return entry.value;
            }
        }
        return null;
    }

    // Removes the key-value pair.
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

    // Resizes the bucket array when the load factor threshold is exceeded.
    private void resize() {
        LinkedList<Entry<K, V>>[] oldBuckets = buckets;
        buckets = new LinkedList[oldBuckets.length * 2];
        size = 0; // Will be recalculated in rehashing

        for (LinkedList<Entry<K, V>> bucket : oldBuckets) {
            if (bucket != null) {
                for (Entry<K, V> entry : bucket) {
                    put(entry.key, entry.value); // Rehash each entry.
                }
            }
        }
    }

    // Prints the contents of the HashMap.
    public void printMap() {
        for (int i = 0; i < buckets.length; i++) {
            System.out.print("Bucket " + i + ": ");
            if (buckets[i] != null) {
                for (Entry<K, V> entry : buckets[i]) {
                    System.out.print(entry + " ");
                }
            }
            System.out.println();
        }
    }

    // Iterator to iterate over all entries in the CustomHashMap.
    @Override
    public Iterator<Entry<K, V>> iterator() {
        return new HashMapIterator();
    }

    private class HashMapIterator implements Iterator<Entry<K, V>> {
        private int bucketIndex = 0;
        private Iterator<Entry<K, V>> listIterator = null;

        public HashMapIterator() {
            // Move to the first non-empty bucket.
            advanceToNextNonEmptyBucket();
        }

        private void advanceToNextNonEmptyBucket() {
            while (bucketIndex < buckets.length && (buckets[bucketIndex] == null || buckets[bucketIndex].isEmpty())) {
                bucketIndex++;
            }
            if (bucketIndex < buckets.length) {
                listIterator = buckets[bucketIndex].iterator();
            }
        }

        @Override
        public boolean hasNext() {
            if (listIterator != null && listIterator.hasNext()) {
                return true;
            }
            int tempBucket = bucketIndex;
            while (++tempBucket < buckets.length) {
                if (buckets[tempBucket] != null && !buckets[tempBucket].isEmpty()) {
                    return true;
                }
            }
            return false;
        }

        @Override
        public Entry<K, V> next() {
            if (listIterator == null || !listIterator.hasNext()) {
                bucketIndex++;
                advanceToNextNonEmptyBucket();
            }
            if (listIterator == null || !listIterator.hasNext()) {
                throw new NoSuchElementException();
            }
            return listIterator.next();
        }
    }

    // Main method to test the extended CustomHashMap.
    public static void main(String[] args) {
        HashMapCustom<Object, Integer> map = new HashMapCustom<Object, Integer>();
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 35);
        map.put("Alice", 28); // Update value for "Alice"

        System.out.println("Value of Alice: " + map.get("Alice")); // 28
        System.out.println("Value of Bob: " + map.get("Bob"));       // 30
        System.out.println("Value of Charlie: " + map.get("Charlie"));// 35

        map.remove("Bob");
        System.out.println("Value of Bob after removal: " + map.get("Bob")); // null

        System.out.println("\nCustom HashMap Contents:");
        map.printMap();

        System.out.println("\nIterating over CustomHashMap entries:");
        for (HashMapCustom.Entry<Object, Integer> entry : map) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
/*
Explanation of Extensions:

- Iteration:

- The class now implements Iterable<Entry<K, V>> and provides an inner HashMapIterator that traverses each non-empty bucket

- You can use a for-each loop to iterate over all key-value pairs.

- Dynamic Size Tracking:
- The size field is updated on every put() and remove() call.
- The size() method returns the current count of entries.

- Load Factor Tuning:
 - The loadFactor field is configurable through constructors and the setLoadFactor() method.
 - The resize() method uses this load factor to determine when to double the bucket array.
*/
