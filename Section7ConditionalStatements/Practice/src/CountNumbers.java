public class CountNumbers {
    public static void main(String[] args) {
        int n = 45535;
        System.out.println("Counting 5's in number: " + n);

        int count = 0;
        int original = n;
        while (n > 0) {
            int rem = n % 10;
            if (rem == 5) {
                count++;
                System.out.println("Found a 5 at position " + count);
            }
            n = n / 10;
        }
        System.out.println("\nTotal number of 5's in " + original + ": " + count);
    }
}
