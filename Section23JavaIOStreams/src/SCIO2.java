import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

public class SCIO2 {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("C://Users//somes//Downloads//JAVA SE//Section23JavaIOStreams//src//MyJAVA//Source1.txt");
        FileInputStream fis2 = new FileInputStream("C://Users//somes//Downloads//JAVA SE//Section23JavaIOStreams//src//MyJAVA//Source3.txt");

        FileOutputStream fos = new FileOutputStream("C://Users//somes//Downloads//JAVA SE//Section23JavaIOStreams//src//MyJAVA//Destination.txt");
        SequenceInputStream sis = new SequenceInputStream(fis,fis2);

        int b;
        while((b= sis.read())!=-1)
           /*-1 means finishing completing reading both files.
             after second file reading it become -1.*/
        {
            if(b>=65 && b<=120)fos.write(b+32);
            else fos.write(b);
        }
        fis.close();
        fos.close();
    }
} 