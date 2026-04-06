import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Http3ClientDemo {
    public static void main(String[] args) {
        try {
            var client = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_3) // Enable HTTP/3
                .build();

            var request = HttpRequest.newBuilder()
                .uri(new URI("https://www.google.com")) // Any HTTPS site
                .GET()
                .build();

            var response = client.send(request, HttpResponse.BodyHandlers.ofString());

            System.out.println("Status Code: " + response.statusCode());
            System.out.println("Response (first 200 chars):");
            System.out.println(response.body().substring(0, 200));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

/*
What changed: Previous vs New

Previous Java style:
- HttpClient used HTTP/1.1 or HTTP/2
- No native HTTP/3 support
- Developers depended on external libraries for HTTP/3

New Java 26 style:
- Built-in HTTP/3 support in HttpClient
- Just set version(HttpClient.Version.HTTP_3)
- Cleaner and native implementation

Old approach example idea:
var client = HttpClient.newBuilder()
        .version(HttpClient.Version.HTTP_2)
        .build();

Why the new approach is better:
- Faster communication (uses QUIC protocol)
- Reduced latency
- Better performance on unstable networks
- No need for external libraries

Pros:
1. Better performance
   - Faster than HTTP/2 in many cases

2. Reduced latency
   - Faster connection setup

3. Built-in support
   - No third-party dependency required

4. Modern networking
   - Uses QUIC (UDP-based)

Cons:
1. Server dependency
   - Only works if server supports HTTP/3

2. Fallback behavior
   - May fall back to HTTP/2 automatically

3. Debugging complexity
   - Harder to debug compared to HTTP/1.1

Best use case:
- High-performance web applications
- APIs with low-latency requirements
- Mobile or unstable network environments

Compile and run:
javac Http3ClientDemo.java
java Http3ClientDemo
*/
