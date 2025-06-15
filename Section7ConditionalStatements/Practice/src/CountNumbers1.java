public class CountNumbers1 {
    public static void main(String[] args) {
        int n = 45535;

        int count = 0;
        while (n > 0) {
            int rem = n % 10;

            //code counts how many times the digit '5' appears in the number 45535.
            if (rem == 5) {
                count++;
            }
            n = n / 10;
        }
        System.out.println(count);
    }
}
