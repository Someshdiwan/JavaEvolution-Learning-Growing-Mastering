import java.util.*;

class Parent {

    // Nested Interface
    interface Test {
        void show();
    }
}

class Child implements Parent.Test {
    public void show() {
        System.out.println("show method of interface");
    }
}

class NestedInterface {
    public static void main(String[] args) {
        // instance of Parent class
        // with Nested Interface
        Parent.Test obj;

        // Instance of Child class
        Child t = new Child();

        obj = t;
        obj.show();
    }
}

/*
https://www.geeksforgeeks.org/types-of-interfaces-in-java/?ref=asr9

https://www.geeksforgeeks.org/interface-nested-class-another-interface/?ref=ml_lbp

https://www.geeksforgeeks.org/match-lambdas-to-interfaces-in-java/?ref=asr8

We can declare interfaces as members of a class or another interface. Such an interface is called a member interface or
nested interface.

Interfaces declared outside any class can have only public and default (package-private) access specifiers.

In Java, nested interfaces (interfaces declared inside a class or another interface) can be declared with the public,
protected, package-private (default), or private access specifiers.

A nested interface can be declared public, protected, package-private (default), or private.
A top-level interface (not nested) can only be declared as public or package-private (default).

It cannot be declared as protected or private.

Uses of Nested Interfaces:
In Java, nested interfaces can be used for a variety of purposes, including:

To group related interfaces together: By nesting one interface within another, you can organize related interfaces in a
more logical and readable way. This can make your code easier to understand and maintain.

To create more secure code: By making an interface nested inside a class, you can limit its scope and prevent it from
being accessed outside of that class.

This can make your code more secure and less prone to errors.

To implement multiple interfaces: By nesting interfaces, you can implement multiple interfaces in a single class,
without cluttering up the global namespace with too many interface names.

To create callbacks: Nested interfaces can be used to create callback functions, where an object can be passed to another
object and that object can call back a method defined in the nested interface.

To define a contract between classes: By using nested interfaces, you can define a contract between classes,
where each class implements the same interface, but provides its own implementation.

This can make your code more modular and easier to test.

working of interface inside a class
*/
