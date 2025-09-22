package FunctionChaining;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<String, String> function = s -> s.toUpperCase();

        Function<String, String> function2 = s -> s.substring(0, 3);

        Function<String, String> stringStringFunction = function2.andThen(function2);

        System.out.println(stringStringFunction.apply("VIP"));
    }
}
