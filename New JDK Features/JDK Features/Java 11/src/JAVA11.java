// JAVA11.java
package Java11;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

public class JAVA11 {
    public static void main(String[] args) throws IOException, InterruptedException {
        // HTTP Client API Example (Synchronous)
        System.out.println("Java 11 HTTP Client Example:");

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://jsonplaceholder.typicode.com/posts/1"))
                .build();

        HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
        System.out.println("Response from API:\n" + response.body());

        // Local-variable syntax for lambda parameters (var)
        System.out.println("\nUsing 'var' in lambda parameters:");

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        names.forEach((var name) -> System.out.println("Hello, " + name));

        // BiFunction with var in lambda
        BiFunction<Integer, Integer, Integer> add = (var x, var y) -> x + y;
        int result = add.apply(10, 20);
        System.out.println("Sum using BiFunction with var: " + result);
    }
}
