import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

public class ByteStreamExample3 {
    public static void main(String[] args) throws Exception {
        ByteArrayOutputStream bos = new ByteArrayOutputStream(20);
        bos.write('a');
        bos.write('b');
        bos.write('c');
        bos.write('d');
        bos.write('e');

        byte b[] = bos.toByteArray();

        bos.writeTo(new FileOutputStream("/Users/somesh/Java SE/JavaEvolution-Learning-Growing-Mastering/Section23JavaIOStreams/src/MyJAVA/ByteStreamExample3.txt"));
        /*
        for(byte x:b)
            System.out.println((char)x); //Typecasted
        bos.close();
        */
    }
}

/*
1. ByteArrayOutputStream (BAOS):
   - Ye ek memory buffer (byte array) create karta hai.
   - Hum isme `write(int b)` ya `write(byte[] b)` karke data daal sakte hain.
   - Buffer automatically grow hota hai agar size exceed ho jaye (default size set kar sakte ho, jaise yaha 20 bytes).

2. toByteArray():
   - BAOS ka sara content ek `byte[]` array me return karta hai.
   - Example: agar "abcde" likha → byte array {'a','b','c','d','e'}.

3. writeTo(OutputStream out):
   - Directly BAOS ka data kisi dusre OutputStream (file, socket, etc.) me likh deta hai.
   - Yaha: `bos.writeTo(new FileOutputStream("ByteStreamExample3.txt"));`
   - Matlab → jo "abcde" memory buffer me tha, ab file me store ho gaya.

4. Code Flow:
   - 20 bytes ka buffer banaya.
   - Characters `'a'...'e'` likhe (ASCII values store hue).
   - `toByteArray()` se ek normal byte array liya.
   - `writeTo()` se file me dump kar diya.

5. Output in file:
   - File "ByteStreamExample3.txt" ke andar likha hoga:
     ```
     abcde
     ```

6. Best Practices:
   - Always close the target stream (like FileOutputStream) after writeTo().
   - BAOS ko close karna optional hai (kyunki ye memory-based hai), but karna good practice hai.
   - Useful when → hume pehle memory me data collect karna hai, phir ek sath file, network, ya multiple streams me bhejna hai.

✔ BAOS → data RAM me store hota hai.
✔ toByteArray() → data ko byte array me convert karta hai.
✔ writeTo() → data ko file/stream me likh deta hai.
✔ Example output file → "abcde".
*/
