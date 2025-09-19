import java.io.FileInputStream;

public class FileExample3 {
    public static void main(String[] args)throws Exception {
        try(FileInputStream fis = new FileInputStream("/Users/somesh/Java SE/JavaEvolution-Learning-Growing-Mastering/Section23JavaIOStreams/src/MyJAVA/WithResources.txt");)
        {
            //Reading bytes from file and letter by letter.
            int x;

            /* other ways to do. without do while. we can use a simple while loop.
            while((x=fis.read())!=-1)
            {
                System.out.println((char)x);
            }
            */

            do
            {
                x = fis.read();
                if (x!=-1)
                    System.out.print((char)x);
            } while(x!=-1);

            /*
            Creating a-array of Byte.

            byte b[]=new byte[fis.available()];
            */

            /* Checking how many bytes available in, an input file. */

            /*
            fis.read(b);
            //Byte array converting into a string.
            String str = new String(b);

            //Read from file and print.
            System.out.println(str);
            */
        }
    }
}

/*
1. FileInputStream:
   - Stream jo file se data read karne ke liye use hota hai.
   - Data binary form (bytes) me read hota hai.
   - Agar text file read karna ho → bytes ko char/string me convert karna padta hai.
   - Agar file exist nahi hai → `FileNotFoundException` throw hota hai.

2. try-with-resources:
   - Yaha `FileInputStream fis = new FileInputStream("path");`
     ko try block me declare kiya gaya hai.
   - try-with-resources ka benefit → `fis.close()` automatically call ho jaata hai.

3. Important Methods:
   - `fis.read()` → ek byte read karta hai, -1 return karta hai jab end of file (EOF) aata hai.
   - `fis.available()` → bataata hai kitne bytes abhi read ke liye bache hue hain.
   - `fis.read(byte[] b)` → ek baar me pura byte array fill kar deta hai.

4. is program me kya ho raha hai:
   - File open hui WithResources.txt ke liye.
   - `do-while` loop ke andar ek-ek byte read ho raha hai.
   - `(char)x` cast karke output me letter print kiya gaya hai.
   - Alternative approach bhi diya hai:
     - Simple `while((x=fis.read())!=-1)` loop.
     - Ya phir `fis.available()` se byte array banakar ek hi baar me pura content read karke `new String(b)` se
       print karna.

5. Use Cases:
   - Binary files (images, audio, executables) read karna.
   - Text files character by character read karna.
   - Agar character-stream handling (encoding safe) chahiye toh `FileReader` use karo.


✔ FileInputStream = binary read stream.
✔ read() → byte by byte read, -1 = EOF.
✔ available() → kitne bytes pending hain.
✔ try-with-resources = auto close, no need to call `fis.close()`.
*/
