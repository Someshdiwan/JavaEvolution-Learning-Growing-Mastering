class CircleDemo {
    public double radius;

    public double area() {
        return Math.PI * radius *radius;
    }
    public double perimeter() {
        return 2*Math.PI*radius;
    }
    public double circumference() {
        return perimeter();
    }
}

class CylinderDemo extends CircleDemo {
    public double height;

    public double volume() {
        return area()*height;
    }

}

public class Inheritance {
    public static void main(String[] args) {
        CylinderDemo c = new CylinderDemo();
        c.radius = 7;
        c.height = 10;

        System.out.println("Volume " + c.volume());
        System.out.println("Area " + c.area());
    }
}
