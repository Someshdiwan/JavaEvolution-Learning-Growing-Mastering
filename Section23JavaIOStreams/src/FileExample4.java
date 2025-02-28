import java.io.FileReader;

public class FileExample4 {
    public static void main(String[] args)throws Exception {
        /*Using Reader and Writer*/
        try(FileReader fr = new FileReader("C://Users//somes//Downloads//JAVA SE//Section23JavaIOStreams//src//MyJAVA/WithResources.txt");)
        {
            int x;
            while((x=fr.read())!=-1)
            {
                System.out.print((char)x);
            }
        }
    }
}