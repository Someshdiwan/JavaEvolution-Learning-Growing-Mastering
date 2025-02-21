public class Factorial {
    public static void main(String[] args) {
        int n =6;
        int result = 1;
        while(n>0)
        {
            result = result *n;
            n--;
        }
        System.out.println(result);
    }
}
