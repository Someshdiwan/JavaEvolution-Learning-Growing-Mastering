/*
Find grades for given marks.
m1, m2, m3 marks of three marks subjects.
total and average.
ave>=70 garde "A" and so on. check conditional statement below
*/

import java.util.Scanner;

public class ConditionalStatementsAB5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m1, m2, m3;

        System.out.println("Enter a mark of subjects: ");

        m1=scanner.nextInt();
        m2=scanner.nextInt();
        m3=scanner.nextInt();

        float avg = (float) (m1+m2+m3)/3;
        if (avg>=70){
            System.out.println("You have obtain Grade A");
        }
        else if (avg >= 60 && avg < 70)
        {
            System.out.println("You have obtain garde B");
        } else if (avg>=50 && avg <60) {
            System.out.println("You have obtain garde C");
        } else if (avg>=40 && avg < 50) {
            System.out.println("You have obtain grade D");
        }
        else {
            System.out.println("Garde E");
        }
    }
}