package GenericTypes;

public class BoxIMP<T> {
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}

class Main {
    public static void main(String[] args) {
        BoxIMP<Integer> box = new BoxIMP<>();  // Box is now type-safe

        box.setValue(1);  // No issue, it's an Integer

        Integer i = box.getValue();  // No casting needed
        System.out.println(i);
    }
}

/*
one or more type parameters, These type parameters are placeholders that are replaced with specific types when the
class is instantiated.

Here, Box<T> is a generic class. The type parameter T will be replaced with a specific type when an object of Box is
created.

Now, the Box class is type-safe, and we will not encounter the ClassCastException because the types are enforced at
compile time.

So, In simpler terms, generics allow you to write code that can work with any object type while ensuring type safety at
compile time.

Generics help us write more flexible and reusable code. For example, without generics,
we would have to write multiple versions of the same class to handle different data types, leading to code duplication.
*/
