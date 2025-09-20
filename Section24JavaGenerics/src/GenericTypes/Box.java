package GenericTypes;

public class Box {
    private Object value;

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}

/*
Generic types allow you to define a class, interface, or method with placeholders (type parameters) for the data
types they will work with.

This enables code reusability and type safety, as it allows you to create classes, interfaces, or
methods that can operate on various types without needing to rewrite the code for each type.

A generic type is a class or interface that is parameterized over types.
For example, a generic class can work with any type specified by the user, and that type can be enforced at compile time.
*/
