import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        // File paths (update as per your system)
        String inputFile = "input.txt";
        String outputFile = "output.txt";

        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            // Create FileInputStream to read bytes from a file
            fis = new FileInputStream(inputFile);

            // Create FileOutputStream to write bytes to another file
            fos = new FileOutputStream(outputFile);

            int byteData;
            // Read one byte at a time (-1 means end of a file)
            while ((byteData = fis.read()) != -1) {
                // Write the byte into an output file
                fos.write(byteData);
            }

            System.out.println("File copied successfully using Byte Streams!");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fis != null) fis.close();
                if (fos != null) fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

/*
Byte Streams in Java – Revision Notes

1. Definition:
   - Byte Streams in Java handle **raw binary data** (8-bit data).
   - They use `InputStream` and `OutputStream` as base classes.
   - Suitable for files like images, videos, audio, and text.

2. Key Classes:
   - FileInputStream → Reads raw bytes from a file.
   - FileOutputStream → Writes raw bytes into a file.

3. Code Flow:
   - `new FileInputStream("input.txt")` → opens file for reading.
   - `new FileOutputStream("output.txt")` → opens file for writing.
   - `.read()` → reads 1 byte at a time (returns int in range 0–255).
   - `.write(byte)` → writes 1 byte into file.
   - Loop continues until `.read()` returns -1 (end of file).

4. Real-World Use:
   ✔ Copying binary files (images, PDFs, executables).
   ✔ Sending/receiving data over network sockets.
   ✔ Reading/writing compressed files.

5. Important:
   - Always close streams (`.close()`) to free system resources.
   - Use `try-with-resources` in modern Java for automatic closing.

Quick Recap:
✔ Byte Streams = binary data handling.  
✔ Use FileInputStream + FileOutputStream.  
✔ `.read()` and `.write()` work byte-by-byte.  
✔ Good for multimedia files and raw data transfer.  
*/
