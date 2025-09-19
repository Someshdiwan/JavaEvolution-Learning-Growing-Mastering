import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

// Producer class writes data to OutputStream.
class Producer extends Thread {
    OutputStream os;

    // Constructor to initialize OutputStream.
    public Producer(OutputStream o) {
        this.os = o;
    }

    public void run() {
        int count = 1;
        try {
            while (true) {
                os.write(count); // Writing data to the output stream.
                os.flush(); // Ensuring data is sent out.

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

// Consumer class reads data from InputStream.
class Consumer extends Thread {
    InputStream is;

    // Constructor to initialize InputStream.
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
        // Creating Piped Input and Output Streams.
        PipedInputStream pis = new PipedInputStream();
        PipedOutputStream pos = new PipedOutputStream();

        // Connecting PipedInputStream to PipedOutputStream.
        pis.connect(pos);

        Producer p = new Producer(pos);
        Consumer c = new Consumer(pis);

        p.start();
        c.start();
    }
}

/*
1. Piped Streams:
   - `PipedOutputStream` (Producer likhta hai) aur `PipedInputStream`
      (Consumer padhta hai) ek doosre ke saath connect kiye jaate hain.
   - Ek thread data write karta hai (Producer), dusra thread same data read karta hai (Consumer).
   - Ye thread-to-thread communication ka ek tareeka hai Java IO me.

2. Producer:
   - Producer continuously numbers (1, 2, 3...) likhta hai `os.write(count)`.
   - `flush()` ensure karta hai ki buffer me padha hua data consumer ko turant bhej diya jaye.
   - `Thread.sleep(500)` → thoda delay deta hai taaki output readable ho.

3. Consumer:
   - Consumer continuously `is.read()` se Producer ka bheja hua data read karta hai.
   - Jo bhi byte Producer bhejta hai, wahi yaha receive hota hai.
   - `Thread.sleep(500)` → thoda delay, sync output ke liye.

4. Main Method:
   - `PipedInputStream pis = new PipedInputStream();`
   - `PipedOutputStream pos = new PipedOutputStream();`
   - Dono ko connect kiya gaya: `pis.connect(pos);`
   - Producer ko `pos` diya gaya (write ke liye).
   - Consumer ko `pis` diya gaya (read ke liye).
   - Dono threads start hote hi ek pipeline jaise kaam karta hai.

5. Output Pattern:
   Producer: 1
   Consumer: 1
   Producer: 2
   Consumer: 2
   ... aur aise hi chalti rahegi.

✔ `PipedOutputStream` → Producer likhta hai.
✔ `PipedInputStream` → Consumer padhta hai.
✔ Dono ko connect karke inter-thread communication hota hai.
✔ Achha example Producer-Consumer problem ka using IO Streams.
✔ Real-world use case: background threads jo ek doosre ko data stream karte hain.
*/
