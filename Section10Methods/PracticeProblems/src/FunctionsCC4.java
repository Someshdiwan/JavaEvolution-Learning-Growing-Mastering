public class FunctionsCC4 {
    public static int calculateSum(int num1, int num2) {
        return num1 + num2;
    }
    public static void main(String[] args) {
        //Storing the returned value in a variable.
        int sum = 0;
        sum = calculateSum(3, 4);
        //calling a calculate sum method,
        int avg = sum / 2;
        System.out.println(avg);
    }
}
