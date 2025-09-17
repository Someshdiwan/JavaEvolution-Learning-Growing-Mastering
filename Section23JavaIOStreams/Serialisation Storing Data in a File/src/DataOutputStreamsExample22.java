import java.io.*;

public class DataOutputStreamsExample22 {
    public static void main(String[] args) {
        String filePath = "/Users/somesh/Java SE/JavaEvolution-Learning-Growing-Mastering/Section23JavaIOStreams/src/MyJAVA/Student2.txt";

        try (FileOutputStream fos = new FileOutputStream(filePath);
             DataOutputStream dos = new DataOutputStream(fos))
        {
            int rollno = 101;
            String name = "Somesh Diwan";
            String dept = "Computer Science";
            float avg = 87.5f;

            // Serialisation: using DataInput and DataOutput Streams.
            dos.writeInt(rollno);
            dos.writeUTF(name);
            dos.writeUTF(dept);
            dos.writeFloat(avg);

            System.out.println("Data written successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

/*
1. DataInputStream:
   - Ye stream primitive data types (int, float, double, char, UTF strings, etc.)
     ko directly read/write karne ke liye hota hai.
   - File se data ko ek particular "binary format" me read karta hai.
   - Isko hamesha usi order me read karna padta hai jis order me DataOutputStream ne likha tha.

2. Code Explanation:
   - `FileInputStream fis = new FileInputStream("path")`
     → File ko open karta hai.
   - `DataInputStream dis = new DataInputStream(fis)`
     → Primitive data types ko directly read karne ka wrapper stream.

3. Object `Student1`:
   - Ek custom class jisme rollno, name, dept, avg fields hain.
   - Yahan tum binary file me saved student data ko read kar rahe ho.

4. Read karne ka order:
   - `dis.readInt()` → integer read karega.
   - `dis.readUTF()` → ek UTF string read karega.
   - `dis.readUTF()` → second UTF string read karega.
   - `dis.readFloat()` → float read karega.
   - Order **must match exactly** with the order used while writing using DataOutputStream.
     Agar order change hua to data corrupt lagega ya exception throw hoga.

5. Output:
   - Roll No, Name, Average, Dept console par print hoga.
   - Example:
     ```
     Roll No: 101
     Name: Somesh
     Average: 85.5
     Dept: CS
     ```

6. Important Points:
   - Tumhare code me `dis.close(); dis.close();` do baar likha hai → ek ko hata do.
   - Always ensure matching order between DataOutputStream (writer) and DataInputStream (reader).
   - Ye serialisation ka ek simpler form hai → but ye Java’s built-in `Serializable` interface se different hai.
   - Agar multiple objects likhne hain → loop use karke likho aur read karte waqt same loop repeat karo.


- Use `try-with-resources` to auto-close streams (Java 7+).
- Pehle ek `DataOutputStream` program likho jo Student data file me likhe,
  fir usko iss program se read karke verify karo.
- Agar tumhe complex objects store karne hain to prefer `ObjectOutputStream` / `ObjectInputStream`.
*/
