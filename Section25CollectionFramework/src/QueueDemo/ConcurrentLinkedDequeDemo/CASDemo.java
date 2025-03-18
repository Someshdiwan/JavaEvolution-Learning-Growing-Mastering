package QueueDemo.ConcurrentLinkedDequeDemo;

import java.util.concurrent.atomic.AtomicInteger;

public class CASDemo {
    public static void main(String[] args) {
        AtomicInteger atomicInt = new AtomicInteger(5);

        // Attempt to update from 5 to 10
        boolean success = atomicInt.compareAndSet(5, 10);
        System.out.println("Update successful? " + success);
        System.out.println("New value: " + atomicInt.get());
    }
}
