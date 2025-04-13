An abstract class in Java can contain both abstract and concrete methods. 
This is one of the key features that distinguishes abstract classes from interfaces (prior to Java 8). 

An abstract class can have any of the following:

1. Abstract methods (methods without a body)
2. Concrete methods (methods with a body)
3. Instance variables
4. Constructors
5. Static methods and variables

This flexibility allows abstract classes to provide a common structure and some implemented functionality while 
leaving other methods to be implemented by subclasses. 

For example:

```java
abstract class Shape {
    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    abstract double calculateArea(); // abstract method

    public void displayColor() { // concrete method
        System.out.println("Color: " + color);
    }
}
```


Yes, an abstract class can contain final methods. 

Final methods in Java are methods that cannot be overridden by subclasses. 

Including final methods in an abstract class can be useful when you want to provide a method implementation that 
should not be changed by any subclass. 

This allows you to enforce certain behavior across all subclasses of the abstract class. 

Here's an example:

```java
abstract class Vehicle {
    abstract void startEngine();

    final void stopEngine() {
        System.out.println("Engine stopped");
    }
}

class Car extends Vehicle {
    @Override
    void startEngine() {
        System.out.println("Car engine started");
    }

    // Cannot override stopEngine() as it's final in the superclass
}
```

Yes, an abstract class can extend another abstract class. 

This is perfectly valid in Java and can be useful for creating a hierarchy of abstract classes, 

each adding or refining abstract or concrete methods. 

When an abstract class extends another abstract class, it is not required to implement the abstract methods of its 
superclass. 

It can choose to implement some, all, or none of the abstract methods, 
and can also add new abstract or concrete methods. 

For example:

```java
abstract class Shape {
    abstract double calculateArea();
}

abstract class TwoDimensionalShape extends Shape {
    abstract double calculatePerimeter();
}

class Circle extends TwoDimensionalShape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}
```
