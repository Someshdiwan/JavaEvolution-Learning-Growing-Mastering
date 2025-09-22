@FunctionalInterface
interface Parent {
    // Single abstract method.
    void show(String msg);

    // Default method → does not count towards abstract method count.
    default void defaultMethod() {
        System.out.println("Parent default method");
    }

    // Static method → does not count either.
    static void staticMethod() {
        System.out.println("Parent static method");
    }
}

// Child interface inherits Parent.
@FunctionalInterface
interface Child extends Parent {
    /*
    Do NOT add another abstract method here, otherwise it will break functional interface rules.
    You can override the same abstract method if you want.
    */
    @Override
    void show(String msg); // same method from Parent
}

public class InheritanceFunctionalInterfaceExample {
    public static void main(String[] args) {
        // Using lambda expression for Child (inherited method `show`)
        Child child = (msg) -> System.out.println("Lambda says: " + msg);

        // Call the abstract method
        child.show("Hello Inheritance in Functional Interfaces!");

        // Call the default method
        child.defaultMethod();

        // Call the static method (through Parent interface)
        Parent.staticMethod();
    }
}
