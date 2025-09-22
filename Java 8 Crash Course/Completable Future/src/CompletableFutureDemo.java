import java.util.concurrent.*;

public class CompletableFutureDemo {
    public static void main(String[] args) {
        // Start both tasks in parallel
        CompletableFuture<String> userFuture = CompletableFuture.supplyAsync(() -> fetchUserDetails());
        CompletableFuture<String> orderFuture = CompletableFuture.supplyAsync(() -> fetchOrderHistory());

        // Combine results once both are done
        CompletableFuture<String> combinedFuture = userFuture.thenCombine(orderFuture,
                (user, orders) -> "User: " + user + "\nOrders: " + orders
        );

        // Handle timeout (if it takes longer than 2 seconds, return a default message)
        CompletableFuture<String> resultWithTimeout = combinedFuture.applyToEither(
                timeoutAfter(2),
                value -> value
        );

        // Exception handling: if anything fails, return a default message
        String result = resultWithTimeout.exceptionally(ex -> "Error fetching data: " + ex.getMessage()).join();

        System.out.println(result);
    }

    // Simulates fetching user details (maybe slow)
    private static String fetchUserDetails() {
        sleep(1000); // Simulate network delay
        return "John Doe, Age 30";
    }

    // Simulates fetching order history (may fail)
    private static String fetchOrderHistory() {
        sleep(1500); // Simulate network delay
        if (Math.random() > 0.7) throw new RuntimeException("Order service failed!"); // Simulate failure
        return "Order1: Laptop, Order2: Phone";
    }

    // Utility method to simulate delay
    private static void sleep(long millis) {
        try { Thread.sleep(millis); } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
    }

    // Timeout mechanism using CompletableFuture
    private static CompletableFuture<String> timeoutAfter(int seconds) {
        return CompletableFuture.supplyAsync(() -> {
            sleep(seconds * 1000);
            return "Request timed out!";
        });
    }
}

/*
Complex Example: Making Parallel API Calls with Timeout & Error Handling

Scenario:
We need to fetch user details and their order history simultaneously from two different services.
- User Service → returns user details.
- Order Service → returns the user's past orders.
- Both should run in parallel.
- If either fails, we should handle errors gracefully.
- If the response takes too long, we should timeout the request.

Step-by-Step Explanation:

1. Parallel Execution:
   - CompletableFuture.supplyAsync(fetchUserDetails()) runs the user service in a separate thread.
   - CompletableFuture.supplyAsync(fetchOrderHistory()) runs the order service in parallel.

2. Combining Results (thenCombine):
   - When both futures are completed, we combine the responses into a single result,
     for example: "User: John Doe\nOrders: Laptop, Phone".

3. Timeout Handling (applyToEither):
   - If an API call takes longer than 2 seconds, it returns a default response such as "Request timed out!".

4. Error Handling (exceptionally):
   - If any API fails, the exception is caught, and a safe fallback like "Error fetching data" is returned.

Why is this considered a "hard" example?
- Tasks run in parallel, improving performance.
- Failures are handled without crashing the application.
- A timeout mechanism is implemented with applyToEither().
- Results from multiple APIs are combined dynamically.

This pattern is commonly used in microservices, web applications, and high-performance systems.
*/
