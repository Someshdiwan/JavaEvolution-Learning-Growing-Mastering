public class Questions2 {
    public static void main(String[] args) {
        int num = 153; // number to check

        // ---------------- Prime Check ----------------
        boolean isPrime = true;
        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime) {
            System.out.println("Prime");
        }

        // ---------------- Armstrong Check ----------------
        int original = num;
        int sum = 0, temp = num, digits = 0;

        while (temp > 0) {
            digits++;
            temp /= 10;
        }

        temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            int power = 1;

            // multiply digit "digits" times (instead of Math.pow)
            for (int i = 0; i < digits; i++) {
                power *= digit;
            }

            sum += power;
            temp /= 10;
        }
        if (sum == original) {
            System.out.println("Armstrong");
        }
    }
}
