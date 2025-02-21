//Remember - A constructor name should be the same as class name
//and must not have a return type(void).
//Think of constructors as the birth certificate of an object. When you create an object in Java, it needs to be initialized with some initial values or properties.
//Constructors are used to initialize these properties and prepare the object for use.
//Remember - A constructor name should be the same as class name and must not have a return type(void).

//If no constructor is defined in a class, Java provides a default no-argument constructor automatically.
//This default constructor initializes the object but doesn't set any properties, leaving instance variables with their default values (e.g., null for objects, 0 for integers, false for booleans, etc.).
public class Constructor {

    private String color;
    private char size;

    //Remember - A constructor name should be the same as class name.
    Constructor()
    {
        System.out.println("Inside constructor");
    }

    public static void puton()
    {
        System.out.println("Shirt is On!");
    }

    public static void takeOFF()
    {
        System.out.println("Shirt is off!");
    }
    public static void main(String[] args)
    {
        Constructor c = new Constructor();
        c.puton();
        //c.takeOFF();
    }
}