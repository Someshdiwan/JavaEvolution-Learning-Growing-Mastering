package Package3;

interface A {
    default void sayHello() {
        System.out.println("A says Hello");
    }
}

interface B {
    default void sayHello() {
        System.out.println("B says Hello");
    }
}

/**
 * Resolution strategy: override the default method in the implementing class.
 * This removes ambiguity because class implementation takes precedence.
 */
public class MyClass implements A, B {
    // Explicit override: resolves conflict and defines class behavior.
    @Override
    public void sayHello() {
        System.out.println("MyClass says Hello (overridden)");
    }
    public static void main(String[] args) {
        MyClass m = new MyClass();
        m.sayHello(); // prints: MyClass says Hello (overridden)
    }
}
