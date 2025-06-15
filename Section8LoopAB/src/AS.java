import java.util.Scanner;

public class AS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Arithmetic Progression (AP) Series Generator");
        System.out.println("------------------------------------------");

        // Get input values
        System.out.print("Enter first term (a): ");
        int firstTerm = scanner.nextInt();

        System.out.print("Enter common difference (d): ");
        int commonDiff = scanner.nextInt();

        System.out.print("Enter number of terms (n): ");
        int numTerms = scanner.nextInt();

        // Print the series
        System.out.println("\nGenerated AP Series:");
        printAPSeries(firstTerm, commonDiff, numTerms);

        // Print additional information
        System.out.println("\n\nSeries Information:");
        displaySeriesInfo(firstTerm, commonDiff, numTerms);

        scanner.close();
    }

    private static void printAPSeries(int a, int d, int n) {
        int term = a;
        for (int i = 1; i <= n; i++) {
            System.out.print(term);
            if (i < n) {
                System.out.print(" → ");
            }
            term += d;
        }
    }

    private static void displaySeriesInfo(int a, int d, int n) {
        // Calculate last term
        int lastTerm = a + (n - 1) * d;

        // Calculate sum of series
        int sum = (n * (a + lastTerm)) / 2;

        System.out.println("First Term (a): " + a);
        System.out.println("Common Difference (d): " + d);
        System.out.println("Number of Terms (n): " + n);
        System.out.println("Last Term: " + lastTerm);
        System.out.println("Sum of Series: " + sum);
    }
}

/*
Key Concepts of AP:
1. First Term (a): The starting number of sequence
2. Common Difference (d): The constant difference between consecutive terms
3. Number of Terms (n): How many numbers in the sequence
4. nth Term Formula: an = a + (n-1)d
5. Sum Formula: Sum = (n/2)(first term and last term)

Real-world examples of AP:
1. Natural numbers: 1, 2, 3, 4, 5... (a=1, d=1)
2. Even numbers: 2, 4, 6, 8... (a=2, d=2)
3. Odd numbers: 1, 3, 5, 7... (a=1, d=2)
4. Counting backwards: 100, 95, 90, 85... (a=100, d=-5)

The program can be used to:
- Generate a number of sequences
- Calculate terms in a series
- Find a sum of sequences
- Model linear patterns
- Solve problems involving constant change or growth

Common applications:
- Financial calculations (fixed payments)
- Distance calculations (constant speed)
- Temperature changes (linear)
- Grade progressions
- Simple interest calculations
*/
