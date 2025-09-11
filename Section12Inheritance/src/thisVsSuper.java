class Rectangle {
    int length;
    int breadth;

    Rectangle(int length, int breadth) {
        this.length = length;  // Fixed the typo
        this.breadth = breadth;
    }

    void display() {
        System.out.println("Length is: " + length);
        System.out.println("Breadth is: " + breadth);
    }
}

public class thisVsSuper {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(10, 3);
        rect.display();  // Call display() to print values
    }
}
