// Enum Declared
enum Color1 {
    RED,
    GREEN,
    BLUE,
    YELLOW;

    // Enum constructor called separately for each constant
    private Color1() {
        System.out.println("Constructor called for: " + this);
    }

    public void colorInfo() {
        System.out.println("Universal Color");
    }
}

// Demonstrating Enum with Switch Statement
public class Enum6 {
    public static void main(String[] args) {
        Color1 var_1 = Color1.YELLOW;

        // Switch case with Enum
        switch (var_1) {
            case RED:
                System.out.println("Red color observed");
                break;
            case GREEN:
                System.out.println("Green color observed");
                break;
            case BLUE:
                System.out.println("Blue color observed");
                break;
            default:
                System.out.println("Other color observed");
        }
    }
}

// Demonstrating Enum with Constructor and Methods
class Enum5 {
    public static void main(String[] args) {
        Color1 c1 = Color1.RED;
        System.out.println(c1);
        c1.colorInfo();
    }
}


/*
FAQs on Enum in Java
Can we create the instance of Enum by the new keyword?
No, we can’t create the instance of the Enum keyword because it contains private constructors only.


Can we have an abstract method in the Enum?
Yes, we have an abstract method in Enum.


What is the purpose of the values() method in the enum?
        In Java, the values( ) method can be used to return all values present inside the enum.


What is the purpose of the valueOf() method in the enum?
The valueOf() method returns the enum constant of the specified string value if exists.


What is the purpose of the ordinal() method in the enum?
By using the ordinal() method, each enum constant index can be found, just like an array index.

*/
