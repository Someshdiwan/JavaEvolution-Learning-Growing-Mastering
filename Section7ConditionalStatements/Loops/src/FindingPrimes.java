public class FindingPrimes {
    public static void main(String[] args) {
        int currentNumber = 2; //Number analyzed
        int maxNumber = 20; //Maximum value to be checked

        //Main loop that goes from 2 to 20
        while(currentNumber <= maxNumber) {
            //Loop that checks all integers from 2 to the current number (starts with 2, ends with 20)
            for (int divisor = 2; divisor <= currentNumber; divisor++) {
                //We know that the number is prime if it already checked all previous divisors
                if (divisor == currentNumber) {
                    System.out.println(currentNumber + " is a prime number!");
                    /* break or continue */;
                }
                //We know that the number is NOT prime if it can be divided by a lower integer
                if (currentNumber % divisor == 0) {
                    System.out.println(currentNumber + " is NOT a prime number!");
                    /* break or continue */;
                }
            }
            //After finished checking if the number is prime or not, we must proceed to the next one
            currentNumber++;
        }
    }
}
