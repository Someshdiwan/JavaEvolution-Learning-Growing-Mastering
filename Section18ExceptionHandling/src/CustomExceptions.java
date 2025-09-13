import java.util.*;

class Rectangle {
    public static int calculateArea(int length, int width) throws NegativeValueException {
        if (length < 0 || width < 0) {
            throw new NegativeValueException("Error: length or width cannot be negative");
        }
        return length * width;
    }
}

class NegativeValueException extends Exception {
    public NegativeValueException(String message) {
        super(message);
    }
}

class CustomExceptions {
    public static void main (String[] args) {
        try {
            int length = -5;
            int width = 3;

            Rectangle rectangle = new Rectangle();
            int area = rectangle.calculateArea(length, width);
            System.out.println("Area: " + area);
        }
        catch (NegativeValueException e) {
            System.out.println(e.getMessage());
        }
    }
}
