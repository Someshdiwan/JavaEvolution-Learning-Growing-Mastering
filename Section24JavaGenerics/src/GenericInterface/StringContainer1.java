package GenericInterface;

class StringContainer1 implements Container<String> {
    private String item;

    public void add(String item) {
        this.item = item;
    }

    public String get() {
        return item;
    }
}

//In this example, StringContainer implements the Container interface with String as the specified type parameter.

/*
class GenericContainer<T> implements Container<T> {
    private T item;

    @Override
    public void add(T item) {
        this.item = item;
    }

    @Override
    public T get() {
        return item;
    }
}
*/
