import java.util.*;

public class LinkedListDemo3 {
    public static void main(String[] args) {
        LinkedList<Integer> ll1 = new LinkedList<>();

        LinkedList<Integer> ll2 = new LinkedList<>(List.of(50, 60, 70, 80, 90));

        ll1.add(10);                         // ll1 = [10]
        ll1.add(0, 5);        // ll1 = [5, 10]
        ll1.addAll(1, ll2);           // ll1 = [5, 50, 60, 70, 80, 90, 10]
        ll1.set(5, 70);                    // ll1 = [5, 50, 60, 70, 80, 70, 10]

        ll1.addFirst(3);
        ll1.addLast(200);

        ll1.forEach(n->show(n));

        System.out.println("Last Element is: " + ll1.getLast());
        /* System.out.println(ll1.pollFirst()); */

        System.out.print("The size of the LinkedList is: " + ll1.size()+ "\n" );

        Iterator<Integer> descItr = ll1.descendingIterator();
        System.out.print("Elements in reverse order:");

        while (descItr.hasNext()) {
            System.out.print(" "+descItr.next());
        }
        System.out.println("\n"+"First Element in list is: "+ll1.peek());
    }

    static void show(int n) {
        System.out.println(n);
    }
}
