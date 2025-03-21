/* An instance variable belongs to an object and is created when the object is instantiated.
   Each object has its own copy of instance variables.
*/

class Student {
    private String name;  // Instance variable
    private double gpa;   // Instance variable

    // Constructor to initialize instance variables
    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    // Method to display student details
    public void display() {
        System.out.println("Student Name: " + name);
        System.out.println("GPA: " + gpa);
    }
}

public class InstanceVariable {
    public static void main(String[] args) {
        Student s1 = new Student("Alice", 3.8);
        Student s2 = new Student("Bob", 3.5);

        s1.display();
        s2.display();
    }
}

/* Key Features:
Each Student object has its own name and gpa.
Changing values for one object does not affect the other.
*/