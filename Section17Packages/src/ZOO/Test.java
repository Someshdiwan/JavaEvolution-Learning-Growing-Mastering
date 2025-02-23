package ZOO;

public class Test
{
    public static void main(String[] args)
    {
        Dog dog = new Dog("Bob");
        dog.makeSound();

        //We cant access this Because it is protected method.
        dog.changeSound("Woof");
        //Dog class extends Animal but Test Class Cant extends Directly Animal Class.

        dog.setDogSound("Woof");
        dog.makeSound();

        dog.wagTail(); //Public hai accessable hai.
    }
}
