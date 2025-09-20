package GenericInterface;

public class Employee1 implements Comparable<Employee1> {
    private String name;
    private int age;

    public Employee1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Employee1 other) {
        return Integer.compare(this.age, other.age);
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

/*
Real-World Example of Generic Interfaces:
A common example of a generic interface in Java is the Comparable<T> interface, which is used to impose a
natural ordering on objects.

In this example, the Comparable<Employee> interface ensures that the Employee objects can be compared based on
their age.

Summary:
A generic interface allows you to write interfaces that can handle various types specified at the time of implementation.
Type parameters are used to define the type of objects that the interface will work with.
You can implement a generic interface by specifying the type or by keeping the implementation generic.
Multiple type parameters can be used to work with more than one type at a time.
Bounded type parameters restrict the types that can be passed to the generic interface.
Wildcards can be used in generic interfaces for flexibility in accepting various types.
Generic interfaces in Java are powerful tools that increase the reusability and flexibility of your code by
allowing you to abstract behavior across multiple types, while maintaining type safety at compile time.
*/
