You cannot create an instance of an abstract class in Java.

Abstract classes are designed to be incomplete and serve as a base for other classes.

They may contain abstract methods, which have no implementation, making it impossible to instantiate them directly.

However, you can create instances of concrete subclasses that extend the abstract class and provide implementations
for all abstract methods.

What happens if a subclass of an abstract class doesn't implement all the abstract methods?
Ans:
If a subclass of an abstract class doesn't implement all the abstract methods, the subclass itself becomes abstract.
This means that the subclass cannot be instantiated either. To create a concrete class, all abstract methods 
from the superclass must be implemented.
If you want to leave some methods unimplemented, you must declare the subclass as abstract as well.

```java
abstract class Shape {
    abstract double calculateArea();
}

abstract class Rectangle extends Shape {
    // calculateArea() is not implemented, so Rectangle is also abstract
}
```

Yes, an abstract class can have a constructor in Java. Although abstract classes cannot be instantiated directly, 
they can have constructors.
These constructors are called when an instance of a concrete subclass is created.
Constructors in abstract classes are useful for initializing common fields or performing common setup operations for 
all subclasses. 

For example:

```java
abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    abstract void makeSound();
}

class Dog extends Animal {
    public Dog(String name) {
        super(name); // Calls the constructor of the abstract class
    }

    @Override
    void makeSound() {
        System.out.println(name + " barks");
    }
}
```

A key difference between abstract classes and interfaces in Java is that abstract classes can have constructors,
while interfaces cannot.

Abstract classes can have instance variables, constructors, and both abstract and non-abstract methods.

Interfaces, on the other hand, can only have constants (public static final fields), abstract methods, default methods,
and static methods.

They cannot have constructors or instance variables.
This difference allows abstract classes to initialize state and provide common implementation,
while interfaces focus on defining a contract for implementing classes.

When overriding an abstract method in a subclass, you can use the same access modifier as the abstract method or a less 
restrictive one. 

This follows the general rule for method overriding in Java. For example, if an abstract method is declared as protected, 
the overriding method in the subclass can be declared as protected or public, but not private. 

This allows for greater flexibility in the subclass while maintaining the contract defined by the abstract class. 

For instance:

```java
abstract class Parent {
    protected abstract void method();
}

class Child extends Parent {
    @Override
    public void method() { // Less restrictive, so it's allowed
        // implementation
    }
}
```
