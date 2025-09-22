package Package2;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Integer> s = new TreeSet<>();
        s.add(22);
        s.add(1);
        s.add(13);
        System.out.println("Before Manual sorting: "+s);

        Set<Integer> ss = new TreeSet<>((a,b) -> b -a); //Comparator.
        ss.add(22);
        ss.add(1);
        ss.add(13);
        System.out.println("After Manual sorting: "+ss);
    }
}
