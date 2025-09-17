import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputStreamsExample {
    public static void main(String[] args)throws Exception {
        FileInputStream fis = new FileInputStream("/Users/somesh/Java SE/JavaEvolution-Learning-Growing-Mastering/Section23JavaIOStreams/src/MyJAVA/BufferTest.txt");

        BufferedInputStream bis = new BufferedInputStream(fis);
        // Creating a connection: bis is linked to fis.

        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        bis.mark(10); // Marking the current position in the stream.

        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        bis.reset(); // Resetting to the marked position.

        System.out.print((char)bis.read());
        System.out.print((char)bis.read());

        // Demonstrating that BufferedInputStream holds data in a temporary memory area.

        /*
        System.out.println("File " + fis.markSupported());
        System.out.println("Buffer " + bis.markSupported());
        */

        /* int x;
        while((x=bis.read())!=-1)
        {
            System.out.print((char)x);
        }
        */
    }
}

/*
File: BufferTest.txt (Using FileInputStream, we can read data from a file) BufferedInputStream provides a temporary
memory buffer that holds data for efficient reading.
Similar to how a video buffers while streaming to match source and destination speeds.
For writing data to a file, FileOutputStream is used.

1. FileInputStream (fis):
   - Directly file se data read karta hai.
   - But har read() call disk se hota hai → slow.

2. BufferedInputStream (bis):
   - Ek temporary memory buffer use karta hai (default ~8KB).
   - File se ek block data le aata hai, phir us buffer se read hota hai → fast.
   - Example: YouTube video buffering (source slow ho sakta hai, but playback smooth hota hai).

3. Important Methods:
   - read() → ek byte (int return karta hai) read karta hai.
   - mark(int readlimit) → current position ko mark karta hai.
   - reset() → stream ko wapas marked position pe le aata hai.
   - markSupported() → check karta hai ki mark–reset support karta hai ya nahi.

4. Code Explanation:
   -  Pehle 3 characters read kiye.
   - `mark(10)` lagaya (stream ka position save ho gaya).
   - Next 2 characters read kiye.
   - `reset()` kiya → pointer wapas marked position pe aagaya.
   - Fir se wahi 2 characters dobara read hue.

5. Output Behaviour (assuming file BufferTest.txt = "abcdef..."):
   - Output sequence something like:
     ```
     abcde
     de
     ```
     (kyunki reset ke baad d,e dobara read hue).

6. Best Practice:
   - Always close streams in `finally` block or use try-with-resources.
   - BufferedInputStream ko prefer karo jab large files read karni ho (performance boost).
   - Agar mark-reset ka use karna hai to `markSupported()` check kar lena.

✔ FileInputStream → direct disk read, slow.
✔ BufferedInputStream → buffer memory use karta hai, fast.
✔ mark(), reset() → pointer ko manage karne ke liye.
✔ markSupported() → feature available hai ya nahi check karne ke liye.
*/
