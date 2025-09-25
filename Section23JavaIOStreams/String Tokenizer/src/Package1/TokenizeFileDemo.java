package Package1;

import java.io.FileInputStream;
import java.util.StringTokenizer;

public class TokenizeFileDemo {
    public static void main(String[] args)throws Exception {
        // First Read the data from a file.
        FileInputStream fis = new FileInputStream("/Users/somesh/Java SE/JavaEvolution-Learning-Growing-Mastering/Section23JavaIOStreams/String Tokenizer.txt/src/Package1/TokenizeFile.txt");

        byte b[]=new byte[fis.available()];

        fis.read(b);
        String data = new String(b);
        StringTokenizer stk = new StringTokenizer(data,"= ");

        String s;
        while (stk.hasMoreTokens()) {
            s=stk.nextToken();
            System.out.println(s);
        }
    }
}
