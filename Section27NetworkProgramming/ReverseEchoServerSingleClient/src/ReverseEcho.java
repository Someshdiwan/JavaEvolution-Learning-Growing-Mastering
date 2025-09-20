import java.net.*;
import java.io.*;

public class ReverseEcho {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(2000);
        Socket stk = ss.accept();

        //Reading complete line from a client.
        BufferedReader br = new BufferedReader(new InputStreamReader(stk.getInputStream()));

        //Print output to the client.
        PrintStream ps = new PrintStream(stk.getOutputStream());

        String msg;
        //Reading a msg from a client and reverse it back and send to a client.

        StringBuilder sb; //References deceleration.
        do {
            msg = br.readLine();
            //reversing a msg from a client using method present inside the StringBuilder.
            /*StringBuilder sb = new StringBuilder(msg);*/
            sb=new StringBuilder(msg);
            sb.reverse();
            msg=sb.toString();

            //write back to the output stream of the socket.
            ps.println(msg);
        } while(!msg.equals("dne"));
        //The server part is ready.
    }
}

class Client {
    public static void main(String[] args)throws Exception {
        Socket stk = new Socket("Add Your Device IP Address",2000);

        //Read from the keyboard.
        BufferedReader keyb = new BufferedReader(new InputStreamReader(System.in));

        //Reading from socket whatever it, coming from the server.
        //also you have to print it what you have read it.
        BufferedReader br = new BufferedReader(new InputStreamReader(stk.getInputStream()));
        PrintStream ps = new PrintStream(stk.getOutputStream());

        String msg;
        //StringBuilder sb; no need here because we are not reading it from the client side.

        do {
            msg= keyb.readLine();
            //After reading from the keyboard it sends it to the server.

            ps.println(msg);
            msg=br.readLine();
            System.out.println("From Server: "+msg);
        } while (!msg.equals("dne"));
    }
}
