import java.util.concurrent.BlockingQueue;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class DelayQueueDemo {
    public static void main(String[] args) throws InterruptedException {
        // Thread-safe unbounded blocking queue
        // Elements can only be taken from the queue when their delay has expired
        // Useful for scheduling tasks to be executed after a certain delay
        // internally priority queue
        BlockingQueue<DelayedTask> delayQueue = new DelayQueue<>();
        delayQueue.put(new DelayedTask("Task1", 5, TimeUnit.SECONDS));
        delayQueue.put(new DelayedTask("Task2", 3, TimeUnit.SECONDS));
        delayQueue.put(new DelayedTask("Task3", 10, TimeUnit.SECONDS));

        while (!delayQueue.isEmpty()) {
            DelayedTask task = delayQueue.take(); // Blocks until a task's delay has expired
            System.out.println("Executed: " + task.getTaskName() + " at " + System.currentTimeMillis());
        }
    }
}

class DelayedTask implements Delayed {

    private final String taskName;
    private final long startTime;

    public DelayedTask(String taskName, long delay, TimeUnit unit) {
        this.taskName = taskName;
        this.startTime = System.currentTimeMillis() + unit.toMillis(delay);
    }

    @Override
    public long getDelay(TimeUnit unit) {
        long remaining = startTime - System.currentTimeMillis();
        return unit.convert(remaining, TimeUnit.MILLISECONDS);
    }

    @Override
    public int compareTo(Delayed o) {
        if (this.startTime < ((DelayedTask) o).startTime) {
            return -1;
        }
        if (this.startTime > ((DelayedTask) o).startTime) {
            return 1;
        }
        return 0;
    }

    public String getTaskName() {
        return taskName;
    }
}