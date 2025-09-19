import java.io.FileInputStream;
import java.io.FileOutputStream;

public class SCIO1 {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("/Users/somesh/Java SE/JavaEvolution-Learning-Growing-Mastering/Section23JavaIOStreams/src/MyJAVA/Source1.txt");
        //Must Be created file.

        FileOutputStream fos = new FileOutputStream("/Users/somesh/Java SE/JavaEvolution-Learning-Growing-Mastering/Section23JavaIOStreams/src/MyJAVA/Source3.txt");

        int b;
        while((b = fis.read())!=-1)
        {
            if (b >= 65 && b <= 90) // 'A' to 'Z'
                fos.write(b + 32);   // Convert uppercase to lowercase
            else
                fos.write(b);
        }
        fis.close();
        fos.close();
    }
}

/*
1. FileInputStream (fis):
   - Source file (`Source1.txt`) se byte-by-byte data read karta hai.
   - Har ek character ko ASCII value ke form me deta hai.

2. FileOutputStream (fos):
   - Target file (`Source3.txt`) me data write karta hai.
   - Jo bhi byte likhte ho, wahi directly file me save hota hai.

3. Logic (Transformation Part):
   - `if (b >= 65 && b <= 90)` → Ye ASCII range uppercase letters (A–Z) ko represent karti hai.
   - Agar character uppercase hai toh `b + 32` karke lowercase me convert hota hai.
     - Example: 'A' (65) + 32 = 'a' (97), 'B' → 'b', ... 'Z' → 'z'.
   - Agar uppercase nahi hai, toh byte as-it-is copy hota hai.

4. Close Streams:
   - `fis.close(); fos.close();` → Input/output streams properly close karna zaroori hai.
   - Ye ensure karta hai ki resources release ho jayein aur file corruption na ho.

5. Output Behavior:
   - Source file se uppercase letters convert hoke lowercase ban jaayenge.
   - Baaki characters (digits, spaces, symbols, lowercase) unchanged rahenge.

✔ FileInputStream → file se data read karta hai (byte-by-byte).
✔ FileOutputStream → file me data write karta hai.
✔ Logic → uppercase letters ko lowercase me convert karta hai.
✔ Program ek file copy + case transformation ka simple example hai.
✔ Useful for preprocessing text files (e.g., normalize data to lowercase).
*/
