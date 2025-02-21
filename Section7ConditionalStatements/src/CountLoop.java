public class CountLoop {
    public static void main(String[] args) {
        int res = 0;

        for (int i = 0; i < 10; i++)
        {
            for (int j = 0; j < 10; j++)
            {
                res++;
            }
        }
        System.out.println(res);
    }
}