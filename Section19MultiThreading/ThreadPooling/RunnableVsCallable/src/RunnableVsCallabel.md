# Runnable vs Callable in Java

In Java, both **Runnable** and **Callable** are interfaces used to represent tasks that can be executed by 
multiple threads (often with `ExecutorService`). 

They provide a way to encapsulate a unit of work to be executed asynchronously, but they differ in functionality and design.

---

## 1. Runnable

- **Package**: `java.lang`
- **Introduced in**: Java 1.0
- **Signature**:
  ```java
  @FunctionalInterface
  public interface Runnable {
      void run();
  }

Key Characteristics:
•	Represents a task that does not return a result.
•	Cannot throw a checked exception (only unchecked exceptions can be thrown).
•	Typically used when you only need to execute some code concurrently, without returning a value.

Example:

class MyRunnable implements Runnable {
@Override
public void run() {
System.out.println("Running task in thread: " + Thread.currentThread().getName());
}
}

public class RunnableExample {
public static void main(String[] args) {
Runnable task = new MyRunnable();
Thread thread = new Thread(task);
thread.start();
}
}

Output:

Running task in thread: Thread-0


⸻

2. Callable
   •	Package: java.util.concurrent
   •	Introduced in: Java 1.5 (with the java.util.concurrent framework)
   •	Signature:

@FunctionalInterface
public interface Callable<V> {
V call() throws Exception;
}



Key Characteristics:
•	Represents a task that returns a result of type V.
•	Can throw checked exceptions.
•	Usually used with an ExecutorService where the result is obtained via a Future.

Example:

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class MyCallable implements Callable<Integer> {
private int number;

    public MyCallable(int number) {
        this.number = number;
    }

    @Override
    public Integer call() throws Exception {
        int result = number * number;
        Thread.sleep(1000); // simulate computation
        return result;
    }
}

public class CallableExample {
public static void main(String[] args) throws Exception {
ExecutorService executor = Executors.newSingleThreadExecutor();
Callable<Integer> task = new MyCallable(5);

        Future<Integer> future = executor.submit(task);

        System.out.println("Result: " + future.get()); // waits for result
        executor.shutdown();
    }
}

Output:

Result: 25


⸻

3. Differences at a Glance

Feature	Runnable	Callable
Package	java.lang	java.util.concurrent
Return Type	void	Generic type V (returns a value)
Exception Handling	Cannot throw checked exceptions	Can throw checked exceptions
Introduced in	Java 1.0	Java 1.5
Suitable For	Fire-and-forget tasks	Tasks that return results or may throw exceptions
Execution with Thread	new Thread(runnable).start()	Must be submitted to ExecutorService
Integration with Future	Not supported	Returns a Future when submitted


⸻

4. When to Use What?
   •	Use Runnable when:
   •	You just want to perform a task asynchronously without needing a result.
   •	Example: Logging, sending notifications, updating UI components, fire-and-forget tasks.
   •	Use Callable when:
   •	You want the task to return a value.
   •	You need to handle checked exceptions from within the task.
   •	Example: Complex computations, fetching data from an API, database queries.

⸻

5. Hybrid Example: Runnable vs Callable with ExecutorService

import java.util.concurrent.*;

public class RunnableVsCallable {
public static void main(String[] args) throws Exception {
ExecutorService executor = Executors.newFixedThreadPool(2);

        // Runnable task
        Runnable runnableTask = () -> System.out.println("Runnable running...");
        executor.submit(runnableTask);

        // Callable task
        Callable<String> callableTask = () -> {
            Thread.sleep(500);
            return "Callable result";
        };

        Future<String> result = executor.submit(callableTask);
        System.out.println("Callable says: " + result.get());

        executor.shutdown();
    }
}

Output:

Runnable running...
Callable says: Callable result

⸻

6. Summary
   •	Runnable is simple and lightweight, used for tasks that don’t need to return anything.
   •	Callable is more powerful, introduced with the concurrency framework, used for tasks that need to return a result or handle checked exceptions.
   •	Both are essential building blocks of concurrent programming in Java, and the choice depends on the type of task you want to execute.
⸻
---
