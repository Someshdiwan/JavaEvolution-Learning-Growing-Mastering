/*
Properties of Enum in Java
There are certain properties followed by Enum as mentioned below:

Class Type: Every enum is internally implemented using the Class type.
Enum Constants: Each enum constant represents an object of type enum.
Switch Statements: Enum types can be used in switch statements.
Implicit Modifiers: Every enum constant is implicitly public static final. Since it is static, it can be accessed using the enum name. Since it is final, enums cannot be extended.
Main Method: Enums can declare a main() method, allowing direct invocation from the command line.
*/

// A Java program to demonstrate working on enum
// in a switch case (Filename Test.java)

/*
An Enum class

enum Day {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY;
}
*/
 enum Day1 {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
}

// Driver class that contains an object of "Day" and main().
class Enum55 {
    Day1 day;

    // Constructor
    public Enum55(Day1 day) {
        this.day = day;
    }

    // Prints a message about the day using switch-case
    public void dayIsLike() {
        switch (day) {
            case MONDAY:
                System.out.println("Mondays are bad.");
                break;
            case FRIDAY:
                System.out.println("Fridays are better.");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Weekends are best.");
                break;
            default:
                System.out.println("Midweek days are so-so.");
                break;
        }
    }

    // Driver method
    public static void main(String[] args) {
        String str = "MONDAY";
        Enum55 t1 = new Enum55(Day1.valueOf(str));
        t1.dayIsLike();
    }
}