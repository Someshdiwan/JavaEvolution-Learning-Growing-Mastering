package Package;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);

        // Sort in descending order using lambda.

        // Collections.sort(list, (a, b) -> b - a);
        // Or
        list.sort((a, b) -> b - a);

        //Collections.sort(list, new MyClass());
        System.out.println(list);
    }
}
