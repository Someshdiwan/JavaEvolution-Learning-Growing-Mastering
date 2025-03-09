package StringTokenizerDemo;

import java.util.StringTokenizer;

public class ToenizerDemo {
    public static void main(String[] args)
    {
/*
        String data="name=Vijay; address=delhi; country=india; dept=cse";
*/
        String data="name=Vijay\naddress=delhi\ncountry=india\ndept=cse";

        //String data="name=Vijay address=delhi country=india dept=cse";

/*
        StringTokenizer stk = new StringTokenizer(data,"=;");
*/
        StringTokenizer stk = new StringTokenizer(data,"=");
        /*"\n" acts as a delimiters.*/

        //Criteria for making tokens and Delimiters: =;

        String s;
        while (stk.hasMoreTokens())
        {
            s=stk.nextToken();
            System.out.println(s);
        }
    }
}