// "static void main" must be defined in a public class.
public class StringIMP {
    public static void main(String[] args) {
        int n = 150000;

        double timeStringBuilder = useStringBuilder(n);
        double timeStringConcat = useStringConcat(n);
        System.out.println("Time elapsed using StringBuilder: " + timeStringBuilder + " seconds");
        System.out.println("Time elapsed using StringConcat : " + timeStringConcat + " seconds");

        System.out.println("\nStringBuilder was " + (int) (timeStringConcat / timeStringBuilder) + " times faster");
    }

    static double useStringBuilder(int n) {
        long start = System.nanoTime();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append("a");
        }

        long end = System.nanoTime();
        return (end - start) / (double) 1000000000;
    }

    static double useStringConcat(int n) {
        long start = System.nanoTime();

        String str = "";
        for (int i = 0; i < n; i++) {
            str += "a";
        }

        long end = System.nanoTime();
        return (end - start) / (double) 1000000000;
    }
}