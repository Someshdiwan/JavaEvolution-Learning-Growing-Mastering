package Test;

public class TestClass {
    public static void main(String[] args) {
        Dog Obj = new Dog();

        //Inherit kar Raha hai properties ko.
        Obj.age = "4";
        Obj.breed = "Bob";
        Obj.name = "Bob";


        //Polymorphism.
        //Object create kar rahe hai. Dog ka obj and reference Animal ka hai.
        //Subclass ke obj kp treat kar sakte ho as a instance/references of super class.
        Animal aa = new Dog();
        aa.makeSound(); //Obj dog ka and reference super class ka.

        //Abstraction
        //Hiding Implementation details().
        //Tv and remote ka example .
        //we don't care about the internal working of the Tv just focus on the working of remote.
        //Car chala rahe ho we hide details like gear working and other things.
    }
}

//imperative and Functional paradigm(classes and obj) are style of writing program code.
