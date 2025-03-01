import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

// Producer class writes data to OutputStream
class Producer extends Thread {
    OutputStream os;

    // Constructor to initialize OutputStream
    public Producer(OutputStream o) {
        this.os = o;
    }

    public void run() {
        int count = 1;
        try {
            while (true) {
                os.write(count); // Writing data to output stream
                os.flush(); // Ensuring data is sent out
                System.out.println("Producer: " + count);
                System.out.flush();
                count++;
                Thread.sleep(500);
            }
        } catch (Exception e) {
            System.out.println("Producer Error: " + e.getMessage());
        }
    }
}

// Consumer class reads data from InputStream
class Consumer extends Thread {
    InputStream is;

    // Constructor to initialize InputStream
    public Consumer(InputStream s) {
        this.is = s;
    }

    public void run() {
        int x;
        try {
            while (true) {
                x = is.read(); // Reading data from input stream
                System.out.println("Consumer: " + x);
                System.out.flush();
                Thread.sleep(500);
            }
        } catch (Exception e) {
            System.out.println("Consumer Error: " + e.getMessage());
        }
    }
}

public class PipedStreamExample {
    public static void main(String[] args) throws Exception {
        // Creating Piped Input and Output Streams
        PipedInputStream pis = new PipedInputStream();
        PipedOutputStream pos = new PipedOutputStream();

        // Connecting PipedInputStream to PipedOutputStream
        pis.connect(pos);

        Producer p = new Producer(pos);
        Consumer c = new Consumer(pis);

        // Starting Threads
        p.start();
        c.start();
    }
}