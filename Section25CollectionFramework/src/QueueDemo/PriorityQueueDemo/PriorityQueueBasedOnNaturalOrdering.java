package QueueDemo.PriorityQueueDemo;

import java.util.PriorityQueue;

public class PriorityQueueBasedOnNaturalOrdering {
    public static void main(String[] args) {
        // part of the Queue interface
        // orders elements based on their natural ordering (for primitives lowest first)
        // custom comparator for customised ordering
        // does not allow null elements
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        //PriorityQueue<Integer> pq = new PriorityQueue<>((x,y)->x-y);

        pq.add(15);
        pq.add(10);
        pq.add(30);
        pq.add(5);
        System.out.println(pq); // not sorted

        //Queue Retrieves and removes the head of this queue, or returns null if this queue is empty.
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
        /* internal working:

        PriorityQueue is implemented as a min-heap by default (for natural ordering).
        Time complexity of min-heap inserting an element is O(Log n).
        */
    }
}