import java.util.*;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        // 1. Collecting to a List
        // Filter names starting with "A" and collect them into a List.
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Ankit");
        List<String> res = names.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println("Names starting with A: " + res);


        // 2. Collecting to a Set
        // Collects numbers into a Set, automatically removing duplicates.
        List<Integer> nums = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        Set<Integer> set = nums.stream().collect(Collectors.toSet());
        System.out.println("Unique Numbers (Set): " + set);


        // 3. Collecting to a Specific Collection
        // Collect into ArrayDeque instead of List/Set.
        ArrayDeque<String> deque = names.stream()
                .collect(Collectors.toCollection(ArrayDeque::new));
        System.out.println("Collected into ArrayDeque: " + deque);


        // 4. Joining Strings
        // Join names into one string, separated by commas.
        String concatenated = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.joining(", "));
        System.out.println("Concatenated Names: " + concatenated);


        // 5. Summarizing Data
        // Provides count, sum, min, average, max for integer stream.
        List<Integer> numbers = Arrays.asList(2, 3, 5, 7, 11);
        IntSummaryStatistics stats = numbers.stream()
                .collect(Collectors.summarizingInt(x -> x));
        System.out.println("Summary Stats: " + stats);


        // 6. Calculating Averages
        Double avg = numbers.stream().collect(Collectors.averagingInt(x -> x));
        System.out.println("Average: " + avg);


        // 7. Counting Elements
        Long count = numbers.stream().collect(Collectors.counting());
        System.out.println("Count: " + count);


        // 8. Grouping Elements
        List<String> words = Arrays.asList("hello", "world", "java", "streams", "collecting");
        System.out.println("Group by length: " +
                words.stream().collect(Collectors.groupingBy(String::length)));
        System.out.println("Group + join: " +
                words.stream().collect(Collectors.groupingBy(String::length, Collectors.joining(", "))));
        System.out.println("Group + count: " +
                words.stream().collect(Collectors.groupingBy(String::length, Collectors.counting())));


        // 9. Partitioning Elements
        // Partition words into two groups: >5 letters and <=5 letters.
        System.out.println("Partition: " +
                words.stream().collect(Collectors.partitioningBy(x -> x.length() > 5)));


        // 10. Mapping and Collecting
        // Transform words to uppercase before collecting.
        System.out.println("Mapped to Uppercase: " +
                words.stream().collect(Collectors.mapping(String::toUpperCase, Collectors.toList())));


        // 11. Creating a Map with toMap
        List<String> fruits = Arrays.asList("Apple", "Banana", "Cherry");
        Map<String, Integer> fruitMap = fruits.stream()
                .collect(Collectors.toMap(x -> x.toUpperCase(), x -> x.length()));
        System.out.println("Fruit Map: " + fruitMap);


        // 12. Handling Duplicate Keys with Merge Function
        List<String> words2 = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
        Map<String, Integer> freqMap = words2.stream()
                .collect(Collectors.toMap(k -> k, v -> 1, (x, y) -> x + y));
        System.out.println("Word Frequency: " + freqMap);


        // 13. Reduction vs Summing Collector
        Map<String, Integer> items = new HashMap<>();
        items.put("Apple", 10);
        items.put("Banana", 20);
        items.put("Orange", 15);

        // Using reduce()
        int sumReduce = items.values().stream().reduce(0, Integer::sum);
        System.out.println("Sum using reduce(): " + sumReduce);

        // Using summingInt()
        int sumCollector = items.values().stream().collect(Collectors.summingInt(x -> x));
        System.out.println("Sum using summingInt(): " + sumCollector);
    }
}

/*
Java Collectors API & Stream Operations – Revision Notes

1. Collectors.toList()  
   → Collects elements into a List (keeps duplicates, preserves order).

2. Collectors.toSet()  
   → Collects elements into a Set (removes duplicates, no guaranteed order).

3. Collectors.toCollection(Supplier)  
   → Collects elements into a user-defined collection (e.g., ArrayDeque).

4. Collectors.joining(delimiter)  
   → Concatenates elements into a single String with a delimiter.

5. Collectors.summarizingInt()  
   → Provides count, sum, min, average, max as IntSummaryStatistics.

6. Collectors.averagingInt()  
   → Directly calculates the average of numbers.

7. Collectors.counting()  
   → Returns the count of elements.

8. Collectors.groupingBy()  
   → Groups elements by classifier function.  
      - groupingBy(String::length) → groups by string length  
      - groupingBy(..., Collectors.joining()) → groups + joins  
      - groupingBy(..., Collectors.counting()) → groups + counts  

9. Collectors.partitioningBy(predicate)  
   → Splits into two groups (true/false) based on condition.

10. Collectors.mapping()  
    → Applies transformation before collecting.

11. Collectors.toMap(keyMapper, valueMapper)  
    → Creates a Map from stream elements.  
       Example: {APPLE=5, BANANA=6, CHERRY=6}

12. Collectors.toMap with merge function  
    → Handles duplicate keys.  
       Example: word frequency counter.

13. reduce() vs summingInt()  
    - reduce(): Manual reduction, returns Optional or value.  
    - summingInt(): Built-in collector, cleaner for summation.

Real-world usage:
✔ Data transformation (filter/map/reduce).  
✔ Counting/grouping/partitioning records from DB.  
✔ Summaries for reporting dashboards.  
✔ Frequency analysis (logs, words, etc.).
*/
