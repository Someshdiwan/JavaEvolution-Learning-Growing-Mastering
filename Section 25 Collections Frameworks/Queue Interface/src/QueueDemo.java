import java.util.LinkedList;

/* This class demonstrates how a LinkedList in Java can be used as a Queue.
 * - LinkedList implements the Queue and Deque interfaces.
 * - Queue follows FIFO (First In, First Out) order.

 * Key Operations:
 * - Enqueue (addLast): Add an element at the rear (end).
 * - Dequeue (removeFirst): Remove an element from the front (head).
 * - Peek: View the head element without removing it.
 */

public class QueueDemo {
    public static void main(String[] args) {
        // LinkedList can be used as both List and Queue.
        LinkedList<Integer> list = new LinkedList<>();

        // Adding elements (acts like a normal list here).
        list.add(3);
        list.add(2);
        list.add(1);

        System.out.println("Initial List: " + list);

        // removeFirst() → removes element from the front (Queue behavior).
        System.out.println("Removed First: " + list.removeFirst());

        // Another LinkedList to demonstrate Queue operations more clearly.
        LinkedList<Integer> list2 = new LinkedList<>();

        // Enqueue → Adding elements at the rear of the queue.
        list2.addLast(1); // Enqueue
        list2.addLast(2); // Enqueue
        list2.addLast(3); // Enqueue

        System.out.println("Queue after Enqueue operations: " + list2);

        // Dequeue → Removing element from the front of the queue.
        Integer i = list2.removeFirst(); // Dequeue
        System.out.println("After Dequeue (removed " + i + "): " + list2);

        // Peek → Returns head of queue without removing it.
        System.out.println("Peek (front element): " + list2.peek());

        // Final state of queue
        System.out.println("Final Queue: " + list2);
    }
}

/*
==========================
Queue Theory with LinkedList
==========================

1. Why LinkedList as Queue?
   - LinkedList implements Queue and Deque interfaces.
   - Provides O(1) performance for insertion/removal at head and tail.
   - Natural fit for FIFO operations.

2. Queue Operations:
   - Enqueue → addLast(element)
   - Dequeue → removeFirst()
   - Peek → peek() or getFirst()

3. Example Flow:
   Enqueue: [1] → [1,2] → [1,2,3]
   Dequeue: removeFirst() → removes 1 → [2,3]
   Peek: returns 2 (front) but does not remove.

4. Complexity:
   - Enqueue (addLast): O(1)
   - Dequeue (removeFirst): O(1)
   - Peek: O(1)

5. Use Cases:
   - Task scheduling
   - Producer-Consumer model
   - Buffer management (FIFO order)

6. Difference from Stack:
   - Queue → FIFO (first in, first out).
   - Stack → LIFO (last in, first out).
*/
