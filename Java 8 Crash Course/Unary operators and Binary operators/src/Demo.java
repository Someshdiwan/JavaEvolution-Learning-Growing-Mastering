import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class Demo {
    public static void main(String[] args) {
        // UnaryOperator: Takes one argument and returns a value of the same type.
        // This lambda multiplies the input by 2.
        UnaryOperator<Integer> doubleValue = x -> 2 * x;

        // BinaryOperator: Takes two arguments of the same type and returns a value of the same type.
        // This lambda adds two integers.
        BinaryOperator<Integer> addValues = (x, y) -> x + y;

        // Using the apply method to execute the lambda expressions:
        int unaryResult = doubleValue.apply(5);
        int binaryResult = addValues.apply(3, 4);

        System.out.println("Result of UnaryOperator (5 * 2): " + unaryResult);
        System.out.println("Result of BinaryOperator (3 + 4): " + binaryResult);
    }
}
