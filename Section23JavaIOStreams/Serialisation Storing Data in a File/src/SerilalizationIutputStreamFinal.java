import java.io.*;

public class SerilalizationIutputStreamFinal {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("/Users/somesh/Java SE/JavaEvolution-Learning-Growing-Mastering/Section23JavaIOStreams/src/MyJAVA/Student3.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        StudentFinal s = ( StudentFinal ) ois.readObject();

        System.out.println(s);
        fis.close();
        ois.close();
    }
}

/*
1. Serialization kya hai?
   - Object → file/stream me binary form me convert karna.
   - Isse object ko disk pe save ya network ke through transfer kar sakte ho.
   - Java me `ObjectOutputStream` ka use hota hai.

2. Deserialization kya hai?
   - File/stream se binary form → original object banata hai.
   - Java me `ObjectInputStream` ka use hota hai.

3. Important keywords:
   - `implements Serializable` → bina iske class serialize nahi hogi (NotSerializableException aayega).
   - `transient` → jis variable pe lagao, wo serialize nahi hoga.
   - `static` → static variables class-level hote hain, object ke state ka part nahi bante, isliye ye bhi serialize nahi
      hote.

4. Code Explanation:
   - `SerilalizationOutputStreamFinal`:
     - FileOutputStream + ObjectOutputStream banaya.
     - StudentFinal ka ek object create kiya aur `oos.writeObject(s);` kiya.
     - File me pura object save ho gaya (binary form me).

   - `SerilalizationIutputStreamFinal`:
     - FileInputStream + ObjectInputStream banaya.
     - `readObject()` karke wapas `StudentFinal` type cast kiya.
     - Print kiya → object state restore ho gayi.

5. Output Behaviour:
   - `rollno, name, avg, dept` → serialize + deserialize hote hain properly.
   - `static Data` → serialize nahi hota. Lekin constructor me last value set hoti hai, deserialization ke baad
      class-level value hi dikhegi (500).
   - `transient t` → serialize nahi hota, isliye deserialization ke baad iska value default ho jaata hai (0).

6. Best Practices:
- Always use `serialVersionUID` in Serializable classes → version control ke liye.
- Streams ko close karne ke liye try-with-resources use karo.
- Agar sensitive data hai (password etc.), usko `transient` mark karo.


✔ `Serializable` → required
✔ `transient` → skip during serialization
✔ `static` → not serialized (class-level)
✔ `ObjectOutputStream.writeObject()` → save object
✔ `ObjectInputStream.readObject()` → restore object
*/
