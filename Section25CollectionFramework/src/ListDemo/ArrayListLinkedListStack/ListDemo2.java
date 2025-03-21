package ListDemo.ArrayListLinkedListStack;
import java.util.*;

public class ListDemo2 {
    public static void main(String[] args) {
        //Object of array list and it ie generic type. Allowed integer type data
        ArrayList<Integer> al1 = new ArrayList<>(20);

        ArrayList<Integer> al2 = new ArrayList<>(List.of(50, 60, 70, 80, 90));

        al1.add(10);
        al1.add(0,5);
        al1.addAll(1, al2);
        al1.set(5,70);

        al1.set(6, 100);

        //Iterator just like for loop and loop.
        //Allowed only single directional movement
        Iterator<Integer> it=al1.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }

        //list iterator. Allowed Bi-directional movement.
        ListIterator<Integer> it2 = al1.listIterator();

        while(it2.hasNext())
        {
            System.out.println(it2.hasPrevious());
            System.out.println(it2.hasNext());
        }
        /*
        for(ListIterator<Integer> it= al1.iterator(); it.hasNext();)
        {
            java.lang.Integer x = it.next();
            System.out.println(x);
        }
        */

        /*for(Integer x:al1)
            System.out.println(x);*/
        //using for each loop.
        //for(var x:al1) also allowed.

        /*
        for(int i = 0; i < al1.size(); i++)
            System.out.println(al1.get(i));
        */

      /*  al1.forEach(n->System.out.println(n));
        al1.forEach(System.out::println);
        al1.forEach(n->show(n));

        static void show(int n)
        {
            if(n>60)
                System.out.println(n);
        }*/
    }
}