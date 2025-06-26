 //Program to Print the Sum of First 10 Natural Numbers Using while Loop

 public class SumOfTheNumbers2 {
     public static void main(String[] args) {
         int i = 1;                  // Initialize the counter
         int sum = 0;               // Variable to store the sum

         while (i <= 10) {
             sum += i;             // Add the current number to the sum
             i++;                  // Increment the counter
         }
         System.out.println("Sum of first 10 natural numbers: " + sum);
     }
 }
