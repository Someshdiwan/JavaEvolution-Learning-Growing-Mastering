//Now Data Read in File
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.FileInputStream;

class Demo2
{
    public static void main(String[] args)
    {
        try
        {
            int data;
            FileInputStream fin = new FileInputStream("C://Users//somes//Downloads//NoteApp//JavaEvolution-Learning-Growing-Mastering//Section23JavaIOStreams//DemoCodes\\TXT Files\\Demo2.txt");
            while( (data = fin.read()) != -1)
            {
                System.out.println( (char) data);
            }
        }
        catch (IOException e)
        {
            System.out.println(e);
        }
    }
}
