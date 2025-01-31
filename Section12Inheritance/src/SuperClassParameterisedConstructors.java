//Need Practice the same thing again.

class RectangleDemo
{
    int length;
    int breadth;

    RectangleDemo()
    {
        length=breadth=1;
    }
    RectangleDemo(int l,int b)
    {
        length=l;
        breadth=b;
    }

}

class Cuboid extends RectangleDemo
{
    int height;

    Cuboid()
    {
        height=1;
    }

    Cuboid(int h)
    {
        height=h;
    }
    Cuboid(int l,int b,int h)
    {
        super(l,b);
        height=h;
    }

    int volume()
    {
        return length*breadth*height;
    }
}

public class SuperClassParameterisedConstructors
{
    public static void main(String[] args)
    {
        Cuboid c=new Cuboid(5,3,10);
        System.out.println(c.volume());
    }
}

