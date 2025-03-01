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

        byte b[] = bos.toByteArray();

        bos.writeTo(new FileOutputStream("C://Users//somes//Downloads//JAVA SE//Section23JavaIOStreams//src//MyJAVA//ByteStreamExample3.txt"));
        /*for(byte x:b)
            System.out.println((char)x); //Typecasted
        bos.close();*/


    }
}
