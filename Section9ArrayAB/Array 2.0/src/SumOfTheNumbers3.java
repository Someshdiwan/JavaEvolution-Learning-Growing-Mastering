import java.util.Scanner;
public class SumOfTheNumbers3 {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         System.out.print("Enter the value of n: ");
         int n = scanner.nextInt();

         int sum = 0;
         int counter = 1;

         // While loop to calculate the sum
         while (counter <= n) {
             sum += counter;        // Add the current number to the sum
             counter++;
         }
         System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
         scanner.close();
     }
 }
