package Package1;

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

public class MyClass implements A, B {
    @Override
    public void sayHello() {
        // Combine both interface defaults and add class-specific behavior
        System.out.print("Combined: ");
        A.super.sayHello();
        B.super.sayHello();
        System.out.println("MyClass done."); // additional behavior
    }
    public static void main(String[] args) {
        new MyClass().sayHello();
    }
}
