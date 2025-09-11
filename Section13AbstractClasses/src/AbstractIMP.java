import java.awt.*;

abstract class ShapeVIMP {
    abstract public double peimeterIMP();
    abstract public double areaIMP();
}

class CircleVIMP extends ShapeVIMP {
    double radiusIMP;

    public double peimeterIMP() {
        return 2 * Math.PI * radiusIMP;
    }

    public double areaIMP() {
        return Math.PI*radiusIMP*radiusIMP;
    }
}

class Rectangle extends ShapeVIMP {
    double length;
    double breadth;

    public double peimeterIMP() {
        return 2*(length+breadth);
    }

    public double areaIMP() {
        return length*breadth;
    }
}

class AbstractIMP {
    public static void main(String[] args) {
        Rectangle r=new Rectangle();
        r.length=10;
        r.breadth=5;

        ShapeVIMP s=r;
        System.out.println(s.areaIMP());
    }
}
