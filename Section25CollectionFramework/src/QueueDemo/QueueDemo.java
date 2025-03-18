package QueueDemo;

import java.util.LinkedList;

public class QueueDemo {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(3);
        list.add(2);
        list.add(1);

        System.out.println(list);
        System.out.println("Removed First: "+list.removeFirst());

        LinkedList<Integer> list2 = new LinkedList<>();

        list2.addLast(1); //Enqueue is the operation of adding an element to the end (rear) of a queue.
        list2.addLast(2); //Enqueue
        list2.addLast(3); //Enqueue

        System.out.println(list2);
        Integer i = list2.removeFirst(); //dequeue bolte operation.
        System.out.println("Enqueue: "+list2); //linkedList is acting as a Queue.

        System.out.println(list2.peek());
    }
}