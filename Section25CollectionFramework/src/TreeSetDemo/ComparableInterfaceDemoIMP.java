package TreeSetDemo;

import java.util.List;
import java.util.TreeSet;

class Point implements Comparable
{
    int x;
    int y;

    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString()
    {
        return "X=" + x + " y=" + y;
    }

    @Override
    public int compareTo(Object o)
    {
        Point p = ( Point ) o;
        if (this.x < p.x)
            return -1;
        else if (this.x > p.x)
            return 1;
        else
        {
            if (this.y < p.y)
                return -1;
            else if (this.y > p.y)
                return 1;
            else
                return 0;
        }
    }
}
public class ComparableInterfaceDemoIMP {
    public static void main(String[] args) {
        //In this code we store the objects of our own class. When we are storing the object of our class,
        //Then we have to implement the comparable interface. so that we can compare two objects of our class.
        //then we can define which can be smaller and greater.

        //Tree-Set is also sorted set and sorting required comparison of two points.

       TreeSet<Point> TS = new TreeSet<>();


       //Objects are compared to the based on the Compare-to method that you have provided the above.
        TS.add(new Point(1,1));
        TS.add(new Point(5,5));
        TS.add(new Point(5,2));

        System.out.println(TS);
    }
}

//program demonstrates how to store objects of a user-defined class (Point) inside a TreeSet
//while ensuring automatic sorting. Since TreeSet is a sorted collection, objects stored inside it must be comparable.
//This is achieved by implementing the Comparable interface.