package FunctionalProgramming;

import java.util.function.Predicate;

public class Main3 {
    public static void main(String[] args) {
        // Predicate<Integer> isEven = x % 2 == 0;
        // Lambda Expression and We can also say that is Function.
        // We are storing a function as a Variable.

        Predicate<String> startsWithLetterV = x -> x.toLowerCase().charAt(0) == 'v';
        System.out.println(startsWithLetterV.test("Jack"));
    }
}
