import java.util.*;
import java.util.stream.Collectors;

public class CollectorsDemo {
    public static void main(String[] args) {
        /* Collectors is a utility class, provides a set of methods to create common collectors. */

        /* Example 1: Collecting Names by Length
        l1.stream().collect(Collectors.groupingBy(String::length)):
        - Group names based on their length.
        - Key: length of string.
        - Value: list of names having that length.
        Input: ["Anna", "Bob", "Alexander", "Brian", "Alice"]
        Result: {3=[Bob], 4=[Anna], 5=[Brian, Alice], 9=[Alexander]}  */
        List<String> l1 = Arrays.asList("Anna", "Bob", "Alexander", "Brian", "Alice");
        System.out.println(l1.stream().collect(Collectors.groupingBy(String::length)));


        /* Example 2: Counting Word Occurrences
        Arrays.stream(sentence.split(" ")).collect(Collectors.groupingBy(...)):
        - Key: unique word.
        - Value: how many times that word occurs.
        Input: "hello world hello java world"
        Result: {hello=2, world=2, java=1} */
        String sentence = "hello world hello java world";
        System.out.println(Arrays.stream(sentence.split(" ")).collect(Collectors.groupingBy(x -> x, Collectors.counting())));


        /* Example 3: Partitioning Even and Odd Numbers
           l2.stream().collect(Collectors.partitioningBy(x -> x % 2 == 0)):
           - Predicate: x % 2 == 0 (true for even, false for odd).
           - Splits elements into two groups:
             true → even numbers, false → odd numbers.
           Input: [1, 2, 3, 4, 5, 6]
           Result: {false=[1, 3, 5], true=[2, 4, 6]} */
        List<Integer> l2 = Arrays.asList(1, 2, 3, 4, 5, 6);
        System.out.println(l2.stream().collect(Collectors.partitioningBy(x -> x % 2 == 0)));


        /* Example 4: Summing Values in a Map
           items.values().stream().reduce(Integer::sum):
           - Reduce operation to sum values manually.
           items.values().stream().collect(Collectors.summingInt(x -> x)):
           - Built-in collector to sum integer values.
           Input Map: {Apple=10, Banana=20, Orange=15}
           Result: 45 */
        Map<String, Integer> items = new HashMap<>();
        items.put("Apple", 10);
        items.put("Banana", 20);
        items.put("Orange", 15);
        System.out.println(items.values().stream().reduce(Integer::sum));
        System.out.println(items.values().stream().collect(Collectors.summingInt(x -> x)));


        /* Example 5: Creating a Map from Stream Elements
           fruits.stream().collect(Collectors.toMap(...)):
           - Key: fruit name in uppercase (x -> x.toUpperCase()).
           - Value: length of fruit name (x -> x.length()).
           Input: ["Apple", "Banana", "Cherry"]
           Result: {APPLE=5, BANANA=6, CHERRY=6} */
        List<String> fruits = Arrays.asList("Apple", "Banana", "Cherry");
        System.out.println(fruits.stream().collect(Collectors.toMap(x -> x.toUpperCase(), x -> x.length())));


        /* Case 2: Counting Frequency of Words
           words2.stream().collect(Collectors.toMap(...)):
           - Key: the word itself (k -> k).
           - Value: initial count = 1 (v -> 1).
           - Merge function: (x, y) -> x + y → sum frequencies.
           Input: ["apple", "banana", "apple", "orange", "banana", "apple"]
           Result: {apple=3, banana=2, orange=1} */
        List<String> words2 = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
        System.out.println(words2.stream().collect(Collectors.toMap(k -> k, v -> 1, (x, y) -> x + y)));
    }
}
