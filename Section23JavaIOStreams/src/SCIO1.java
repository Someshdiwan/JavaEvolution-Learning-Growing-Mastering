import java.io.FileInputStream;
import java.io.FileOutputStream;

public class SCIO1 {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("C://Users//somes//Downloads//JAVA SE//Section23JavaIOStreams//src//MyJAVA//Source1.txt"); //Must Be created file.
        FileOutputStream fos = new FileOutputStream("C://Users//somes//Downloads//JAVA SE//Section23JavaIOStreams//src//MyJAVA//Source3.txt");

        int b;
        while((b= fis.read())!=-1)
        {
            if(b>=65 && b<=120)fos.write(b+32);
            else fos.write(b);
        }
        fis.close();
        fos.close();
    }
}