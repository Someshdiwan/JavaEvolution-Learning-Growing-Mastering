public class countsDigits {
    public static void main(String[] args) {
        int n=467777777;
        System.out.println(n/10);
        int res = 0;
        while (n>0)
        {
            n = n/10;
            res++;
        }
        System.out.println(res);
    }
}
