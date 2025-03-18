package QueueDemo;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueInterface {
    public static void main(String[] args) {
        Queue<Integer> queue1 = new LinkedList<>();
        queue1.add(1);
        queue1.add(3);
        queue1.add(2);
        System.out.println(queue1);
        System.out.println(queue1.size());

        System.out.println(queue1.remove(1)); // throws exception if empty
        System.out.println(queue1.poll());

//        System.out.println(queue1.element());  // throws exception if empty
        System.out.println(queue1.peek());

        Queue<Integer> queue2 =  new ArrayBlockingQueue<>(2);
        System.out.println(queue2.add(1)); // true
        System.out.println(queue2.offer(2)); // true

//         System.out.println(queue2.add(3)); // throws exception
        System.out.println(queue2.offer(3)); // false
    }
}