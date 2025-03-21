package CustomHashMapDemo;

/*
extended version of the custom HashMap that includes:

- Iteration: Implements the Iterable interface so you can loop over all entries.
- Dynamic Size Tracking: A method (`size()`) returns the current number of key-value pairs.
- Load Factor Tuning: A configurable load factor (with getters and setters) and a constructor that accepts an initial capacity and load factor.

  Extended Custom HashMap Implementation
*/

/*import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class HashMapCustom<K, V> implements Iterable<HashMapCustom.Entry<K, V>> {
    // Default initial bucket count; starting small to conserve memory.
    private static final int DEFAULT_INITIAL_CAPACITY = 4;
    // Default load factor threshold; once exceeded, the map will resize.
    private static final double DEFAULT_LOAD_FACTOR = 0.75;

    // Array of buckets, where each bucket is a LinkedList of key-value pairs.
    private LinkedList<Entry<K, V>>[] buckets;
    // Tracks the total number of key-value pairs in the map.
    private int size;
    // The load factor determines when to increase the capacity of the buckets array.
    private double loadFactor;

    // Entry class to store key-value pairs.
    public static class Entry<K, V> {
        K key;
        V value;

        // Constructor to initialize an entry with a key and value.
        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        // Returns the key of this entry.
        public K getKey() {
            return key;
        }

        // Returns the value associated with the key.
        public V getValue() {
            return value;
        }

        // Provides a string representation of the entry.
        @Override
        public String toString() {
            return "[" + key + " -> " + value + "]";
        }
    }

    // Default constructor initializing the map with default capacity and load factor.
    public HashMapCustom() {
        this(DEFAULT_INITIAL_CAPACITY, DEFAULT_LOAD_FACTOR);
    }

    // Constructor that accepts an initial capacity and a custom load factor.
    public HashMapCustom(int initialCapacity, double loadFactor) {
        // Initialize buckets array with the given capacity.
        buckets = new LinkedList[initialCapacity];
        // Set the load factor.
        this.loadFactor = loadFactor;
        // Initialize size to 0 as no entries have been added yet.
        this.size = 0;
    }

    // Returns the current number of key-value pairs in the map.
    public int size() {
        return size;
    }

    // Returns the current load factor threshold.
    public double getLoadFactor() {
        return loadFactor;
    }

    // Allows tuning of the load factor after creation.
    public void setLoadFactor(double loadFactor) {
        if (loadFactor <= 0) {
            throw new IllegalArgumentException("Load factor must be positive.");
        }
        this.loadFactor = loadFactor;
    }

    // Computes the bucket index for a given key using its hash code.
    private int getBucketIndex(K key) {
        // Math.abs ensures non-negative result; modulus maps the key to a valid bucket index.
        return Math.abs(key.hashCode()) % buckets.length;
    }

    // Inserts a new key-value pair or updates the value if the key already exists.
    public void put(K key, V value) {
        int index = getBucketIndex(key);

        // Initialize the bucket if it does not exist.
        if (buckets[index] == null) {
            buckets[index] = new LinkedList<>();
        }

        // Check if the key already exists; if so, update its value.
        for (Entry<K, V> entry : buckets[index]) {
            if (entry.key.equals(key)) {
                entry.value = value;
                return;
            }
        }

        // Add a new entry if the key was not found.
        buckets[index].add(new Entry<>(key, value));
        size++;

        // If the number of entries exceeds the threshold defined by loadFactor,
        // resize the buckets array to maintain performance.
        if ((double) size / buckets.length > loadFactor) {
            resize();
        }
    }

    // Retrieves the value associated with the given key.
    public V get(K key) {
        int index = getBucketIndex(key);
        // Return null if the bucket for the key is not initialized.
        if (buckets[index] == null) {
            return null;
        }
        // Iterate through the bucket to find the matching key.
        for (Entry<K, V> entry : buckets[index]) {
            if (entry.key.equals(key)) {
                return entry.value;
            }
        }
        // Return null if the key is not found.
        return null;
    }

    // Removes the key-value pair associated with the given key.
    public void remove(K key) {
        int index = getBucketIndex(key);
        // If bucket is not initialized, nothing to remove.
        if (buckets[index] == null) return;

        // Iterate over the bucket and remove the entry with the matching key.
        for (Entry<K, V> entry : buckets[index]) {
            if (entry.key.equals(key)) {
                buckets[index].remove(entry);
                size--;
                return;
            }
        }
    }

    // Resizes the bucket array by doubling its size when the load factor is exceeded.
    private void resize() {
        // Save reference to the current buckets.
        LinkedList<Entry<K, V>>[] oldBuckets = buckets;
        // Create a new buckets array with double the capacity.
        buckets = new LinkedList[oldBuckets.length * 2];
        // Reset size to 0; it will be recalculated during rehashing.
        size = 0;

        // Rehash all existing entries into the new buckets array.
        for (LinkedList<Entry<K, V>> bucket : oldBuckets) {
            if (bucket != null) {
                for (Entry<K, V> entry : bucket) {
                    // Reinsert each entry; put() will recalculate its bucket index.
                    put(entry.key, entry.value);
                }
            }
        }
    }

    // Prints the contents of the HashMap, bucket by bucket.
    public void printMap() {
        for (int i = 0; i < buckets.length; i++) {
            System.out.print("Bucket " + i + ": ");
            if (buckets[i] != null) {
                // Print each entry in the current bucket.
                for (Entry<K, V> entry : buckets[i]) {
                    System.out.print(entry + " ");
                }
            }
            System.out.println();
        }
    }

    // Provides an iterator to traverse all key-value entries in the HashMap.
    @Override
    public Iterator<Entry<K, V>> iterator() {
        return new HashMapIterator();
    }

    // Inner class implementing the Iterator interface for HashMapCustom.
    private class HashMapIterator implements Iterator<Entry<K, V>> {
        // Current bucket index for iteration.
        private int bucketIndex = 0;
        // Iterator for the current bucket's linked list.
        private Iterator<Entry<K, V>> listIterator = null;

        // Constructor moves iterator to the first non-empty bucket.
        public HashMapIterator() {
            advanceToNextNonEmptyBucket();
        }

        // Advances bucketIndex and listIterator to the next bucket that is not empty.
        private void advanceToNextNonEmptyBucket() {
            while (bucketIndex < buckets.length && (buckets[bucketIndex] == null || buckets[bucketIndex].isEmpty())) {
                bucketIndex++;
            }
            // If a valid bucket is found, set listIterator to iterate over its entries.
            if (bucketIndex < buckets.length) {
                listIterator = buckets[bucketIndex].iterator();
            }
        }

        // Checks if there is a next element across buckets.
        @Override
        public boolean hasNext() {
            // If current bucket's iterator has a next element, return true.
            if (listIterator != null && listIterator.hasNext()) {
                return true;
            }
            // Otherwise, search for the next non-empty bucket.
            int tempBucket = bucketIndex;
            while (++tempBucket < buckets.length) {
                if (buckets[tempBucket] != null && !buckets[tempBucket].isEmpty()) {
                    return true;
                }
            }
            // No more elements found.
            return false;
        }

        // Returns the next entry in the iteration.
        @Override
        public Entry<K, V> next() {
            // If current bucket's iterator is exhausted, move to the next bucket.
            if (listIterator == null || !listIterator.hasNext()) {
                bucketIndex++;
                advanceToNextNonEmptyBucket();
            }
            // If still no valid element, throw an exception.
            if (listIterator == null || !listIterator.hasNext()) {
                throw new NoSuchElementException();
            }
            // Return the next available entry.
            return listIterator.next();
        }
    }

    // Main method to test the extended CustomHashMap.
    public static void main(String[] args) {
        // Create a new HashMapCustom instance.
        HashMapCustom<Object, Integer> map = new HashMapCustom<Object, Integer>();
        // Insert entries into the map.
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 35);
        // Update the value for an existing key ("Alice").
        map.put("Alice", 28);

        // Retrieve and print values for specific keys.
        System.out.println("Value of Alice: " + map.get("Alice")); // Expected: 28
        System.out.println("Value of Bob: " + map.get("Bob"));       // Expected: 30
        System.out.println("Value of Charlie: " + map.get("Charlie"));// Expected: 35

        // Remove an entry and demonstrate that it no longer exists.
        map.remove("Bob");
        System.out.println("Value of Bob after removal: " + map.get("Bob")); // Expected: null

        // Print the entire map structure bucket by bucket.
        System.out.println("\nCustom HashMap Contents:");
        map.printMap();

        // Use the iterator to traverse all entries and print them.
        System.out.println("\nIterating over CustomHashMap entries:");
        for (HashMapCustom.Entry<Object, Integer> entry : map) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}*/
/*
Explanation of Extensions:

- Iteration:
  The class now implements Iterable<Entry<K, V>> and provides an inner HashMapIterator
  that traverses each non-empty bucket, enabling the use of a for-each loop to iterate over entries.

- Dynamic Size Tracking:
  The size field is maintained and updated with each put() and remove() call.
  The size() method returns the current number of entries, making it easy to monitor map usage.

- Load Factor Tuning:
  The loadFactor field is configurable via constructors and the setLoadFactor() method.
  The resize() method uses this factor to determine when to double the buckets array,
  balancing memory usage with performance.
*/
