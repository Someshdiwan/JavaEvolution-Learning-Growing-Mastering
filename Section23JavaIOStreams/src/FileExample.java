import java.io.FileOutputStream;
import java.io.FileOutputStream;
import java.io.*;
public class FileExample {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("/Users/somesh/Java SE/JavaEvolution-Learning-Growing-Mastering/Section23JavaIOStreams/src/MyJAVA/Test.txt");
            String str = "Learn JAVA Programming From Abdul Bari Sir and Engineering Digest YT";

            /*
            other methods try in other-program.

            byte b[] = str.getBytes();
            for(byte x:b)
                fos.write(x);

            fos.write(b, 6, str.length()-6);
            */

            fos.write(str.getBytes());
            fos.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch(IOException r) {
            System.out.println(r);
        }
    }
}

/*
1. FileOutputStream:
   - Stream jo file ke andar data likhne (write) ke liye use hota hai.
   - Data binary format me write hota hai (characters ko bhi byte array me convert karke likhta hai).
   - Agar file exist nahi karti → nayi file create ho jaati hai.
   - Agar file already exist karti hai → purana content overwrite ho jaata hai.

2. Important Methods:
   - fos.write(int b) → ek single byte likhta hai.
   - fos.write(byte[] b) → poora byte array likhta hai.
   - fos.write(byte[] b, int off, int len) → array ke ek portion ko write karta hai.
   - fos.close() → stream band karna zaroori hai taaki resources release ho jayein.

3. is program me:
   - `FileOutputStream fos = new FileOutputStream("path.../Test.txt");`
     → File open/create kiya writing ke liye.
   - `str.getBytes()` → String ko byte array me convert kiya.
   - `fos.write(str.getBytes());` → pura string file me write kiya.
   - `fos.close();` → file properly close ki gayi.

4. Use Cases:
   - Text ya binary file banani ho.
   - Logs, reports ya serialized data likhne ke liye.
   - Agar character-based writing chahiye toh `FileWriter` use karna better.


✔ FileOutputStream = binary write stream.
✔ getBytes() → String → byte array.
✔ Overwrites file by default (append karna ho toh `new FileOutputStream(path, true)`).
*/
