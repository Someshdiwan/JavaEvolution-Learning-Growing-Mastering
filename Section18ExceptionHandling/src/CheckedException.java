import java.io.FileInputStream;

public class CheckedException
{
    static void fun1()
    {
        /*
        Checked Exception FileInputStream f1=new FileInputStream("My.txt");
        */
    }
    static void fun2()
    {
        fun1();
    }
    static void fun3()
    {
        fun3();
    }
    public static void main(String[] args) {
        fun3();
    }
}