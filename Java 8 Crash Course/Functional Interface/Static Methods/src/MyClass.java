interface A {
    // static helper method on interface A
    static void util() {
        System.out.println("A.util(): interface static method");
    }

    // default instance method (for comparison)
    default void sayHello() {
        System.out.println("A says Hello (default)");
    }
}

interface B {
    static void util() {
        System.out.println("B.util(): interface static method");
    }

    default void sayHello() {
        System.out.println("B says Hello (default)");
    }
}

public class MyClass implements A, B {
    // override required for conflicting default instance methods
    @Override
    public void sayHello() {
        System.out.println("MyClass: resolved default method conflict");
    }

    // This is a class static method, not an override of A.util()
    // (You can define one, but it's separate.)
    public static void util() {
        System.out.println("MyClass.util(): class static method");
    }

    public static void main(String[] args) {
        // Call interface static methods using the interface name
        A.util(); // prints: A.util(): interface static method
        B.util(); // prints: B.util(): interface static method

        // Call class static method
        MyClass.util(); // prints: MyClass.util(): class static method

        // Instance default method (overridden)
        MyClass obj = new MyClass();
        obj.sayHello(); // prints: MyClass: resolved default method conflict

        // Trying to call interface static via instance is NOT idiomatic and not allowed:
        // obj.util(); // <-- compile-time error: cannot find symbol (util on instance)
        // You must use InterfaceName.util()

        // If an interface provides a private static helper (Java 9+), it's internal and not visible outside.
    }
}
