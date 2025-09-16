/*
Properties of Enum in Java
There are certain properties followed by Enum as mentioned below:

Class Type: Every enum is internally implemented using the Class type.
Enum Constants: Each enum constant represents an object of type enum.
Switch Statements: Enum types can be used in switch statements.
Implicit Modifiers: Every enum constant is implicitly public static final. Since it is static,
it can be accessed using the enum name. Since it is final, enums cannot be extended.
Main Method: Enums can declare a main() method, allowing direct invocation from the command line.

A Java program to demonstrate working on enum. in a switch case (Filename Test.java).
*/

enum Day {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY;
}

public class Enum8 {
    public static void main(String[] args) {
        Day day = Day.WEDNESDAY;

        switch (day) {
            case SUNDAY:
                System.out.println("It’s Sunday!");
                break;
            case MONDAY:
                System.out.println("It’s Monday!");
                break;
            case TUESDAY:
                System.out.println("It’s Tuesday!");
                break;
            case WEDNESDAY:
                System.out.println("It’s Wednesday!");
                break;
            case THURSDAY:
                System.out.println("It’s Thursday!");
                break;
            case FRIDAY:
                System.out.println("It’s Friday!");
                break;
            case SATURDAY:
                System.out.println("It’s Saturday!");
                break;
            default:
                System.out.println("Unknown day");
                break;
        }
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
