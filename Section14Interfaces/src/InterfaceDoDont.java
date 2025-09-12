interface TestInterfaces{
    static  final int X=10; //Final and static if you don't write also.

    public abstract  void  meth1();
    public abstract void meth2();

    default void meth333() {
        System.out.println("Meth3 of Test");
    }
}

interface Test2 extends TestInterfaces {
    void meth4();
}

class My1 implements Test2 {
    public void meth1(){}
    public void meth2(){}
    //public void meth333(){}
    //VIMP Part
    public void meth4(){}
}

public class InterfaceDoDont {
    public static void main(String[] args) {
        System.out.println(TestInterfaces.X);

        // TestInterfaces.meth3();
        // We can not create an object of Interface, but
        // we can access static final member using interface name and dot operator.
        // we can access interface objects using interface and dot operator. we can't create an object of interface.

        My1 m=new My1();
        m.meth333(); //Can have default methods also.
    }
}
