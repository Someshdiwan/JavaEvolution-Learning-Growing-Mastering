import java.io.FileInputStream;

public class FileExample3 {
    public static void main(String[] args)throws Exception {
        try(FileInputStream fis = new FileInputStream("C://Users//somes//Downloads//JAVA SE//Section23JavaIOStreams//src//MyJAVA/WithResources.txt");)
        {
            //Reading bytes from file and letter by letter.
            int x;
            /* other ways to do. without do while. we can use simple while loop
            while((x=fis.read())!=-1)
            {
                System.out.println((char)x);
            }*/

            do{
                x=fis.read();
                if(x!=-1)
                    System.out.print((char)x);
            }while(x!=-1);

            /* Creating a-array of Byte.

            byte b[]=new byte[fis.available()]; *//*Checking how many bytes available in, input file.*//*

            fis.read(b);
            //Byte array converting into a string.
            String str = new String(b);

            //Read from file and print.
            System.out.println(str);*/
        }
    }
}
