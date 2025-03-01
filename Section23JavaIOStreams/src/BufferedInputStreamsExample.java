import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputStreamsExample {
    public static void main(String[] args)throws Exception {
        FileInputStream fis = new FileInputStream("C://Users//somes//Downloads//JAVA SE//Section23JavaIOStreams//src//MyJAVA//BufferTest.txt");
        BufferedInputStream bis = new BufferedInputStream(fis); // Creating a connection: bis is linked to fis.

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

        /*System.out.println("File "+fis.markSupported());
        System.out.println("Buffer "+bis.markSupported());
        */

        /*int x;
        while((x=bis.read())!=-1)
        {
            System.out.print((char)x);
        }*/

    }
}

// File: BufferTest.txt (Using FileInputStream, we can read data from a file)
// BufferedInputStream provides a temporary memory buffer that holds data for efficient reading.
// Similar to how a video buffers while streaming to match source and destination speeds.
// For writing data to a file, FileOutputStream is used.
