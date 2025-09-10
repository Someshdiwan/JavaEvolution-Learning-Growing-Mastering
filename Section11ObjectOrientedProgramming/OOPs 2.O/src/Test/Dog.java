package Test;

//Inheritance and Achieving code re-use ability of code.
public class Dog extends Animal {
    String breed;

    @Override
    public void makeSound() {
        System.out.println("Bark Woof Woof");
    }
}
