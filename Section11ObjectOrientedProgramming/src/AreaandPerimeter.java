//Area of circle and perimeter of circe.

class Circle
{
    //All these are the properties of the circle class

    public double radius;

    public double area()
    {
        //Formula for area. Math.PI Built in constant givem in class.
        //Predefine final here.
        return Math.PI * radius * radius;
    }
    //Perimeter method
    public double perimeter()
    {
        //Formula for perimeter
        return 2 * Math.PI*radius*radius;
    }
    //One more method

    public double circumferenec()
    {
        //Calling the Perimeter method or you write the formula instead.

        return perimeter();
    }
}

class AreaandPerimeter{
    public static void main(String[] args)
    {
        Circle c1 = new Circle();
        Circle c2 = new Circle();

        c1.radius = 7;
        c2.radius=14;

        System.out.println("Area: "+c1.area());
        System.out.println("Perimeter: "+c1.perimeter());
        System.out.println("Circumference: "+c1.circumferenec());

        System.out.println("Area: "+c2.area());
        System.out.println("Perimeter: "+c2.perimeter());
        System.out.println("Circumference: "+c2.circumferenec());
    }
}