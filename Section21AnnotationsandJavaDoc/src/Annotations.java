class OldClass {
    public void display() {
        System.out.println("Hello");
    }

    @Deprecated
    public void show() {
        System.out.println("Hi");
    }
}

public class Annotations {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        OldClass o=new OldClass();
        o.show(); //Deprecated Method
    }
}
