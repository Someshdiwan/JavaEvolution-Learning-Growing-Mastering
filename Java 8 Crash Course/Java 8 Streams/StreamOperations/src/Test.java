import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,6,7,8,8,9,4444,5,6,7,7,7,73454,0,1,1);

        // Find square of all the numbers in the list.
        List<Integer> squaredList =
                list.stream()
                        .map(x -> x * x) // map() transforms each element → x^2
                        .collect(Collectors.toList());
        System.out.println("Squares: " + squaredList);


        // Printing even numbers from the list.
        List<Integer> FilteredList =
                list.stream().
                        filter(x -> x % 2 == 0).
                        collect(Collectors.toList());
        //x -> x % 2 == 0 predicate likha hai.
        System.out.println(FilteredList);


        // Every even number divide by 2.
        List<Integer> MappedList =
                FilteredList.stream().
                        map(x -> x / 2).
                        collect(Collectors.toList());
        System.out.println(MappedList);

        List<Integer> MappedAlternative =
                list.stream().
                        filter(x -> x % 2 == 0).
                        map(x -> x / 2).
                        collect(Collectors.toList());
        System.out.println(MappedAlternative);

        List<Integer> MappedDistinct =
                list.stream().
                filter(x -> x % 2 == 0).
                        map(x -> x / 2).
                        distinct().
                        collect(Collectors.toList());
        System.out.println(MappedDistinct);

        List<Integer> MappedSorted =
                list.stream().
                filter(x -> x % 2 == 0).
                        map(x -> x / 2).
                        distinct().sorted().
                        collect(Collectors.toList());
        System.out.println(MappedSorted);

        List<Integer> MappedSortToYourOwnNotNaturalOrderSorting =
                list.stream().
                filter(x -> x % 2 == 0).map(x -> x / 2).
                distinct().sorted((a, b) -> (b - a)).
                collect(Collectors.toList());

        System.out.println(MappedSortToYourOwnNotNaturalOrderSorting + "Custom Sorting");

        List<Integer> CustomSort =
                list.stream().
                        filter(x -> x % 2 == 0).map(x -> x / 2).
                        distinct().sorted((a, b) -> (b - a)).
                        limit(4).
                        collect(Collectors.toList());

        System.out.println(CustomSort + "Custom Sorting Only show 4 element");

        List<Integer> Limit5 =
                list.stream().
                        filter(x -> x % 2 == 0).map(x -> x / 2).
                        distinct().sorted((a, b) -> (b - a)).
                        limit(4).
                        skip(1).
                        collect(Collectors.toList());

        System.out.println(Limit5);
    }
}
