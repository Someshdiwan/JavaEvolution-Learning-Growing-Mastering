// When you have overloaded methods, Java may use widening to match the appropriate method signature.
public class Example {
    void show(int x) {
        System.out.println("Integer: " + x);
    }
    void show(double x) {
        System.out.println("Double: " + x);
    }

    public static void main(String[] args) {
        Example obj = new Example();
        obj.show(5); // int is widened to match the double version of the method
    }
}
