import java.util.Scanner;

public class DisplayDigitsFromRightToLeft {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scan.nextInt();

        int r;

        while (n>0){
            r = n%10;
            n = n/10;
            System.out.println(r);
        }
        System.out.println(n);
    }
}
