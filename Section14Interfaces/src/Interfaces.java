interface Test {
    void meth1();
    void meth2();
}

class My implements Test {
    @Override
    public void meth1() {
        System.out.println("Meth 1 of My Class");
    }

    public void meth2() {
        System.out.println("Meth 2 of my class");
    }

    public void mehth3() {
        System.out.println("Meth 3 my class");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        Test t = new My();
        t.meth1();
        t.meth2();
        //Achieving dynamic method dispatch in short Run Time polymorphism. Method Overriding

        // Uncommenting the below line will cause a compilation error
        // t.meth3(); // Not accessible because `t` is of type Test
    }
}
