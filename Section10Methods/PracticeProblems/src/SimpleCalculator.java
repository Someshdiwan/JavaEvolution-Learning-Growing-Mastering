public class SimpleCalculator {

    // Method 1: No parameters - adds two constants
    void calculate() //No parameters
    {
        int x = 7, y = 13;
        int sum = x + y;
        System.out.println("Addition (no parameters): " + sum);
    }

    // Method 2: Two parameters - multiplies them and returns result
    int calculate(int a, int b) {
        return a * b;
    }

    // Method 3: Three parameters - subtracts and prints result
    void calculate(int a, int b, int c) {
        int result = a - b - c;
        System.out.println("Subtraction (three parameters): " + result);
    }

    public static void main(String[] args) {
        SimpleCalculator calc = new SimpleCalculator();

        calc.calculate();  // Output: Addition (no parameters): 20

        int product = calc.calculate(4, 5);  // 4 * 5 = 20
        System.out.println("Multiplication (two parameters): " + product);

        calc.calculate(50, 20, 10);  // 50 - 20 - 10 = 20
    }
}
