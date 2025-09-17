import java.io.FileInputStream;
public class Demo1 {
    public static void main(String args[]){
        try {
            FileInputStream fin = new FileInputStream
                            ("/Users/somesh/Java SE/JavaEvolution-Learning-Growing-Mastering/Section23JavaIOStreams/DemoCodes/TXT Files/Demo1.txt");

            int i=0;
            while((i=fin.read())!=-1) {
                System.out.print((char)i);
            }
            fin.close();
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}

/*
Reads the file one byte at a time.
fin.read() returns an int representing the byte value. It returns -1 when the end of the file (EOF) is reached.
(char)i converts the byte into a character, and it prints it to the console.
So, this part prints the entire content of the file.

1. FileInputStream:
   - Ye ek byte stream hai jo file ke andar ka data byte by byte read karta hai.
   - Mostly text files, image files, audio/video streams ke liye use hota hai.

2. Code Explanation:
   - `FileInputStream fin = new FileInputStream("path");`
     → Ye file ko open karta hai given path par.
   - `fin.read()` ek-ek byte return karta hai (0-255 integer value).
   - Jab end of file (EOF) aata hai, to -1 return hota hai.
   - `(char)i` cast karke hum us integer ko character me convert karke print karte hain.
   - `fin.close()` resource (file handle) free kar deta hai.

3. Loop Working:
   - while loop tab tak chalega jab tak file khatam nahi hoti.
   - Har byte → char me cast → console par print.

4. Exception Handling:
   - Agar file nahi mili (FileNotFoundException) ya koi I/O error aaya
     → catch block run hoga aur error print karega.

5. Output:
   - File me jo bhi likha hai, wahi console par as-it-is print ho jaayega.

- Always close the stream (`fin.close()`) warna resource leak ho sakta hai.
- Better approach: try-with-resources (Java 7+), jisme close automatic ho jaata hai.
- Text files ke liye `FileReader` / `BufferedReader` zyada convenient hote hain
  (kyunki wo character streams hai, encoding friendly).
- FileInputStream mainly tab use hota hai jab tumhe binary data (images, audio, pdf) read karna ho.
*/
