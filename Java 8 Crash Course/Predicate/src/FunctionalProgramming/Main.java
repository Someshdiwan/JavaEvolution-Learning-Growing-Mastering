package FunctionalProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        numbers.stream().filter(x -> x > 100000);

        int sum = numbers.stream().filter(n -> n % 2 == 0).mapToInt(n -> n).sum();
        System.out.println(sum);
    }
}

/*
1. numbers list:
   - `Arrays.asList(1,2,3,4,5,6,7,8,9,10)` → ek fixed list of integers banayi.

2. Stream + Filter (x -> x > 100000):
   - `numbers.stream().filter(x -> x > 100000);`
   - Ye line technically stream banata hai aur filter karta hai,
     but koi terminal operation (like `collect`, `forEach`) nahi diya gaya →
     isliye ye actually kuch **execute nahi karega**.
   - Matlab "lazy evaluation" hogi aur ye line ka koi output nahi aayega.

3. Even numbers filter + Sum:
   - `numbers.stream().filter(n -> n % 2 == 0)`
     → Sirf even numbers (2,4,6,8,10) pass honge.
   - `.mapToInt(n -> n)`
     → Unko int stream me convert kiya for calculation.
   - `.sum()`
     → Sab even numbers add kiye → 2+4+6+8+10 = 30.

✔ Streams = sequence of elements processed with pipeline operations.
✔ Filter = condition apply karta hai (true wale elements aage pass hote hain).
✔ MapToInt + sum = transformation + aggregation.
✔ Is program me → even numbers ka sum nikalta hai (30).
✔ Pehla filter line kaam nahi karti because koi terminal operation nahi hai.
*/
