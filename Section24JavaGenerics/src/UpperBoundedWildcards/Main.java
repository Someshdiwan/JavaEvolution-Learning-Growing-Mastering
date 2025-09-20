package UpperBoundedWildcards;

import java.util.List;

public class Main {
    public static double sum(List<? extends Number> numbers) {
        double total = 0.0;

        for (Number number : numbers) {
            total += number.doubleValue();
        }
        return total;
    }

    public static void main(String[] args) {
        List<Integer> intList = List.of(1, 2, 3);
        List<Double> doubleList = List.of(1.1, 2.2, 3.3);

        System.out.println("Sum of integers: " + sum(intList));
        System.out.println("Sum of doubles: " + sum(doubleList));
    }
}

/*
Explanation:
List<? extends Number> allows the sum method to accept a List of any type that extends Number, such as Integer, Double,
Float, etc.
The method can read elements from the list, but it cannot add elements to it
(because it only knows that the elements are some subtype of Number, but it doesn't know the exact type).
This flexibility is achieved using the upper-bounded wildcard ? extends Number.
*/
