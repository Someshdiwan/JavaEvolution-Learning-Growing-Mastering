package FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main2 {
    public static void main(String[] args) {
        Predicate<Integer> isEven = x -> x % 2 == 0;
        List<Integer> numbers = Arrays.asList(1,2,3,5,6,7);

        for(Integer i : numbers) {
            if(isEven.test(i)) {
                isEven.test(i);{
                    System.out.println(i);
                }
            }
        }
    }
}
