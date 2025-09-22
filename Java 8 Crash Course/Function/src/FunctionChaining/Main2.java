package FunctionChaining;

import java.util.function.Function;

public class Main2 {
    public static void main(String[] args) {
        Function<Integer, Integer> function1 = x -> 2 * x;
        Function<Integer, Integer> function2 = x -> x * x *x;

        System.out.println(function1.andThen(function2).apply(3));
        System.out.println(function2.andThen(function1).apply(1));
    }
}
