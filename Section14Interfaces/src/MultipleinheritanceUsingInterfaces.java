/*
Multiple Inheritance is a feature of an object-oriented concept, where a class can inherit properties of more than one
parent class.
The problem occurs when methods with the same signature exist in both the superclasses and subclass.
On calling the method, the compiler cannot determine which class method to be called and even on calling which
class method gets the priority.

Declare the interfaces
*/

interface Walkable {
    void walk();
}

interface Swimmable {
    void swim();
}

// Implement the interfaces in a class
class Duck implements Walkable, Swimmable {
    public void walk() {
        System.out.println("Duck is walking.");
    }

    public void swim() {
        System.out.println("Duck is swimming.");
    }
}

// Use the class to call the methods from the interfaces
class MultipleInheritanceUsingInterfaces {
    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.walk();
        duck.swim();
    }
}
