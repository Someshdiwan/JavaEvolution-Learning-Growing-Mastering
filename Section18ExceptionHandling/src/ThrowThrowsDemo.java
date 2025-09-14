public class ThrowThrowsDemo {
    static int safeArea(int l, int b) {
        if (b == 0) throw new ArithmeticException("Denominator zero");
        return l / b;
    }

    static void controlledRecursion(int depth) {
        if (depth <= 0) return;
        controlledRecursion(depth - 1);
    }

    public static void main(String[] args) {
        try {
            controlledRecursion(1000);  // Safe recursion
            int r = safeArea(10, 2);
            System.out.println("Result: " + r);

            // Example of triggering exception
            int invalid = safeArea(10, 0);
            System.out.println("This will not print: " + invalid);
        }

        catch (ArithmeticException ex) {
            System.err.println("Bad arithmetic: " + ex);
        }
        catch (StackOverflowError err) {
            System.err.println("Stack overflow detected (bug): " + err);
            throw err;  // Re-throw to not hide serious errors
        }
    }
}
