package GenericInterface;

// Define a generic interface.
interface Container<T> {
    void add(T item);
    T get();
}

// Specific implementation for String.
class StringContainer implements Container<String> {
    private String item;

    public void add(String item) {
        this.item = item;
    }

    public String get() {
        return item;
    }
}

// Generic implementation for any type.
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

public class Main {
    public static void main(String[] args) {
        // Using StringContainer.
        StringContainer strContainer = new StringContainer();
        strContainer.add("Hello, Generics!");
        System.out.println(strContainer.get());

        // Using GenericContainer.
        GenericContainer<Integer> intContainer = new GenericContainer<>();
        intContainer.add(42);
        System.out.println(intContainer.get());
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
