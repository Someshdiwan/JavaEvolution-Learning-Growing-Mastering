import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<String> startsWithLetterV = x -> x.toLowerCase().charAt(0) == 'v';

        Predicate<String> endsWithLetterL = x -> x.toLowerCase().charAt(x.length() - 1) == 'l';

        Predicate<String> and = startsWithLetterV.and(endsWithLetterL);

        Predicate<String> or = startsWithLetterV.or(endsWithLetterL);

        Predicate<String> startsWithV = x -> x.startsWith("V");


        System.out.println("AND Test with 'VIP' → " + and.test("VIP"));
        System.out.println("OR Test with 'Vivek' → " + or.test("Vivek"));

        // Negate the predicate.
        Predicate<String> negate = startsWithV.negate();
        System.out.println("Negate Test with 'VIP' → " + negate.test("VIP"));
        System.out.println("Negate Test with 'ABC' → " + negate.test("ABC"));
    }
}
