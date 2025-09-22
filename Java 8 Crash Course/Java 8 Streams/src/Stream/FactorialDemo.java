package Stream;

import java.util.stream.IntStream;

class FactorialDemo {
    static void printFactorial(int n) {
        long factorial = IntStream.rangeClosed(1, n)
                .reduce(1, (int a, int b) -> a * b);
        System.out.println("The factorial of the given number is: " + factorial);
    }

    static void solve(int n) {
        printFactorial(n);
    }

    public static void main(String[] args) {
        solve(6);
    }
}
