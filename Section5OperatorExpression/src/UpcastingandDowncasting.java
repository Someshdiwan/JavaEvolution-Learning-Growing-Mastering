class Animal{
    String name;

    public void makenoise(){
        System.out.println("I am Just an animal");
    }
}

class Dog extends Animal {
    @Override
    public void makenoise(){
        System.out.println("Woof woof!");
    }

    public void growl(){
        System.out.println("Grrrrrr");
    }
}

public class UpcastingandDowncasting {
    public static void main(String[] args) {
        Animal myAnimal = new Dog();
        //Automatically upcasting Dog to Animal.

    }

    public static void doANimalStuff(Animal animal){
        animal.makenoise();
    }
}
