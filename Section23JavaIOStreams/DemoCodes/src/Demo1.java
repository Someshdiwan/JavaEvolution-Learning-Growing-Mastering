import java.io.FileInputStream;
public class Demo1
{
    public static void main(String args[]){
        try
        {
            FileInputStream fin=new FileInputStream("C://Users//somes//Downloads//NoteApp//JavaEvolution-Learning-Growing-Mastering\\Section23JavaIOStreams\\DemoCodes\\TXT Files\\Demo1.txt");
            int i=0;

            while((i=fin.read())!=-1)
            {
                System.out.print((char)i);
            }

            /*
                    Reads the file one byte at a time.
                    fin.read() returns an int representing the byte value. It returns -1 when the end of the file (EOF) is reached.
                    (char)i converts the byte into a character, and it prints it to the console.
                    So, this part prints the entire content of the file.
            */
            fin.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
