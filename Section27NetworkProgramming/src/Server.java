import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) throws Exception {
        // ServerSocket banaya (port 5000 pe listen karega)
        ServerSocket ss = new ServerSocket(5000);
        System.out.println("Server started. Waiting for client...");

        // Client ka connection accept kiya
        Socket s = ss.accept();
        System.out.println("Client connected!");

        // Input stream se client ka message read karna
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String msg = br.readLine();
        System.out.println("Client says: " + msg);

        PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
        pw.println("Hello Client, I got your message!");

        br.close();
        pw.close();
        s.close();
        ss.close();
    }
}
