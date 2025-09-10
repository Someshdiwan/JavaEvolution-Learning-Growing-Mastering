/**
 * This class demonstrates data hiding in Java
 * Data hiding is achieved by:
 * 1. Making instance variables private
 * 2. Providing public getter and setter methods for controlled access
 */
class Circle2 {
    // Private instance variables - hidden from outside access
    private double radius;
    private String color;
    
    // Public constructor
    public Circle2() {
        radius = 1.0;
        color = "red";
    }
    
    // Getter method for radius
    public double getRadius() {
        return radius;
    }
    
    // Setter method for radius with validation
    public void setRadius(double r) {
        if (r > 0) {
            radius = r;
        } else {
            System.out.println("Radius must be positive. Setting to default value 1.0");
            radius = 1.0;
        }
    }
    
    // Getter method for color
    public String getColor() {
        return color;
    }
    
    // Setter method for color
    public void setColor(String c) {
        if (c != null && !c.isEmpty()) {
            color = c;
        } else {
            System.out.println("Color cannot be empty. Setting to default red");
            color = "red";
        }
    }
    
    // Method to calculate area
    public double area() {
        return Math.PI * radius * radius;
    }
    
    // Method to calculate circumference
    public double circumference() {
        return 2 * Math.PI * radius;
    }
}

public class DataHidding1 {
    public static void main(String[] args) {
        // Create a Circle object
        Circle2 c1 = new Circle2();
        
        // Access data using public methods, not directly
        System.out.println("Initial radius: " + c1.getRadius());
        System.out.println("Initial color: " + c1.getColor());
        
        // Set new values using setter methods
        c1.setRadius(5.0);
        c1.setColor("blue");
        
        // Access the updated values
        System.out.println("Updated radius: " + c1.getRadius());
        System.out.println("Updated color: " + c1.getColor());
        System.out.println("Area: " + c1.area());
        System.out.println("Circumference: " + c1.circumference());
        
        // Attempt to set invalid values
        c1.setRadius(-2.5);
        c1.setColor("");
        
        // Check that validation worked
        System.out.println("Radius after invalid input: " + c1.getRadius());
        System.out.println("Color after invalid input: " + c1.getColor());
    }
}
