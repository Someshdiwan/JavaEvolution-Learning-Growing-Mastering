import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * MAP --> THREAD SAFE --> ConcurrentHashMap
 *
 * @see ConcurrentMap.ConcurrentHashMapDemo.ConcurrentHashMapDemo
 */

public class TaskSubmissionSystem {
    private static ConcurrentLinkedQueue<String> taskQueue = new ConcurrentLinkedQueue<>();

    public static void main(String[] args) {

        Thread producer = new Thread(() -> {
            while (true) {
                try {
                    taskQueue.add("Task " + System.currentTimeMillis());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        Thread consumer = new Thread(() -> {
            while (true) {
                try {
                    String task = taskQueue.poll();
                    System.out.println("Processing: " + task);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        producer.start();
        consumer.start();
    }
}