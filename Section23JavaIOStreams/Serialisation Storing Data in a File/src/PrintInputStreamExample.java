import java.io.*;

public class PrintInputStreamExample {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("/Users/somesh/Java SE/JavaEvolution-Learning-Growing-Mastering/Section23JavaIOStreams/src/MyJAVA/Student2.txt");
        DataInputStream dis = new DataInputStream(fis);

        // Read binary data in the correct order.
        Student1 s = new Student1();
        s.rollno = dis.readInt();
        s.name = dis.readUTF();
        s.dept = dis.readUTF();
        s.avg = dis.readFloat();

        System.out.println("Roll No: " + s.rollno);
        System.out.println("Name: " + s.name);
        System.out.println("Dept: " + s.dept);
        System.out.println("Average: " + s.avg);

        dis.close();
        fis.close();
    }
}

/*
1. DataInputStream:
   - Binary data ko read karne ke liye use hota hai (not plain text).
   - Must read in the same order jisme write kiya tha (DataOutputStream se).

2. Student1 object fields
   - `s.rollno = dis.readInt();`
   - `s.name = dis.readUTF();`
   - `s.dept = dis.readUTF();`
   - `s.avg = dis.readFloat();`
   Agar order change karoge to `EOFException` ya corrupted data milega.

3. Streams ka use
   - `FileInputStream` → raw bytes read karta hai.
   - `DataInputStream` → high-level methods deta hai (readInt, readUTF, readFloat).

4. Close order
   - Always `dis.close();` phir `fis.close();` (ya try-with-resources use karna best hai).

5. Serialization vs Data Streams
   - Yaha tumne `DataInputStream` use kiya hai → manually field by field write & read karna hota hai.
   - Agar tum `ObjectInputStream` use karte ho → pura object ek shot me read/write ho sakta hai
(provided class implements Serializable).

- Agar tumne `DataOutputStream` se likha hai:
  ```java
  dos.writeInt(rollno);
  dos.writeUTF(name);
  dos.writeUTF(dept);
  dos.writeFloat(avg);
*/
