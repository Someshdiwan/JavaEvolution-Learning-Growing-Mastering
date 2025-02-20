//Downcasting: Similarly, downcasting means the typecasting of a parent object to a child object.
//Downcasting cannot be implicit.
/*
https://www.scaler.com/topics/upcasting-and-downcasting-in-java/

Explicit Downcasting
When a subclass type refers to an object of the parent class, the process is referred to as downcasting. If it is done manually, the compiler issues a runtime ClassCastException error. It can only be done by using the instanceof operator. Only the downcast of an object that has already been upcast is possible.
*/

import java.io.*;
class AnimalFamily {
    public void eat()
    {
        System.out.println("The animal is eating.");
    }
}

class Cat extends AnimalFamily {
    public void meow()
    {
        System.out.println("The cat is meowing.");
    }
}

class DownCasting {
    public static void main(String[] args)
    {
        AnimalFamily animal = new Cat();
        animal = new Cat();
        animal = new Cat();
        animal.eat();

        // Explicit downcasting
        Cat cat = (Cat)animal;
        cat.meow();
    }
}