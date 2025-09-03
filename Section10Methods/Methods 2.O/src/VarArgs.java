import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(1, 2, 3, 4); // int varargs

        multiple(2, 3, "Kunal", "Rahul", "dvytsbhusc"); // mixed

        demo(5, 6, 7); // int varargs

        demo("A", "B", "C"); // String varargs
    }

    // Works with int array
    static void demo(int ...v) {
        System.out.println("Int demo: " + Arrays.toString(v));
    }

    // Works with String array
    static void demo(String ...v) {
        System.out.println("String demo: " + Arrays.toString(v));
    }

    // Mixed parameters: 2 fixed ints + varargs for strings
    static void multiple(int a, int b, String ...v) {
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("Strings: " + Arrays.toString(v));
    }

    // Simple int varargs
    static void fun(int ...v) {
        System.out.println("Fun: " + Arrays.toString(v));
    }
}
