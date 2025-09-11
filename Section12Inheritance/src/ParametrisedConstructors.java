class ParentDemo {
    ParentDemo() {
        System.out.println("Non-Param of parent");
    }

    ParentDemo(int x) {
        System.out.println("Param of parent "+x);
    }
}

class ChildDemo extends ParentDemo {
    ChildDemo() {
        System.out.println("Non-Param of child");
    }

    ChildDemo(int y) {
        System.out.println("Param of child");
    }

    ChildDemo(int x,int y) {
        super(x);
        // this will call the super class.
        // supper is a keyword that refers to the super class.
        System.out.println("2 param of child "+y);

    }
}

public class ParametrisedConstructors {
    public static void main(String[] args) {
        ChildDemo c=new ChildDemo(10,20);
        //we call parameterized constructor of super class.
    }
}
