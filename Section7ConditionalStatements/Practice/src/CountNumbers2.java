public class CountNumbers2 {
    public static void main(String[] args) {
        String number = "45535";
        long count = number.chars().filter(ch -> ch == '5').count();
        System.out.println("Number of 5's: " + count);
    }
}
