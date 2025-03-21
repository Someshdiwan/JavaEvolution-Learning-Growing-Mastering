/**
 * Learn more about local and global variables:
 * <a href="https://www.geeksforgeeks.org/local-and-global-variables/">GeeksforGeeks</a>
 */

class School {
    private String studentName;  // Instance variable (unique per student)
    private int rollNumber;      // Instance variable

    static String schoolName = "Greenwood High";  // Global variable (same for all students)
    static int totalStudents = 0;  // Global variable to count students

    // Constructor
    public School(String studentName) {
        this.studentName = studentName;
        this.rollNumber = ++totalStudents;  // Each student gets a unique roll number
    }

    // Display student details
    public void display() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("School Name: " + schoolName);
    }

    // Static method to display total students
    public static void displayTotalStudents() {
        System.out.println("\nTotal Students Enrolled: " + totalStudents);
    }
}

public class Main {
    public static void main(String[] args) {
        School s1 = new School("Alice");
        School s2 = new School("Bob");
        School s3 = new School("Charlie");

        s1.display();
        s2.display();
        s3.display();

        School.displayTotalStudents();
    }
}