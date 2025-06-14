import java.io.*;
class AnimalFamily {
    public void eat() {
        System.out.println("The animal is eating.");
    }
}

class Cat extends AnimalFamily {
    public void meow() {
        System.out.println("The cat is meowing.");
    }
}

class DownCasting {
    public static void main(String[] args) {
        AnimalFamily animal = new Cat(); // Upcasting: Cat object is referenced by AnimalFamily
        animal = new Cat(); // New Cat object, previous one is lost (Garbage Collected)
        animal = new Cat(); // Another new Cat object
        animal.eat(); // Calls eat() method of Cat

        // Explicit down-casting
        Cat cat = (Cat)animal;
        cat.meow();
    }
}

/*
Down-casting: means the typecasting of a parent object to a child object.cannot be implicit.

https://www.scaler.com/topics/upcasting-and-downcasting-in-java/

Explicit Down-casting:

When a subclass type refers to an object of the parent class, the process is referred to as down-casting.
If it is done manually, the compiler issues a runtime ClassCastException error.
It can only be done by using the instanceof operator.
Only the downcast of an object that has already been upcast is possible.
*/
