import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

public class SCIO2 {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("/Users/somesh/Java SE/JavaEvolution-Learning-Growing-Mastering/Section23JavaIOStreams/src/MyJAVA/Source1.txt");
        FileInputStream fis2 = new FileInputStream("/Users/somesh/Java SE/JavaEvolution-Learning-Growing-Mastering/Section23JavaIOStreams/src/MyJAVA/Source3.txt");

        FileOutputStream fos = new FileOutputStream("/Users/somesh/Java SE/JavaEvolution-Learning-Growing-Mastering/Section23JavaIOStreams/src/MyJAVA/Destination.txt");
        SequenceInputStream sis = new SequenceInputStream(fis, fis2);

        int b;
        while ((b = sis.read()) != -1)
            /* -1 means finishing completing reading both files. after the second file reading, it becomes -1. */
        {
            if (b >= 65 && b <= 120) fos.write(b + 32);
            else fos.write(b);
        }
        fis.close();
        fos.close();
    }
}

/*
1. FileInputStream (fis, fis2):
   - Dono alag-alag source files (`Source1.txt` aur `Source3.txt`) se data read karte hain.
   - Ye byte-by-byte read karte hain aur ASCII values return karte hain.

2. SequenceInputStream (sis):
   - `SequenceInputStream(fis, fis2)` dono streams ko combine karta hai.
   - Pehle `fis` (Source1) se poora data read karega.
   - Fir automatically `fis2` (Source3) par switch karega.
   - End of both files ke baad `read()` -1 return karega.

3. FileOutputStream (fos):
   - Target file (`Destination.txt`) me final data likhne ke liye use hota hai.
   - Jo bhi bytes sis se read hote hain, wahi fos me write kiye jaate hain.

4. Logic (Case Transformation):
   - `if (b >= 65 && b <= 120)` → ASCII range uppercase letters (A–X tak cover karta hai).
   - Agar uppercase letter hai → usko `b + 32` karke lowercase me convert kar deta hai.
     - Example: 'A' → 'a', 'B' → 'b', ...
   - Baaki characters as-it-is copy hote hain.

5. Close Streams:
   - `fis.close(); fis2.close(); fos.close();` → sabhi streams properly close karne chahiye.
   - Resources release hote hain aur memory leaks avoid hote hain.

✔ SequenceInputStream → multiple input streams ko **ek continuous stream** banata hai.
✔ Pehle file1 → fir file2 sequentially read hoti hai.
✔ Output file me dono files ka combined content likha jaata hai.
✔ Logic add kiya gaya hai uppercase → lowercase conversion ke liye.
✔ Useful jab tumhe multiple files ko merge + transform** karna ho ek single file me.
*/
