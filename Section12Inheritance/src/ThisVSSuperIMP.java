class RectangleSuper{
    int length;
    int breadth;

    // Default constructor
    RectangleSuper() {
        length=breadth=1;
    }

    // Parameterized constructor
    RectangleSuper(int l, int b) {
        length=l;
        breadth=b;
    }
}

class CuboidSuper extends RectangleSuper {
    int height;

    // Default constructor with super()
    CuboidSuper() {
        super(); // Calls the default constructor of RectangleSuper
        height=1;
    }

    CuboidSuper(int h) {
        super();
        height=h;
    }

    CuboidSuper(int l, int b,int h) {
        super(l,b);
        height=h;
    }

    int volume() {
        return length*breadth*height;
    }
}

public class ThisVSSuperIMP {
    public static void main(String[] args) {
        CuboidSuper c= new CuboidSuper(5,3,7);
        System.out.println("Volumne of Cuboid: "+c.volume());
    }
}
