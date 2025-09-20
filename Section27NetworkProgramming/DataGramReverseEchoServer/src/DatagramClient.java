import java.net.*;

public class DatagramClient {
    public static void main(String[] args)throws Exception{
        DatagramSocket ds = new DatagramSocket(2001);
        //Client port

        String msg = "Hello Server: ";

        //Array of Bytes. That you want to send using a datagram packet.
        DatagramPacket dp = new DatagramPacket(msg.getBytes(),msg.length(),InetAddress.getByName("localHost"),2000);
        //msg.length = What is the length of the array of the bytes that is msg.length.
        //Inet = Ip address you want to send.

        //Now lets this above packet to the server.
        ds.send(dp);
        //Client has sent the packet.

        byte b[]=new byte[1024];
        //receiving the size of the packets from the Server.
        //For received the packets and display it from the server.
        dp=new DatagramPacket(b,1024);

        ds.receive(dp);
        //received the packets.

        msg = new String(dp.getData()).trim(); //getDta which will gives the arrays of the byte.
        System.out.println("From Server Hello: "+msg);
        //Create a msg in string and displaying it.
        ds.close();
    }
}

class Server{
    public static void main(String[] args)throws Exception {
        //Server Address and port number needed.
        DatagramSocket ds = new DatagramSocket(2000);

        //First done. next what the server has to do is receive a packet.
        byte b[]=new byte[1024];
        //Packet is received
        DatagramPacket dp = new DatagramPacket(b,1024);

        ds.receive(dp);

        //Now it has to create a string and reverse the string from
        //that receiving the packets from a client.

        String msg = new String(dp.getData()).trim();
        System.out.println("From Client: "+msg);

        //Reverse.
        StringBuilder sb = new StringBuilder(msg);
        sb.reverse();
        msg = sb.toString();
        //getting a string.

        //This msg it sending it to the Client using a datagram packet.
        dp = new DatagramPacket(msg.getBytes(),msg.length(),InetAddress.getByName("localHost"),2001);
        ds.send(dp);
        ds.close();
    }
}
