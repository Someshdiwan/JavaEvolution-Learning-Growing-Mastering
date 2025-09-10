class ConstructorDemo1 {
    private double length;
    private double breadth;

    public ConstructorDemo1() {
        length=1;
        breadth=1;
    }
    public ConstructorDemo1(double l, double b) {
        length=l;
        breadth=b;
    }
    public ConstructorDemo1(double s) {
        length=breadth=s;
    }

    // Method to display the values
    public void display() {
        System.out.println("Length: " + length + ", Breadth: " + breadth);
    }
}

public class Constructor {
    public static void main(String[] args) {
        ConstructorDemo1 c = new ConstructorDemo1();

        // Calling different constructors
        ConstructorDemo1 c1 = new ConstructorDemo1(); // Default constructor.

        ConstructorDemo1 c2 = new ConstructorDemo1(5.0, 10.0); // Parameterized constructor.

        ConstructorDemo1 c3 = new ConstructorDemo1(7.0); // Square constructor.

        c1.display();
        c2.display();
        c3.display();
    }
}
