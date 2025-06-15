import java.util.Scanner;

public class ForLoopAB5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();

        int sum=0;
        for(int i=1; i<=n; i++) {
            sum=sum+i;
        }
        System.out.println("Sum of "+n+" Number is "+sum);
    }
}

/*
Find the sum of the First 10 Natural Numbers.

n=10

0+1 = 1

1 1
2 1+2=3
3 3+3=6
6 6+4=10
10 10+5 = 15
15 15+6=21

Sum = 0; initially
Sum = Sum + i value

logic:

for(int i=1; i<=n; i++) {

}
*/
