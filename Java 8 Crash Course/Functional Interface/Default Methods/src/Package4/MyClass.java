package Package4;

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

// This will cause a compile-time error comment sayHello() method:
public class MyClass implements A, B {
    public static void main(String[] args) {
        new MyClass().sayHello();
    }

    @Override
    public void sayHello() {
        A.super.sayHello();
    }
}
