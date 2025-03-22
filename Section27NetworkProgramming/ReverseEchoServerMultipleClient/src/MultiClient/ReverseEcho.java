package MultiClient;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.Buffer;

public class ReverseEcho extends Thread {
    Socket stk;

    public ReverseEcho(Socket st) {
        stk = st;
    }

    public void run() {
        try {
            System.out.println("Client Handler Started for: " + stk.getInetAddress());

            //Waiting to accept the connection.
            //For using Readline(); we are using Buffer reader();
            //BufferedReader to read input from client
            BufferedReader br = new BufferedReader(new InputStreamReader(stk.getInputStream()));
            //Reads text from a character-input stream, buffering characters so as to provide for the efficient reading of characters, arrays, and lines.
            //The buffer size may be specified, or the default size may be used. The default is large enough for most purposes.
            //In general, each read request made of a Reader causes a corresponding read request to be made of the underlying character or byte stream.
            //It is therefore advisable to wrap a BufferedReader around any Reader whose read() operations may be costly, such as FileReaders and InputStreamReaders.
            PrintStream ps = new PrintStream(stk.getOutputStream());


            String msg;
            StringBuilder sb;
            //Reversing a string. Try with StringBuffer.
            do {
                msg = br.readLine();

                sb = new StringBuilder(msg);
                sb.reverse();
                msg = sb.toString();

                ps.println(msg);
            }
            while (!msg.equals("dne"));
            stk.close();
        } catch (Exception e) {
        }
    }

    // Main server method to accept multiple client connections
    public static void main(String[] args) throws Exception {
        /*Now, we want to allow server multiple client using multi threading.
        Client ------ Server
        Network --IP Add
        Transport layer ==Establish connection
        Connection-Oriented server.
        Client software will communicate server soft which are on other machine.
        Server -- PORT Number 6000.
        Client need Server IP and port address. to connect the server*/


        ServerSocket ss = new ServerSocket(6000);
        //Accept the connection and it should now gave connection to the thread.
        Socket stk;
        ReverseEcho re; //references

        int count = 1;
        do {
            stk = ss.accept();
            //Creating object of Reverse Echo class.

            System.out.println("Client Connected: " + count++);

            re = new ReverseEcho(stk); //Creating and object here.
            re.start();
        }
        while (true); //Server is running Infinitely. most of the server running in infinite loop.
    }

    //Client connected to server
    public static class Client {
        public static void main(String[] args) throws Exception {

            //Input and out put stream for socket Connection.
            Socket stk = new Socket("Add Your IP Address, Go CMD type ipconfig", 6000);
            System.out.println("Connected to the server.");

            //KeyBoard Stream
            BufferedReader keyb = new BufferedReader(new InputStreamReader(System.in));


            BufferedReader br = new BufferedReader(new InputStreamReader(stk.getInputStream()));

            PrintStream ps = new PrintStream(stk.getOutputStream());

            String msg;

            do {
                System.out.println("Enter a msg from keyboard: ");
                msg = keyb.readLine();
                ps.println(msg);
                msg = br.readLine();
                System.out.println("From Server: " + msg);
            } while (!msg.equals("dne"));
            stk.close();
        }
    }
}

/*
Server (ReverseEcho):
Starts a server on port 6000 and listens for client connections.
Accepts a client connection and creates a new thread for each client.
Reads the message from the client, reverses it, and sends it back.
The server continues to run infinitely, accepting multiple clients.
Terminates connection when the client sends "dne".

Client:
Connects to the server at IP Add Your IP Address, Go CMD type ipconfig on port 6000.
Reads input from the keyboard, sends it to the server.
Receives reversed message from the server and displays it.
Continues until "dne" is entered, then closes the connection.
*/