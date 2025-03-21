import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;


public class OperatorInterfaceDemo {
    public static void main(String[] args) {
        // UnaryOperator, BinaryOperator Both Are interface.
        // UnaryOperator: multiplies its input by 2

        UnaryOperator<Integer> a = x -> 2 * x;

        // BinaryOperator: adds two integers
        BinaryOperator<Integer> b = (x, y) -> x + y;

        // actual results, call apply() on the operators.
        System.out.println("Unary result (2 * 5): " + a.apply(5));
        System.out.println("Binary result (5 + 5): " + b.apply(5, 5));
    }
}

/*
Lambda Expression Execution:
Use the apply method (for both UnaryOperator and BinaryOperator) to execute the lambda and obtain a result.

Simply printing the lambda variable (e.g., System.out.println(a);) shows the reference, not the computed value.

Unused Methods:
In Version 1, the sum method is defined but not used.
Version 2 is a cleaner example if you want to focus only on lambda expressions.
*/