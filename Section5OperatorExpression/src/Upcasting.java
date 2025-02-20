//Upcasting: Upcasting is the typecasting of a child object to a parent object.
//Upcasting can be done implicitly. Upcasting gives us the flexibility to access the parent class members but it is not possible to access all the child class members using this feature.
//Instead of all the members, we can access some specified members of the child class. For instance, we can access the overridden methods.

// Java program to demonstrate
// the concept of upcasting

// Animal Class
class Animals {

    String name;

    // A method to print the
    // nature of the class
    void nature()
    {
        System.out.println("Animal");
    }
}

// A Fish class which extends the
// animal class
class Fish extends Animals {

    String color;

    // Overriding the method to
    // print the nature of the class
    @Override
    void nature()
    {
        System.out.println("Aquatic Animal");
    }
}

// Demo class to understand
// the concept of upcasting
class Upcasting {

    // Driver code
    public static void main(String[] args)
    {
        // Creating an object to represent
        // Parent p = new Child();
        Animals a = new Fish();

        // The object 'a' has access to
        // only the parent's properties.
        // That is, the colour property
        // cannot be accessed from 'a'
        a.name = "GoldFish";

        // This statement throws
        // a compile-time error
        // a.color = "Orange";

        // Creating an object to represent
        // Child c = new Child();
        Fish f = new Fish();

        // The object 'f' has access to
        // all the parent's properties
        // along with the child's properties.
        // That is, the colour property can
        // also be accessed from 'f'
        f.name = "Whale";
        f.color = "Blue";

        // Printing the 'a' properties
        System.out.println("Object a");
        System.out.println("Name: " + a.name);

        // This statement will not work
        // System.out.println("Fish1 Color" +a.color);

        // Access to child class - overridden method
        // using parent reference
        a.nature();

        // Printing the 'f' properties
        System.out.println("Object f");
        System.out.println("Name: " + f.name);
        System.out.println("Color: " + f.color);
        f.nature();
    }
}

