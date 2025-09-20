package GenericInterface;

/* A generic interface can have multiple type parameters. This is useful when you need to work with more than one type
in the same interface. */

interface Pair<K, V> {
    K getKey();
    V getValue();
}

/* Here, the Pair interface defines two generic type parameters K and V. Implementing this interface will require
specifying both types. */

class KeyValuePair<K, V> implements Pair<K, V> {
    private K key;
    private V value;

    public KeyValuePair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public V getValue() {
        return value;
    }
}

/* You can create an instance of KeyValuePair like this:
Pair<String, Integer> pair = new KeyValuePair<>("Age", 0);
System.out.println(pair.getKey() + ": " + pair.getValue()); */
