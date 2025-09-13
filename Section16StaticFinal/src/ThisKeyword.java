class A {
    public A() {
        System.out.println("in A");
    }

    public A(int n) {
       super();
       System.out.println("in A int ");
    }
}

class B extends A {
    public B() {
        System.out.println("in B");
    }

    public B(int m) {
        super(m);
        System.out.println("in B in int");
    }
}

public class ThisKeyword {
    public static void main(String[] args) {
     /*   B obj = new B(); */
     //calling default constructor without passing a value parameter valur.

        //Whenever you create a object it call the constructor of class.

        A obj2 = new A(9);
        B obj1 = new B(5);
    }
}
