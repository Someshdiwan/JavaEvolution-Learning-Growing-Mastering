import java.util.*;

public class TreeSetBasics1 {
    public static void main(String[] args) {
        TreeSet<Integer> TS = new TreeSet<>((List.of(10,30,50,70,10,40)));

        //Tree set implements the collection interface you can also write this like below.
        //But you only access the method inside the Collection Interfaces.
        //Collection<Integer> TS2 = new TreeSet<>((List.of(10,30,50,70,10,40)));
        //System.out.println(TS2.);

        //Tree set also implements a sorted set.You can take references of sorted set.
        //SortedSet<Integer> TS23 = new TreeSet<>((List.of(10,30,50,70,10,40)));
        //TS3.//You can call the methods which are present inside the sorted set.

        TS.add(25);
        System.out.println("Returns the least element in this set greater than or equal to the given element, or null if there is no such element: "+ TS.ceiling ( 55));

        System.out.println("\n Checking whether the element is present or not: "+TS.contains(45));

        TS.ceiling(Integer.SIZE);
        TS.ceiling(40);
        System.out.println((TS));
    }
}
