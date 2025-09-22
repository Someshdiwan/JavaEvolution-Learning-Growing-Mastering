import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        // Imperative Programming
        // Focus: HOW to do it step-by-step
        int sumImperative = 0;
        for (int n : numbers) {
            if (n % 2 == 0) {
                sumImperative += n;
            }
        }
        System.out.println("Imperative Sum of Even Numbers: " + sumImperative);

        // Declarative Programming
        // Focus: WHAT result we want
        int sumDeclarative = numbers.stream()        // convert list to stream
                .filter(n -> n % 2 == 0) // keep only even numbers
                .mapToInt(Integer::intValue) // convert Integer → int
                .sum();
        System.out.println("Declarative Sum of Even Numbers: " + sumDeclarative);
    }
}

/*
1. Imperative Style:
   - You tell the computer **how** to achieve the result.
   - Example here:
       ➝ create a variable sum = 0
       ➝ loop through list
       ➝ check even condition manually
       ➝ add to sum
   - Code is longer, more error-prone, but gives explicit control.

2. Declarative Style:
   - You tell the computer **what** you want.
   - Example here:
       ➝ take numbers
       ➝ filter evens
       ➝ sum them up
   - No explicit loop or condition handling written by you.
   - Java Streams API handles the details internally.

3. Key Difference:
   - Imperative = *HOW to do it (step-by-step instructions)*.
   - Declarative = *WHAT result you want (describe the logic)*.

✔ Imperative: Loop + condition + manual sum.
✔ Declarative: Streams + filter + sum → concise, readable.
✔ Declarative programming improves readability and reduces boilerplate.
*/
