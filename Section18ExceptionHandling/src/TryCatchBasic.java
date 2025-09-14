public class TryCatchBasic {

    static int meth1() {
        // Fix division by zero by adding a check
        try {
            return 10 / 0;
        } catch (ArithmeticException e) {
            System.err.println("ArithmeticException caught in meth1: " + e);
            return 0;  // Return default or error code
        }
    }

    static void meth2(int depth) {
        // Controlled recursion instead of infinite recursion
        if (depth <= 0) return;
        meth2(depth - 1);
    }

    static void meth3(int depth) {
        // Controlled recursion instead of infinite recursion
        if (depth <= 0) return;
        meth3(depth - 1);
    }

    public static void main(String[] args) {
        try {
            meth2(10);  // Safe recursion
            meth3(10);  // Safe recursion
            int result = meth1();  // Will trigger ArithmeticException
            System.out.println("Result: " + result);
        } catch (Throwable e) {
            System.out.println("Caught in main: " + e);
        }
    }
}

/*
Classes inside another class should be static if accessed in the static main.
Handle base cases in recursive methods to avoid infinite loops.
ArithmeticException is unchecked, so it should be handled properly if meth1() is used.
*/
