/*
Properties: Radius and Height.(get and set methods)
What are the methods you write getRadius() and getHight().
What are the set methods we Required. First is setRadius(Parameters and make sure it is not a negative. double r) and setHeight(double h).
Read and writable properties.
setDimensions(double r, double h)
now lets write constructors name is same as a class name
Cylinder() first constructors and no parameters and second is Cylinder(int r) h=1 and Cylinder(int r, int h)
*/

class CylinderTestDemo
{
    private int radius;
    private int height;

    public CylinderTestDemo()
    {
        radius=height=1;
    }

    public CylinderTestDemo(int r, int h)
    {
        radius=r;
        height=h;
    }
    public int getHeight()
    {
        return height;
    }
    public int getRadius()
    {
        return radius;
    }
    public void setHeight(int h)
    {
        if(h>=0)
            height=h;
        else
            height=0;
    }
    public void setRadius(int r)
    {
        if(r>=0)
            radius=r;
        else
            radius=0;
    }
    public void setDimensions(int h, int r)
    {
        height=h;
        radius=r;
    }
    public double lidArea()
    {
        return Math.PI*radius*radius;
    }
    public double perimeter()
    {
        return 2*Math.PI*radius;
    }
    public double drumArea()
    {
        return 2*lidArea()+perimeter()*height;
    }
    public double volume()
    {
        return lidArea()*height;
    }
}
public class Cylinder {
    public static void main(String[] args)
    {
        CylinderTestDemo c = new CylinderTestDemo();
        c.setHeight(10);
        c.setRadius(7);
        c.setDimensions(10,7);

        System.out.println("LidArea "+c.lidArea());
        System.out.println("Circumference "+c.perimeter());
        System.out.println("Totoal Surface Area "+c.drumArea());
        System.out.println("Volume "+c.volume());
        System.out.println("Height "+c.getHeight());
        System.out.println("Radius "+c.getRadius());

        System.out.printf("Total Above are: %.2f%n",
                c.lidArea() + c.perimeter() + c.drumArea() + c.volume() + c.getHeight() + c.getRadius());
        /*
        Java evaluates expressions from left to right. Since "Total Above are " is a String, all subsequent additions (+) are treated as string concatenation rather than arithmetic addition.
        Instead of adding the numerical values together, Java concatenates them as strings.
        Java first evaluates the arithmetic sum inside the parentheses and then concatenates the result with the string.
        %.2f ensures two decimal places.
        %n prints a newline.
        */
    }
}

/*
Default Constructor: This is a no-argument constructor that initializes the cylinder with default values.

Initial Values: radius = height = 1; means both radius and height are set to 1 when a CylinderTestDemo object is created without passing parameters.

Ensures Valid Values: Since radius and height should be positive, setting them to 1 ensures that the object starts with valid dimensions.
Chaining Assignment: The expression radius = height = 1; works because assignment in Java is right-associative.
It first assigns 1 to height, then assigns the value of height to radius.

Example:
When we create an object like this:

CylinderTestDemo c = new CylinderTestDemo();
radius = 1
height = 1

This ensures that the object has meaningful default values before any setter methods are called.
*/