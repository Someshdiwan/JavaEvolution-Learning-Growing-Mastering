import java.util.Scanner;

public class CountDigitsOfNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number");
        int n = scan.nextInt();

        int count = 0;

        while(n>0){
            n = n/10;
            count++;
        }
        System.out.println("Total digits are: "+count);
    }
}
