class Parent {
    String name;

    void method() {
        System.out.println("Method from Parent");
    }
}

class Child extends Parent {
    int id;

    @Override
    void method() {
        System.out.println("Method from Child");
    }
}

public class UpDownCasting {
    public static void main(String[] args) {

        /*Upcasting*/
        Parent p = new Child();
        p.name = "Up Casting";
        System.out.println(p.name);

        /*parent class method is overridden method hence this will be executed*/
        p.method();

        /* Trying to Downcasting Implicitly Child c = new Parent(); - > compile time error Downcasting Explicitly*/
        Child c = (Child)p;
        c.id = 1;

        System.out.println(c.name);
        System.out.println(c.id);
        c.method();
    }
}
