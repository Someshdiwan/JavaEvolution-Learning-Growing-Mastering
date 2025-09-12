class outer {
    int x = 10;
    Inner in=new Inner(); //Object is accessible for the entire class. Outer class object hai.

    class Inner {
        int y = 20;

        public void innerDisplay() {
            System.out.println(x+ " " +y);
        }
    }

    //Method of outer class
    public void OuterDisplay() {
        Inner i = new Inner();

        //Inner class object inside outer class and outer class method
        i.innerDisplay();
        System.out.println(i.y);
    }
}

public class NestedInnerClasses {
    public static void main(String[] args) {
        outer o = new outer();
        o.OuterDisplay();

        outer.Inner oi = new outer().new Inner(); //Object of outer and inner

        oi.innerDisplay(); //Both class ke objects create keye hai outer and inner ke and accessing obj of inner and
        // outer inside the main method.
    }
}
