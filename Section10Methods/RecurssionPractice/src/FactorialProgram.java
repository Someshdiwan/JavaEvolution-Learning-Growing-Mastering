public class FactorialProgram {
    public static void main(String[] args) {
        System.out.println(factorial(7));

        /*
        Number Multiply by each Preceding number.
        5! = 5 * 4 * 3 * 2 * 1 = 120

        if u called method inside itself i will repeat infinite many times.
        need Base case to know when to stop the method.
        Base case need.
        */

    }
    public static int factorial(int n)
    {
        if(n == 1) {
            System.out.println("Factorial("+n+") = 1");
            //Base case is 1. Factorial of 1 is 1.
            return 1;
        }
        else {
            System.out.println("Factorial(" + n + ") = " + n + " * Factorial(" + (n-1)+ ")"); //Printing current value and Formula version.
            return n * factorial(n - 1); //current number n and n * ( n - 1);
        }
    }
}
