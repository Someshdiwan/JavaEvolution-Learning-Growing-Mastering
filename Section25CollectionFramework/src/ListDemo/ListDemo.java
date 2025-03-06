package ListDemo;
import java.util.*;

public class ListDemo {
    public static void main(String[] args) {
        //Object of array list and it ie generic type. Allowed integer type data
        ArrayList<Integer> al1 = new ArrayList<>(20);

        ArrayList<Integer> al2 = new ArrayList<>(List.of(50,60,70,80,90));

        al1.add(10);
        al1.add(0,5);
        //al1.addALl(1,al2);

        al1.addAll(al2);
        al1.add(5,70);

        System.out.println(al1.get(5));

        System.out.println(al1.indexOf(70));
        System.out.println(al1.lastIndexOf(70));

        //Checking whether the element present inside the list or not.
        System.out.println(al1.contains(50));

        //al1.retainAll(al2);

        System.out.println(al1);
    }
}
