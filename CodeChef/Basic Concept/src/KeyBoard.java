import java.util.Scanner;

public class KeyBoard {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int x,y;
        System.out.print("Enter a two numbers");
        x = sc.nextInt();
        y = sc.nextInt();

        int z = x+y;
        System.out.print("Sum is "+z);

    }
}
