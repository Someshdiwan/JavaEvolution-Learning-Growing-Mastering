package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Apple","Banana","Cherry");
        Stream<String> myStream = list.stream();

        String[] array = {"Apple","Banana","Cherry"};

        Stream<String> stream = Arrays.stream(array);

        Stream<Integer> integerStream = Stream.of(1,2,3);
        Stream<Integer> limit = Stream.iterate(0,n -> n + 1).limit(100);
        System.out.println(limit);

        Stream<Integer> limit1 = Stream.generate(() -> Integer.valueOf("Hello")).limit(5);

        Stream<Integer> limit2 = Stream.generate(() -> (int) Math.random() * 100).limit(100);
    }
}
