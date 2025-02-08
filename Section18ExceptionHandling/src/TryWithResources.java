import com.sun.source.doctree.EscapeTree;

import java.io.FileInputStream;
import java.util.Scanner;

public class TryWithResources {

    static FileInputStream fi;
    static Scanner sc;

    static void Divide() throws Exception
    {
        fi=new FileInputStream("C:\\Users\\somes\\Downloads\\JAVA SE\\Section18ExceptionHandling\\src\\Test.txt");

        try
        {
            sc = new Scanner(fi);

            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            System.out.println(a / b);
            System.out.println(a / c);
        }
        finally {
            fi.close(); //i;le input stream close

            sc.close(); //Error inside in main because you close scanner.
        }
    }
    public static void main(String[] args) throws Exception
    {
        try {
            Divide(); //50 divide 40 = 1 Remainder
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        //Resources are not close and not error.
        //Remove Try finally block and them uncomment this

        //int x= sc.nextInt();
        //System.out.println(x);
    }
}


/*
public class TryWithResources.java
{

    static void Divide() throws Exception
    {


        try(FileInputStream fi=new FileInputStream("C:\\Users\\somes\\Downloads\\JAVA SE\\Section18ExceptionHandling\\src\\Test.txt");Scanner sc=new Scanner(fi) )
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            System.out.println(a/c);
        }

    }

    public static void main(String[] args) throws Exception
    {
        try
        {
            Divide();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

        //int x=sc.nextInt();

        // System.out.println(x);

    }

}*/