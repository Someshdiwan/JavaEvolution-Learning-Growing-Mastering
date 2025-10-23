import java.util.concurrent.*;

public class BoundedQueueDemo {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<String> queue = new ArrayBlockingQueue<>(2); // capacity = 2

        // Producer Thread
        new Thread(() -> {
            try {
                for (int i = 1; i <= 5; i++) {
                    queue.put("Task-" + i); // blocks when full
                    System.out.println("Produced: Task-" + i);
                    Thread.sleep(300);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }).start();

        // Consumer Thread
        new Thread(() -> {
            try {
                while (true) {
                    String task = queue.take(); // blocks when empty
                    System.out.println("Consumed: " + task);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }).start();
    }
}
