import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int c;

        try {
            c = a / b;
         /*
         This is without a try catch block.
         Program terminates and does not print the rest of the statements.n
         Exception in thread "main" java.lang.ArithmeticException: / by zero
         at ExceptionDemo.main(ExceptionDemo.java:7)
         */

            System.out.println(c);
        }
        catch (ArithmeticException e) {
            System.out.println("Denominator should not be Zero(0) try again: "+e);
        }
        System.out.println("Bye");
    }
}
