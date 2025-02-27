class Animal {
    String name;

    public void makenoise() {
        System.out.println("I am Just an animal");
    }
}

class Dog extends Animal {
    @Override
    public void makenoise() {
        System.out.println("Woof woof!");
    }

    public void growl() {
        System.out.println("Grrrrrr");
    }
}

public class UpcastingandDowncasting {
    public static void main(String[] args) {
        Animal myAnimal = new Dog();
        myAnimal.makenoise();
        /*Automatically upcasting Dog to Animal.*/

        /*
        Dog d = new Dog();
        d.makenoise();
        d.growl();
       */

        /*Unsafe Down-casting (Incorrect)*/
        /*
        Dog dd = (Dog) new Animal();
        dd.growl();
        */

        if (myAnimal instanceof Dog) {
            Dog dd = ( Dog ) myAnimal; //Safe Downcasting
            dd.growl();
        } else {
            System.out.println("Downcasting is not possible.");
        }
    }
}