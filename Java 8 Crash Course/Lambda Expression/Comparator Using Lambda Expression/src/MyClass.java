import java.util.Comparator;

public class MyClass implements Comparator<Integer> {
    @Override
    public int compare(Integer a, Integer b) {
        return a-b; //ascending order main sort hoar hai. and b-a = descending order.
    }
}
