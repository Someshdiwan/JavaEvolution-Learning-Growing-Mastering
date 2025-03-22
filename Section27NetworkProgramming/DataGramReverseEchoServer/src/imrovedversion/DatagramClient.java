package imrovedversion;

import java.net.*;

public class DatagramClient {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket(); // No need to bind a specific port

        String msg = "Hello Server";
        byte[] sendData = msg.getBytes();

        InetAddress serverAddress = InetAddress.getByName("localhost");
        DatagramPacket dp = new DatagramPacket(sendData, sendData.length, serverAddress, 2000);

        ds.send(dp); // Sending packet to server
        System.out.println("Client: Message sent to Server.");

        // Receiving response from server
        byte[] buffer = new byte[1024];
        DatagramPacket response = new DatagramPacket(buffer, buffer.length);
        ds.receive(response); // Blocking call until data is received

        // Extracting data
        String receivedMsg = new String(response.getData(), 0, response.getLength());
        System.out.println("Client: Response from Server -> " + receivedMsg);

        ds.close();
    }
}