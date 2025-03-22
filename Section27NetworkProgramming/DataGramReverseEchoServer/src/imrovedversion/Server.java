package imrovedversion;

import java.net.*;

public class Server {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket(2000); // Server listening on port 2000
        System.out.println("Server: Listening on port 2000...");

        byte[] buffer = new byte[1024];

        while (true) { // Continuous listening mode
            DatagramPacket dp = new DatagramPacket(buffer, buffer.length);
            ds.receive(dp); // Receiving message

            String receivedMsg = new String(dp.getData(), 0, dp.getLength()); // Trim excess bytes
            System.out.println("Server: Received -> " + receivedMsg);

            // Reverse the received message
            String reversedMsg = new StringBuilder(receivedMsg).reverse().toString();

            // Send response back to client
            DatagramPacket response = new DatagramPacket(
                    reversedMsg.getBytes(), reversedMsg.length(),
                    dp.getAddress(), dp.getPort()
            );
            ds.send(response);
            System.out.println("Server: Sent back reversed message.");
        }
    }
}
