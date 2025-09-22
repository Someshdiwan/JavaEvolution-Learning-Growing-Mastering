package Package2;

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
 * Resolution strategy: override and delegate to a chosen interface default.
 * Use InterfaceName.super.method(...) to invoke that interface's default.
 */
public class MyClass implements A, B {
    @Override
    public void sayHello() {
        // Choose which interface default to use:
        A.super.sayHello();          // delegates to A's default

        // Or to use B's default instead:
        // B.super.sayHello();
    }

    public static void main(String[] args) {
        new MyClass().sayHello(); // prints: A says Hello
    }
}
