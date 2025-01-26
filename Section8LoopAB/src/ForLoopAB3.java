//Display the multiplication table

import java.util.Scanner;

public class ForLoopAB3 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();

        for(int i = 0; i<=10; i++){
            System.out.println(n+" x "+i+" = "+ n*i);
        }
    }
}
