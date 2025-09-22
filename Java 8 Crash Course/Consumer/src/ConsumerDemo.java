import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        // Consumer: Only Consumes doest return any.
        Consumer<Integer> print = x -> System.out.println(x);
        print.accept(7);

        List<Integer> list = Arrays.asList(1, 2, 3);
        Consumer<List<Integer>> printList = x -> {
            for (int i : x) {
                System.out.println(i);
            }
        };
        printList.accept(list);
    }
}
