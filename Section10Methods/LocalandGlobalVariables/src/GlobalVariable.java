class Company {
    private String employeeName;  // Instance variable (belongs to object)
    private double salary;        // Instance variable

    static String companyName = "Tech Corp";  // Global variable (shared by all objects)

    // Constructor to initialize instance variables
    public Company(String employeeName, double salary) {
        this.employeeName = employeeName;
        this.salary = salary;
    }

    // Method to display details
    public void display() {
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Salary: $" + salary);
        System.out.println("Company: " + companyName);
    }
}

public class GlobalVariable {
    public static void main(String[] args) {
        Company emp1 = new Company("Alice", 50000);
        Company emp2 = new Company("Bob", 60000);

        emp1.display();
        emp2.display();

        // Changing global variable
        Company.companyName = "Global Tech";

        System.out.println("\nAfter modifying global variable:");
        emp1.display();
        emp2.display();
    }
}

/* A global variable is shared across all instances of a class.
It is declared as static so that it belongs to the class instead of an object.

Key Features:
companyName is shared across all instances.
Changing companyName for one object affects all objects.
*/
