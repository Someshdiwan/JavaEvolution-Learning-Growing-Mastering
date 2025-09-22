import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOps {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3);

        // 1. collect → gathers stream elements into a collection (List, Set, Map, etc.)
        list.stream().skip(1).collect(Collectors.toList());
        list.stream().skip(1).toList(); // Java 16+ shorthand

        // 2. forEach → performs an action for each element
        list.stream().forEach(x -> System.out.println(x));

        // 3. reduce → combines elements to produce a single result
        Optional<Integer> optionalInteger = list.stream().reduce(Integer::sum);
        System.out.println(optionalInteger.get()); // sum of all elements

        // 4. count → returns number of elements in the stream
        System.out.println("Count: " + list.stream().count());

        // 5. anyMatch, allMatch, noneMatch → short-circuiting terminal ops
        boolean b = list.stream().anyMatch(x -> x % 2 == 0);   // any element even?
        System.out.println(b);
        boolean b1 = list.stream().allMatch(x -> x > 0);       // all elements > 0?
        System.out.println(b1);
        boolean b2 = list.stream().noneMatch(x -> x < 0);      // none element negative?
        System.out.println(b2);

        // 6. findFirst, findAny → retrieve elements
        System.out.println(list.stream().findFirst().get());   // always first element
        System.out.println(list.stream().findAny().get());     // may return any (parallel streams)

        // 7. toArray() → collect elements into an array
        Object[] array = Stream.of(1, 2, 3).toArray();

        // 8. min / max → compute smallest/largest element
        System.out.println("max: " + Stream.of(2, 44, 69).max((o1, o2) -> o2 - o1));
        System.out.println("min: " + Stream.of(2, 44, 69).min(Comparator.naturalOrder()));

        // 9. forEachOrdered → maintains encounter order (important in parallel streams)
        List<Integer> numbers0 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("Using forEach with parallel stream:");
        numbers0.parallelStream().forEach(System.out::println); // order not guaranteed
        System.out.println("Using forEachOrdered with parallel stream:");
        numbers0.parallelStream().forEachOrdered(System.out::println); // maintains order


        // Example: Filtering and Collecting Names
        List<String> names = Arrays.asList("Anna", "Bob", "Charlie", "David");
        System.out.println(names.stream().filter(x -> x.length() > 3).toList());

        // Example: Squaring and Sorting Numbers
        List<Integer> numbers = Arrays.asList(5, 2, 9, 1, 6);
        System.out.println(numbers.stream().map(x -> x * x).sorted().toList());

        // Example: Summing Values
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(integers.stream().reduce(Integer::sum).get());

        // Example: Counting Occurrences of a Character
        String sentence = "Hello world";
        System.out.println(sentence.chars().filter(x -> x == 'l').count()); // count 'l'

        // Example: Stream Reuse Limitation
        // Streams cannot be reused after a terminal operation has been called
        Stream<String> stream = names.stream();
        stream.forEach(System.out::println);
        // List<String> list1 = stream.map(String::toUpperCase).toList(); // throws IllegalStateException

        // NOTE:
        // - Terminal operations = trigger execution of the stream pipeline.
        // - Once terminal op is invoked, the stream is consumed and cannot be reused.
        // - Some terminal ops are "short-circuiting" (anyMatch, findFirst, etc.).
        // - Distinction: stateful Vs stateless operations
    }
}
