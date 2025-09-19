import java.io.*;

public class FileExample2 {
    public static void main(String[] args) throws Exception {
        try(FileOutputStream fos=new FileOutputStream("/Users/somesh/Java SE/JavaEvolution-Learning-Growing-Mastering/Section23JavaIOStreams/src/MyJAVA/WithResources.txt");)
        {
            String str = "With Using Resources.";
            byte b[]=str.getBytes();

        /*
        //fos.write(str.getBytes());

        for(byte x:b)
            fos.write(x);
        */
            //fos.write(b, 6, str.length()-6);
            fos.write(b);
            //fos.close();
        }

        /*catch(FileNotFoundException e)
        {
            System.out.println(e);
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
        */
    }
}

/*
1. try-with-resources:
   - Java feature jisme try block ke andar declare kiya gaya resource
     (jaise FileOutputStream) automatically close ho jaata hai.
   - `fos.close()` likhne ki zaroorat nahi hoti, JVM khud handle kar leti hai.
   - Safer aur clean code likhne ke liye prefer karte hain.

2. FileOutputStream:
   - Stream jo file ke andar data write karne ke liye use hota hai.
   - Data binary form me likhta hai (String ko bhi bytes me convert karna padta hai).
   - Agar file exist nahi hai → nayi file create ho jaati hai.
   - Agar file already exist hai → purana content overwrite ho jaata hai.

3. Important Methods:
   - fos.write(int b) → ek single byte likhta hai.
   - fos.write(byte[] b) → pura byte array likhta hai.
   - fos.write(byte[] b, int off, int len) → array ke ek specific portion ko write karta hai.
   - fos.close() → normally zaroori hota hai, par yaha auto-close ho gaya (try-with-resources).

4. is program me kya ho raha hai:
   - `FileOutputStream fos = new FileOutputStream(".../WithResources.txt");`
     → File ko open/create kiya writing ke liye.
   - `str.getBytes()` → String ko byte array me convert kiya.
   - `fos.write(b);` → pura string file me write kiya.
   - Stream auto-close ho gaya because of try-with-resources.

5. Use Cases:
   - Text ya binary file banani ho.
   - Logs, reports ya raw byte data likhne ke liye.
   - Agar sirf characters write karne ho toh `FileWriter` ka use karna better.

✔ try-with-resources = auto close, no need for finally block.
✔ FileOutputStream = binary write stream.
✔ getBytes() = String → byte array conversion.
✔ Overwrites file by default (append karna ho toh `new FileOutputStream(path, true)` use karo).
*/
