import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        // Predicate --> Functional interface & it is a Boolean valued function.
        Predicate<Integer> isEven = x -> x % 2 == 0;

        //Kutch check karna hai toh predicate use karna.Bas Ek condition hold karta hai.
        //ek condition ko variable store mai store karta hai.
        System.out.println(isEven.test(4));

        Predicate<String> isWordStartingWithLetterA = x -> x.startsWith("S");
        System.out.println(isWordStartingWithLetterA.test("Stark"));

        //combining a predicate.
        Predicate<String> isWordStartingWithLetterZ = x -> x.startsWith("Z");
        Predicate<String> isWordEndingWithA = x -> x.startsWith("A");
        Predicate<String> Check = isWordEndingWithA.and(isWordEndingWithA);

        System.out.println(Check.test("AoooooZ"));

        Predicate<String> isWordStartingWithA = x -> x.toLowerCase().startsWith("a");
        Predicate<String> isWordEndingWithT = x -> x.toLowerCase().endsWith("t");
        Predicate<String> and = isWordStartingWithA.and(isWordEndingWithT);
        System.out.println(and.test("Jackson"));


        Predicate<Integer> p = x -> x >= 1000000;
        System.out.println(p.test(1000000));

        int salary = 90;
        if (p.test(salary)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
