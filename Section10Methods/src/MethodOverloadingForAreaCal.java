public class MethodOverloadingForAreaCal {
    static double area(double radius) {
        return Math.PI*radius*radius;
    }
    static double area(double length, double breadth) {
        return length*breadth;
    }
    public static void main(String[] args) {
        // Calculate the area of a circle with radius 5.
        double radius = 5.0;
        double circleArea = area(radius);
        System.out.println("Area of the circle with radius " + radius + " is: " + circleArea);

        // Calculate the area of a rectangle with length 10 and breadth 4
        double length = 10.0;
        double breadth = 4.0;
        double rectangleArea = area(length, breadth);
        System.out.println("Area of the rectangle with length " + length + " and breadth " + breadth + " is: " + rectangleArea);
    }
}
