import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class IntermediateOps {
    public static void main(String[] args) {
        // Intermediate operations transform a Stream into another Stream.
        // They are "lazy", meaning they don't execute until a terminal operation is invoked.

        // 1. filter → filters elements based on a predicate
        List<String> list = Arrays.asList("Akshit", "Ram", "Shyam", "Ghanshyam", "Akshit");
        Stream<String> filteredStream = list.stream().filter(x -> x.startsWith("A"));
        System.out.println(filteredStream); // Just prints stream object, not data (lazy!)

        // Applying a terminal operation (count) → actually triggers filter
        long res = list.stream().filter(x -> x.startsWith("A")).count();
        System.out.println(res); // Number of elements starting with "A"

        // 2. map → transforms each element using a function
        Stream<String> stringStream = list.stream().map(String::toUpperCase);

        // 3. sorted → sorts elements (stateful operation)
        Stream<String> sortedStream = list.stream().sorted(); // natural order
        Stream<String> sortedStreamUsingComparator = list.stream()
                .sorted((a, b) -> a.length() - b.length()); // custom comparator by length

        // 4. distinct → removes duplicates
        System.out.println(list.stream().filter(x -> x.startsWith("A")).distinct().count());

        // 5. limit → truncates the stream to given size
        System.out.println(Stream.iterate(1, x -> x + 1).limit(100).count()); // 100

        // 6. skip → skips first 'n' elements
        System.out.println(Stream.iterate(1, x -> x + 1).skip(10).limit(100).count()); // 100 (but starts after skipping 10)

        // 7. peek → performs an action on each element as it flows (useful for debugging)
        Stream.iterate(1, x -> x + 1)
                .skip(10)
                .limit(100)
                .peek(System.out::println) // prints elements as they pass through
                .count();

        // 8. flatMap → flattens nested structures into a single stream
        // Useful when dealing with collections of collections
        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("apple", "banana"),
                Arrays.asList("orange", "kiwi"),
                Arrays.asList("pear", "grape")
        );
        System.out.println(listOfLists.get(1).get(1)); // "kiwi"
        System.out.println(listOfLists.stream()
                .flatMap(x -> x.stream()) // flatten list of lists
                .map(String::toUpperCase) // transform each element
                .toList());

        // Example with sentences → splitting into words
        List<String> sentences = Arrays.asList(
                "Hello world",
                "Java streams are powerful",
                "flatMap is useful"
        );
        System.out.println(sentences.stream()
                .flatMap(sentence -> Arrays.stream(sentence.split(" "))) // split each sentence into words
                .map(String::toUpperCase)
                .toList());
    }
}
