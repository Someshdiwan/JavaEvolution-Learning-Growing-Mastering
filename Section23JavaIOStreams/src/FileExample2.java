import java.io.*;

public class FileExample2 {

    public static void main(String[] args) throws Exception
    {

        try(FileOutputStream fos=new FileOutputStream("C://Users//somes//Downloads//JAVA SE//Section23JavaIOStreams//src//MyJAVA/WithResources.txt");)
        {
            String str="With Using Resources";

            byte b[]=str.getBytes();

        /*
        //fos.write(str.getBytes());
        for(byte x:b)
            fos.write(x);*/
            //fos.write(b, 6, str.length()-6);

            fos.write(b);

            //fos.close();

        }
        /*catch(FileNotFoundException e)
        {
            System.out.println(e);
        }
        catch(IOException e)
        {
            System.out.println(e);
        }*/
    }
}