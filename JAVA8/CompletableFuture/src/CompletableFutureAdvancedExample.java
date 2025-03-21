import java.util.concurrent.*;

public class CompletableFutureAdvancedExample {
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

    // Simulates fetching user details (may be slow)
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


//### **🔥 Complex Example: Making Parallel API Calls with Timeout & Error Handling**
//#### **Scenario:**
//We need to fetch user details and their order history **simultaneously** from two different services.
//- **User Service** → Returns user details
//- **Order Service** → Returns the user's past orders
//- Both should run **in parallel**.
//- If either fails, we should **handle errors gracefully**.
//- If the response takes too long, we should **timeout** the request.
//
//### **🔍 Step-by-Step Explanation**
//1. **Parallel Execution**:
//   - `CompletableFuture.supplyAsync(fetchUserDetails())` runs **user service** in a separate thread.
//   - `CompletableFuture.supplyAsync(fetchOrderHistory())` runs **order service** in parallel.
//
//2. **Combining Results (`thenCombine()`)**
//   - When both futures are done, we combine the responses:
//     - `"User: John Doe\nOrders: Laptop, Phone"`
//
//3. **Timeout Handling (`applyToEither()`)**
//   - If the API call takes longer than **2 seconds**, it returns `"Request timed out!"`.
//
//4. **Error Handling (`exceptionally()`)**
//   - If any API fails, it catches the exception and returns `"Error fetching data"`.
//
//### **📌 Why is this "Hard"?**
//- **Runs tasks in parallel** to improve performance.
//- **Handles failures** without crashing the app.
//- **Implements a timeout** mechanism using `applyToEither()`.
//- **Combines API results dynamically**.
//
//This is a real-world pattern used in **microservices, web applications, and high-performance systems**. 🚀
//
//Would you like a breakdown of any part? 😊