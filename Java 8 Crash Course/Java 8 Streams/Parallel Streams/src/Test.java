import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        // sing parallelStream() → parallel processing with multiple threads.
        // By default, the number of threads = no. of available CPU cores.
        List<Integer> squaredParallel =
                list.parallelStream()
                        .map(x -> x * x) // Each element → squared
                        .collect(Collectors.toList());

        System.out.println("Squares (Parallel): " + squaredParallel);

        // Filtering even numbers in parallel
        List<Integer> evenParallel =
                list.parallelStream()
                        .filter(x -> x % 2 == 0)
                        .collect(Collectors.toList());

        System.out.println("Even Numbers (Parallel): " + evenParallel);

        // Custom transformation → Divide even numbers by 2
        List<Integer> dividedParallel =
                list.parallelStream()
                        .filter(x -> x % 2 == 0)
                        .map(x -> x / 2)
                        .collect(Collectors.toList());

        System.out.println("Even Numbers ÷ 2 (Parallel): " + dividedParallel);

        // Distinct + Sorted (Parallel)
        List<Integer> distinctSortedParallel =
                list.parallelStream()
                        .map(x -> x * 2) // Multiply by 2
                        .distinct()
                        .sorted()
                        .collect(Collectors.toList());

        System.out.println("Distinct + Sorted (Parallel): " + distinctSortedParallel);
    }
}

