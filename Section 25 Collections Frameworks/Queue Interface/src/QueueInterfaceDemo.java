import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/* QueueInterface
 * This class demonstrates how the Queue interface works in Java
 * using two implementations:
 *   1. LinkedList (unbounded queue).
 *   2. ArrayBlockingQueue (bounded queue with fixed capacity).

 * Queue follows FIFO (First In, First Out).
 * Key methods: add(), offer(), remove(), poll(), element(), peek().
 */

public class QueueInterfaceDemo {
    public static void main(String[] args) {
        // ---------------- Queue with LinkedList ----------------
        Queue<Integer> queue1 = new LinkedList<>();

        // Add elements (FIFO order).
        queue1.add(1);
        queue1.add(3);
        queue1.add(2);

        System.out.println("Queue1 (LinkedList) contents: " + queue1);
        System.out.println("Queue1 size: " + queue1.size());

        // remove(Object) removes specific element if found.
        // remove() with no args removes the head (throws exception if empty).
        System.out.println("Removing element '1': " + queue1.remove(1));

        // poll() removes and returns the head, or returns null if empty.
        System.out.println("Polling head element: " + queue1.poll());

         // System.out.println(queue1.element());  // element() returns head, throws exception if empty.

        // peek() returns head element without removing (null if empty).
        System.out.println("Peeking head element: " + queue1.peek());


        // ---------------- Queue with ArrayBlockingQueue ----------------
        // ArrayBlockingQueue is a bounded blocking queue with fixed capacity.
        Queue<Integer> queue2 = new ArrayBlockingQueue<>(2);

        // add() → inserts if space available, else throws IllegalStateException.
        System.out.println("Add 1 to queue2: " + queue2.add(1)); // true

        // offer() → inserts if space available, else returns false.
        System.out.println("Offer 2 to queue2: " + queue2.offer(2)); // true

        // System.out.println(queue2.add(3)); // would throw IllegalStateException

        // Since capacity is 2, this fails gracefully (returns false).
        System.out.println("Offer 3 to full queue2: " + queue2.offer(3)); // false
    }
}

/*
1. Queue Interface:
   - Part of java.util package.
   - Represents a collection designed for holding elements prior to processing (FIFO).
   - Two main families:
     a) Unbounded (e.g., LinkedList, PriorityQueue).
     b) Bounded (e.g., ArrayBlockingQueue).

2. Core Queue Methods:
   - add(e): Inserts element at rear. Throws exception if capacity full (for bounded queues).
   - offer(e): Inserts element at rear. Returns false if capacity full.
   - remove(): Removes and returns head. Throws exception if empty.
   - poll(): Removes and returns head. Returns null if empty.
   - element(): Returns head without removing. Throws exception if empty.
   - peek(): Returns head without removing. Returns null if empty.

3. LinkedList as Queue:
   - Implements Queue (unbounded).
   - No capacity restriction (can grow dynamically).
   - Good for general FIFO needs.

4. ArrayBlockingQueue as Queue:
   - Implements Queue with fixed capacity.
   - Useful in producer-consumer problems (multi-threaded).
   - add() vs offer():
     - add() throws exception if full.
     - offer() safely returns false if full.

5. Typical Usage:
   - LinkedList Queue: General-purpose queues where dynamic resizing is fine.
   - ArrayBlockingQueue: Multi-threaded scenarios where bounded capacity prevents overloading.

6. Complexity:
   - Enqueue (add/offer): O(1)
   - Dequeue (remove/poll): O(1)
   - Peek (peek/element): O(1)

7. Real-world Applications:
   - Task scheduling
   - Producer-consumer problem
   - Order processing systems
   - Buffer management

ASCII Example (FIFO):

Initial:   []
Enqueue 1: [1]
Enqueue 3: [1, 3]
Enqueue 2: [1, 3, 2]
Dequeue(): removes 1 → [3, 2]
Peek(): returns 3 → [3, 2]

ArrayBlockingQueue(capacity=2)
Enqueue 1: [1]
Enqueue 2: [1,2]
Offer 3: fails (capacity full) → [1,2]

*/
