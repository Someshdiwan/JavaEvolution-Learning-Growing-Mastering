package GenericClass;

class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}

/*
Map<String, Integer> map = new HashMap<>();
map.put("One", 1);
map.put("Two", 2);
*/
