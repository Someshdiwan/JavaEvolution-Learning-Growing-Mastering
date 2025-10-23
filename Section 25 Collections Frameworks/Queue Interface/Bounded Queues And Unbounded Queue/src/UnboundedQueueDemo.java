import java.util.concurrent.*;

public class UnboundedQueueDemo {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<String> queue = new LinkedBlockingQueue<>(); // unbounded by default

        // Producer Thread
        new Thread(() -> {
            try {
                for (int i = 1; i <= 5; i++) {
                    queue.put("Task-" + i);
                    System.out.println("Produced: Task-" + i);
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }).start();

        // Consumer Thread
        new Thread(() -> {
            try {
                while (true) {
                    String task = queue.take();
                    System.out.println("Consumed: " + task);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }).start();
    }
}
