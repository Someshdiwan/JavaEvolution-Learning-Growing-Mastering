import java.util.concurrent.StructuredTaskScope;

public class Test1 {
    public static void main(String[] args) {

        try (var scope = new StructuredTaskScope.ShutdownOnFailure()) {

            var task1 = scope.fork(() -> fetchData("User Data"));
            var task2 = scope.fork(() -> fetchData("Order Data"));

            scope.join();              // Wait for all tasks
            scope.throwIfFailed();     // Throw if any failed

            System.out.println(task1.get());
            System.out.println(task2.get());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static String fetchData(String name) throws InterruptedException {
        Thread.sleep(1000);    // simulate delay
        return "Fetched: " + name;
    }
}

/*
What changed: Previous vs New

Previous Java style:
- Usually we used ExecutorService + Future
- We manually submitted tasks
- We manually waited for results
- We manually handled cancellation/shutdown
- Error handling was more scattered
- Related tasks were not clearly grouped as one unit of work

New Java 26 style:
- Uses StructuredTaskScope for structured concurrency
- Related concurrent tasks are written inside one clear block
- Task lifetime is bound to the scope block
- ShutdownOnFailure stops the whole operation if one subtask fails
- join() waits for all relevant subtasks
- throwIfFailed() propagates failure clearly

Old approach example idea:
ExecutorService executor = Executors.newFixedThreadPool(2);
Future<String> f1 = executor.submit(() -> fetchData("User Data"));
Future<String> f2 = executor.submit(() -> fetchData("Order Data"));

System.out.println(f1.get());
System.out.println(f2.get());
executor.shutdown();

Why the new approach is better:
- Cleaner and easier to read
- Better structured code
- Safer cancellation model
- Better error propagation
- Related tasks are managed together
- Reduces thread leaks and forgotten shutdown problems

Pros:
1. Better readability
   - Parent task and child tasks are grouped together

2. Better reliability
   - If one task fails, ShutdownOnFailure can cancel the others

3. Easier maintenance
   - Concurrency logic is easier to understand later

4. Better observability
   - Structured concurrency treats subtasks as part of one operation

5. Automatic resource management
   - try-with-resources closes the scope properly

Cons:
1. Preview feature
   - StructuredTaskScope is still a preview API in Java 26

2. Must enable preview
   - Compile and run with --enable-preview

3. Not ideal for every use case
   - For long-running independent background jobs, ExecutorService may still fit better

4. Learning curve
   - Developers familiar with old concurrency APIs need time to adapt

Best use case:
- When one request/task is split into multiple related subtasks
- Example: fetch user data + fetch order data + fetch payment data together

Compile and run:
javac --enable-preview --release 26 Test1.java
java --enable-preview Test1
*/
