import java.lang.*;
import java.util.*;

public class ReadingFromKeyBoard {
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int a, b, c;
        System.out.print("Enter 2 number");
        a = s.nextInt();
        b = s.nextInt();
        c = a+b;
        System.out.println("Sum of two number is"+ c);
    }
}
