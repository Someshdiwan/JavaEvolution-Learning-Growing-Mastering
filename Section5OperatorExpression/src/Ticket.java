class Ticket {
    public static void main(String[] args) {
        int a = 5, c = 3, at = 1000, ct = 500;
        int tp = (a*at) + (c*ct);
        double gst = 0.18 * tp;
        double pbd = tp+gst;
        double dp = 0.1 * pbd;
        double fp = pbd - dp;

        System.out.println("Final Price is: "+fp);
    }
}