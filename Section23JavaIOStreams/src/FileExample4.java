import java.io.FileReader;

public class FileExample4 {
    public static void main(String[] args)throws Exception {
        /* Using Reader and Writer */
        try(FileReader fr = new FileReader("/Users/somesh/Java SE/JavaEvolution-Learning-Growing-Mastering/Section23JavaIOStreams/src/MyJAVA/WithResources.txt");)
        {
            int x;
            while((x=fr.read()) != -1) {
                System.out.print((char)x);
            }
        }
    }
}

/*
1. FileReader:
   - Ye ek character-based input stream hai (text files read karne ke liye best).
   - Unlike FileInputStream (jo binary/byte read karta hai), FileReader directly characters read karta hai.
   - Encoding (default platform encoding) handle karta hai → text file ke liye safer option.

2. Important Methods:
   - fr.read() → ek single character return karega (int form me, -1 if EOF).
   - fr.read(char[] cbuf) → ek baar me multiple characters ek array me read karega.
   - fr.close() → stream ko close karta hai (but try-with-resources me auto close ho jaata hai).

3. is program me kya ho raha hai:
   - FileReader `WithResources.txt` ko open karta hai.
   - While loop me `fr.read()` se ek-ek character read ho raha hai jab tak -1 (EOF) nahi milta.
   - `(char)x` cast karke usko console pe print kiya gaya hai.

4. try-with-resources:
   - Yaha `try(FileReader fr = new FileReader("path"))` likha gaya hai.
   - Iska fayda: fr.close() automatically call ho jaata hai jab try block finish hota hai.

5. Use Cases:
   - Text files read karna (letters, words, sentences).
   - Jab tumhe encoding safe character stream chahiye.
   - Agar tumhe binary data (images, pdf, audio) read karna ho toh `FileInputStream` use karo.

✔ FileReader = character input stream.
✔ read() → char by char data read karta hai.
✔ Best for text files (not binary).
✔ try-with-resources = auto close, no memory leaks.
*/
