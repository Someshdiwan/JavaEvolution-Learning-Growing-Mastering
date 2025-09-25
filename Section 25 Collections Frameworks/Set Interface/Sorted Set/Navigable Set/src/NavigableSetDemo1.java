import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetDemo1 {
    public static void main(String[] args) {
        NavigableSet<Integer> set = new TreeSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);

        System.out.println("Original Set: " + set);
        System.out.println("lower(30): " + set.lower(30));
        System.out.println("floor(30): " + set.floor(30));
        System.out.println("ceiling(25): " + set.ceiling(25));
        System.out.println("higher(30): " + set.higher(30));
        System.out.println("Descending Set: " + set.descendingSet());
    }
}
