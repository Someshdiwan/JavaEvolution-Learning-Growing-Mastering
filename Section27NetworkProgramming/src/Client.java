import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) throws Exception {
        // Server se connect karna (localhost:5000)
        Socket s = new Socket("localhost", 5000);

        // Output stream ke through server ko message bhejna
        PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
        pw.println("Hello Server!");

        // Input stream se server ka reply read karna
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String reply = br.readLine();
        System.out.println("Server replied: " + reply);

        pw.close();
        br.close();
        s.close();
    }
}
