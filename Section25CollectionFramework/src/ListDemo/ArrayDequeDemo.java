package ListDemo;

import java.util.ArrayDeque;

public class ArrayDequeDemo {
    public static void main(String[] args) {
    ArrayDeque<Integer> DQ  = new ArrayDeque<>();
    /*
    new ArrayDeque<>();  Constructor.
    Takes Constant time.
    */

    DQ.offerLast(10);
    DQ.offerLast(20);
    DQ.offerLast(30);
    DQ.offerLast(40);

    //DQ.pollFirst(); //Inserting from last and deleting from first.Acting like a Queue.
    //DQ.pollLast();  //Stack delete and insert from last.

/*  DQ.offerFirst(1);
    DQ.offerFirst(2);
    DQ.offerFirst(3);
*/

    DQ.forEach((x)-> System.out.println(x));
    }
}