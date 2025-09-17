import java.io.IOException;
import java.io.FileOutputStream;
import java.io.FileInputStream;

class Demo2 {
    public static void main(String[] args) {
        try {
            int data;
            FileInputStream fin = new FileInputStream("/Users/somesh/Java SE/JavaEvolution-Learning-Growing-Mastering/Section23JavaIOStreams/DemoCodes/TXT Files/Demo2.txt");
            while ((data = fin.read()) != -1) {
                System.out.println( (char) data);
            }
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }
}

/*
1. FileInputStream:
   - Ye ek byte-oriented stream hai jo file ka content byte by byte read karta hai.
   - Text files, images, audio, binary files sab ke liye use ho sakta hai.

2. Code Explanation:
   - `FileInputStream fin = new FileInputStream("path");`
     → Ye file ko open karta hai read karne ke liye.
   - `fin.read()` ek byte return karta hai (0–255 int).
   - Jab end of file (EOF) aata hai, to -1 return hota hai.

3. Loop:
   - `while ((data = fin.read()) != -1)`
   - Har iteration me ek byte read hota hai aur `(char)data` se usko character me convert karke print karte ho.
   - Yahan `System.out.println((char)data);` likha hai → har ek character **nayi line me** print hoga.
     Agar same line me chahiye to `System.out.print((char)data);` use karo.

4. Exception Handling:
   - Agar file nahi mili ya read karte waqt error aaya, to `IOException` catch block me handle hota hai.
   - `System.out.println(e);` error message console par dikhata hai.

5. Output:
   - File ke andar jitna content hai wo line by line (char by char) console me print hoga.
   - Example: File me `"Hello"` likha hai → Output:
       H
       e
       l
       l
       o

- `fin.close()` call karna zaroori hai after reading, warna file handle release nahi hoga (resource leak).
- Tumhare code me `fin.close()` missing hai. Better hai try-with-resources use karna (Java 7+).
- Agar tumhe performance chahiye, to `BufferedInputStream` ya `BufferedReader` prefer karo
  (kyunki wo ek-ek byte ke bajay buffer me read karte hain).
*/
