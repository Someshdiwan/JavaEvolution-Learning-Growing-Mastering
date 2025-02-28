import java.io.FileOutputStream;
import java.io.FileOutputStream;
import java.io.*;
public class FileExample {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("C://Users//somes//Downloads//JAVA SE//Section23JavaIOStreams//src//MyJAVA/Test.txt");
            String str = "Learn JAVA Programming";

            /*
            other methods try in other-program.

            byte b[] = str.getBytes();
            for(byte x:b)
                fos.write(x);

            fos.write(b, 6, str.length()-6);
            */

            fos.write(str.getBytes());
            fos.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch(IOException r) {
            System.out.println(r);
        }
    }
}