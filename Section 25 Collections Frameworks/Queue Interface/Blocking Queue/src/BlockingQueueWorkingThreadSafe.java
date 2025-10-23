import java.util.Comparator;
import java.util.concurrent.*;

class Producer implements Runnable {
    private BlockingQueue<Integer> queue;
    private int value = 0;

    public Producer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                System.out.println("Producer produced: " + value);
                queue.put(value++);
                Thread.sleep(1000);
            } catch (Exception e) {
                Thread.currentThread().interrupt();
                System.out.println("Producer interrupted");
            }
        }
    }
}

class Consumer implements Runnable {
    private BlockingQueue<Integer> queue;

    public Consumer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Integer value = queue.take();
                System.out.println("Consumer consumed: " + value);
                Thread.sleep(2000);
            } catch (Exception e) {
                Thread.currentThread().interrupt();
                System.out.println("Consumer interrupted");
            }
        }
    }
}

public class BlockingQueueWorkingThreadSafe {
    public static void main(String[] args) {
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);
        // BlockingQueue is interfaced so we cannot instantiate, so we wrote here implementation of ArrayBlockingQueue
        // A bounded, blocking Queue backed by an array.

        Thread producer = new Thread(new Producer(queue));
        Thread consumer = new Thread(new Consumer(queue));
        producer.start();
        consumer.start();

        BlockingQueue<Integer> queue1 =  new LinkedBlockingQueue<>();
        // optionally bounded backed by LinkedList
        // Uses two separate locks for enqueue and dequeue operations
        // Higher concurrency between producers and consumers

        BlockingQueue<String> queue2 = new PriorityBlockingQueue<>(11, Comparator.reverseOrder());

        // unbounded
        // Binary Heap as array and can grow dynamically
        // Head is based on their natural ordering or a provided Comparator like priority queue
        // put won't block
        queue2.add("apple");
        queue2.add("banana");
        queue2.add("cherry");
        System.out.println(queue2);
        BlockingQueue<Integer> queue3 =  new SynchronousQueue<>();
        // each insert operation must wait for a corresponding remove operation by another thread and vice versa.
        // it cannot store elements, capacity of at most one element
    }
}

/*
thread-safe queue
wait for queue to become non-empty / wait for space
simplify concurrency problems like producer-consumer
standard queue --> immediately
empty --> remove ( no waiting )
full --> add (no waiting)

Blocking queue
put   -->  Blocks if the queue is full until space becomes available
take  -->  Blocks if the queue is empty until an element becomes available
offer -->  Waits for space to become available, up to the specified timeout

A bounded, blocking queue backed by a circular array low memory overhead uses a single lock
for both enqueue and dequeue operations

more threads --> problem
*/
