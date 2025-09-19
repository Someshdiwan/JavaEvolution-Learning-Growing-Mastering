import java.io.File;
import java.io.FileOutputStream;

public class FileClassExample {
    public static void main(String[] args)throws Exception {
        //Accessing properties of file.
        File f = new File("/Users/somesh/Java SE/JavaEvolution-Learning-Growing-Mastering/Section23JavaIOStreams/src/MyJAVA");

       /*
       f.setReadOnly();
       f.setWritable(true);
       FileOutputStream fos = new FileOutputStream("C://Users\\\\somes\\\\Downloads\\\\JAVA SE\\\\Section23JavaIOStreams\\\\src\\\\MyJAVA");

       f.setLastModified();
       f.isFile();
       f.isDirectory();
       f.isHidden();
       */

        System.out.println(f.isDirectory());

        /*
        String list[]=f.list();

        for(String x:list)
        {
            System.out.println(x);
        }
        */

        File list[]=f.listFiles();

        for(File x:list) {
            System.out.println(x.getName()+" ");
            System.out.println(x.getPath());
        }
    }
}

/*
1. File Class:
   - java.io.File ek abstract representation hai file ya directory path ka.
   - Actual data read/write nahi karta, sirf properties aur metadata handle karta hai.

2. Common Methods:
   - f.isFile() → check karta hai ki given path ek file hai ya nahi.
   - f.isDirectory() → check karta hai ki given path ek directory hai.
   - f.isHidden() → check karta hai ki file hidden hai ya nahi.
   - f.setReadOnly(), f.setWritable(true/false) → permissions change karte hain.
   - f.setLastModified(time) → last modified timestamp set karta hai.
   - f.list() → directory ke andar ke file/directory names string array me return karta hai.
   - f.listFiles() → directory ke andar ke files ko File objects ke array me return karta hai.

3. Code Flow:
   - File object banaya pointing to directory `"MyJAVA"`.
   - `f.isDirectory()` se check kiya directory hai ya nahi.
   - `listFiles()` se directory ke andar ki files iterate karke unke `getName()` aur `getPath()` print kiya.

4. Use Cases:
   - File explorer ya directory traversal banane ke liye.
   - Files ki properties (read-only, hidden, permissions) check/update karne ke liye.
   - File search, log management, aur serialization me kaafi common.


✔ File class → metadata aur properties ke liye.
✔ Read/Write actual data ke liye alag streams (FileInputStream, FileOutputStream).
✔ Directory traversal → `list()` ya `listFiles()`.
*/
