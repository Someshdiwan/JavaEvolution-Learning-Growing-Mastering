public class PrimeOrNot {
    public static void main(String[] args) {
        System.out.println(isPrime(13));
        System.out.println(isPrime(91));
        System.out.println(isPrime(100));
        System.out.println(isPrime(2));
        System.out.println(isPrime(1));
    }

    /*
    Declaring a method 'isPrime'. and call this method into thr main method.

    A prime number is a number greater than 1 that has exactly two factors: 1 & itself.
    Examples:
    2 → factors: 1, 2 → prime ✅
    3 → factors: 1, 3 → prime ✅
    4 → factors: 1, 2, 4 → not prime ❌(extra factor)
    13 → factors: 1, 13 → prime ✅
    */

    public static boolean isPrime(int x) {
        if (x <= 1) return false; // 0 and 1 are not prime.

        for (int i = 2; i <= x / 2; i++)
        {
            if (x % i == 0) {
                return false; // found a divisor → not prime.
            }
        }
        return true; // no divisors found → prime
    }
}

/*
i <= x / 2; → keep looping until half of the number.
Why? Because a number can’t have a factor greater than x/2 (except itself).
*/
