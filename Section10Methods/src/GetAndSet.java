class Person2 {
    private String name;  // Private variable
    private int age;      // Private variable

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for age
    public int getAge() {
        return age;
    }

    // Setter method for age with validation
    public void setAge(int age) {
        if (age > 0) {
            // Ensuring valid age.
            this.age = age;
        } else {
            System.out.println("Age must be positive.");
        }
    }
}

public class GetAndSet {
    public static void main(String[] args) {
        Person2 p = new Person2();

        // Using setter methods
        p.setName("John Doe");
        p.setAge(25);

        // Using getter methods
        System.out.println("Name: " + p.getName());
        System.out.println("Age: " + p.getAge());

        // Attempting to set invalid age
        p.setAge(-5);
    }
}

/*
Getter and Setter Methods in Java:
In Java, getter and setter methods are used to access and modify private fields of a class.
They are part of the encapsulation principle in Object-Oriented Programming (OOP),
ensuring that the internal representation of a class is hidden from outside access.

1. Why Use Getters and Setters?
Encapsulation & Data Hiding.
Encapsulation helps in restricting direct access to class fields.
Fields are typically marked as private, preventing external modification.
Getters allow controlled read access, and setters provide controlled write access.

Data Validation:

Setters can include validation logic to prevent invalid data from being set,
Read-Only or Write-Only Access.

A class may provide a getter without a setter (making it read-only).
A class may provide a setter without a getter (making it write-only).

Logging & Debugging:
You can log every time a field is accessed or modified.
Helps in tracking changes to data.

Key Points:
Encapsulation: The name and age fields are private, meaning they cannot be accessed directly outside the Person2 class.
The getter and setter methods provide controlled access.

Data Validation: The setAge() method includes a validation check to ensure the age is positive before it’s set.
This prevents invalid data from being assigned to the age field.

Read-Write and Write-Only Access: In this example, the name field has both a getter and a setter,
allowing both read and write access.
The age field also provides both getter and setter methods, with the setter including validation to ensure the data is appropriate.

Logging and Debugging: Although you haven't explicitly added logging, this pattern allows for logging in setter methods.
For instance, you could log whenever the setName() or setAge() methods are called.

Fixing the Code:
There’s a small issue with the code structure: the Person2 class is inside the GetAndSet class.
It would be better to move it outside the GetAndSet class to ensure that it works as expected.
Additionally, Main should be outside GetAndSet.

Explanation of Changes:
Class Structure: Person2 is now a top-level class, making it clearer and ensuring proper structure for the program.
Usage of Main class: The Main class is now separate and contains the main() method to run the code.
What You Can Do with Getters and Setters:
Validation: Ensure that data entered is valid (like with setAge()).
Logging: Track changes to an object’s state for debugging or auditing purposes.

Control Access: You can provide read-only properties by omitting the setter, or
write-only properties by omitting the getter, depending on your needs.
*/
