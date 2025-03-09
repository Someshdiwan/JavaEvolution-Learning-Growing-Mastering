package StringTokenizerDemo;

import java.io.FileInputStream;
import java.util.StringTokenizer;

public class TokenizeFileDemo {
    public static void main(String[] args)throws Exception
    {
        //First Read the data from file.
        FileInputStream fis = new FileInputStream("C://Users\\somes\\Downloads\\JAVA SE\\Section25CollectionFramework\\src\\StringTokenizerDemo\\TokenizeFile.txt");

        byte b[]=new byte[fis.available()];

        fis.read(b);
        String data = new String(b);
        StringTokenizer stk = new StringTokenizer(data,"= ");

        String s;
        while (stk.hasMoreTokens())
        {
            s=stk.nextToken();
            System.out.println(s);
        }
    }
}