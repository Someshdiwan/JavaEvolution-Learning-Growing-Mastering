class Cylindertest1
{
    public double radius;
    public double height;

    public double lidArea()
    {
        return Math.PI*radius*radius;
    }
    public double  totalSurfaceArea()
    {
        return 2*lidArea()+circumference()*height;
    }
    public double circumference()
    {
        return 2*Math.PI*radius;
    }
    public double volume()
    {
        return lidArea();
    }
}

public class CylinderTest {
    public static void main(String[] args) {
        Cylindertest1 c = new Cylindertest1();

        c.radius=7;
        c.height=10;

        System.out.println("Lid Area: "+c.lidArea());
        System.out.println("Total Area : "+c.totalSurfaceArea());
        System.out.println("Volume: "+c.volume());
    }
}
