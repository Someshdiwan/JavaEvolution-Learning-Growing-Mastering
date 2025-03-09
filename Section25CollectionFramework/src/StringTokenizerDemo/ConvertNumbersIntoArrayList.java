package StringTokenizerDemo;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class ConvertNumbersIntoArrayList {
    public static void main(String[] args)throws Exception
    {
        FileInputStream fis = new FileInputStream("C://Users\\somes\\Downloads\\JAVA SE\\Section25CollectionFramework\\src\\StringTokenizerDemo\\Numbers.txt");

        byte b[]=new byte[fis.available()];

        fis.read(b);

        String data = new String(b);
        StringTokenizer stk = new StringTokenizer(data,",");

        String s;
        ArrayList<Integer> al = new ArrayList<>();

        while (stk.hasMoreTokens())
        {
            s=stk.nextToken();
            al.add(Integer.valueOf(s));
        }
        System.out.println(al);
    }
}