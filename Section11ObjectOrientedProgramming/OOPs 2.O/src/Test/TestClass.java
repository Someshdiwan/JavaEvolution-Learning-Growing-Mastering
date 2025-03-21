package Test;

public class TestClass
{
    public static void main(String[] args)
    {
        Dog Dog = new Dog();

        //Inherit kar Raha hai properties ko.
        Dog.age = "4";
        Dog.breed = "Bob";
        Dog.name = "Bob";


        //Polymorpisam
        //Object create kar rahe hai. Dog ka obj and refrence Animal ka hai.
        //Sub class ke obj kp treat kar sakte ho as a instance/refernces of super class.
        Animal dog = new Dog();
        dog.makeSound(); //Obj dog ka and referance super class ka

        //Abstraction
        //Hidding Implementaion details().
        //Tv and remote ka exampl . we dont care about the internal working of the Tv just foucs on the working of remote.
        //Car chala rahe ho we hide details like gear working and other things.
    }
}

//imperative and Functional paradiam(classes and obj) are style of writing program code.