class TypesOfProperties {
    private double length; // Private variable (Encapsulation).

    // Getter method (Read Property)
    public double getLength() {
        return length;
    }

    // Setter method (Write Property)
    public void setLength(double length) {
        if (length > 0) {
            // Adding validation
            this.length = length;
        } else {
            System.out.println("Length must be positive!");
        }
    }
}

class Main {
    public static void main(String[] args) {
        TypesOfProperties obj = new TypesOfProperties();

        // Setting a value (Write operation)
        obj.setLength(12.5);

        // Getting the value (Read operation)
        System.out.println("Length: " + obj.getLength());
    }
}

/*
Getter and setter methods are primarily used to enforce encapsulation in Java.

They allow controlled access to private fields of a class.
Getters retrieve the value of a private field, while setters modify it.
This approach enables the class to maintain control over its internal state and implement validation or additional logic
when accessing or modifying the data.
*/
