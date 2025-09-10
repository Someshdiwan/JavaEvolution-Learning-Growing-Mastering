/**
 * This class demonstrates the proper implementation of getters and setters
 * for encapsulating and protecting object data
 */

class Student2 {
    // Private data members - hidden from direct access
    private int rollNo;
    private String name;
    private int age;
    private String course;
    
    // Default constructor
    public Student2() {
        rollNo = 0;
        name = "Unknown";
        age = 18;
        course = "Not Assigned";
    }
    
    // Parameterized constructor
    public Student2(int rollNo, String name, int age, String course) {
        setRollNo(rollNo);  // Using setter for validation
        setName(name);
        setAge(age);
        setCourse(course);
    }
    
    // Getter for rollNo
    public int getRollNo() {
        return rollNo;
    }
    
    // Setter for rollNo with validation
    public void setRollNo(int rollNo) {
        if (rollNo > 0) {
            this.rollNo = rollNo;
        } else {
            System.out.println("Invalid Roll Number. Must be positive.");
        }
    }
    
    // Getter for name
    public String getName() {
        return name;
    }
    
    // Setter for name with validation
    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Invalid Name. Cannot be empty.");
        }
    }
    
    // Getter for age
    public int getAge() {
        return age;
    }
    
    // Setter for age with validation
    public void setAge(int age) {
        if (age >= 16 && age <= 60) {
            this.age = age;
        } else {
            System.out.println("Invalid Age. Must be between 16 and 60.");
        }
    }
    
    // Getter for course
    public String getCourse() {
        return course;
    }
    
    // Setter for course with validation
    public void setCourse(String course) {
        if (course != null && !course.trim().isEmpty()) {
            this.course = course;
        } else {
            System.out.println("Invalid Course. Cannot be empty.");
        }
    }
    
    // Display student information
    public String getDetails() {
        return "Student [Roll No: " + rollNo + 
               ", Name: " + name + 
               ", Age: " + age + 
               ", Course: " + course + "]";
    }
}

public class GetAndSetMethodSolve {
    public static void main(String[] args) {
        // Create student using default constructor
        Student2 s1 = new Student2();
        System.out.println("Default Student: " + s1.getDetails());
        
        // Set properties using setters
        s1.setRollNo(101);
        s1.setName("John Doe");
        s1.setAge(20);
        s1.setCourse("Computer Science");
        System.out.println("Updated Student: " + s1.getDetails());
        
        // Create student using parameterized constructor
        Student2 s2 = new Student2(102, "Jane Smith", 22, "Mathematics");
        System.out.println("Second Student: " + s2.getDetails());
        
        // Test validation for invalid inputs
        Student2 s3 = new Student2();
        s3.setRollNo(-5);          // Invalid roll number
        s3.setName("");            // Invalid name
        s3.setAge(15);             // Invalid age
        s3.setCourse("");          // Invalid course
        System.out.println("Student with invalid inputs: " + s3.getDetails());
        
        // Accessing properties using getters
        System.out.println("\nAccessing individual properties of second student:");
        System.out.println("Roll No: " + s2.getRollNo());
        System.out.println("Name: " + s2.getName());
        System.out.println("Age: " + s2.getAge());
        System.out.println("Course: " + s2.getCourse());
    }
}
