public class FindPrimeNumbers {
    public static void main(String[] args) {
        int currentNumber = 2; // Number to analyze
        int maxNumber = 20;    // Max value to check

        while (currentNumber <= maxNumber) {
            boolean isPrime = true;

            for (int divisor = 2; divisor <= currentNumber / 2; divisor++) {
                if (currentNumber % divisor == 0) {
                    System.out.println(currentNumber + " is NOT a prime number!");
                    isPrime = false;
                    break; // No need to check further, already found a divisor
                }
            }

            if (isPrime) {
                System.out.println(currentNumber + " is a prime number!");
            }

            currentNumber++;
        }
    }
}
