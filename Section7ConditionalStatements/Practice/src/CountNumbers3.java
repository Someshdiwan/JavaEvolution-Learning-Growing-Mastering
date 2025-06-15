public class CountNumbers3 {
    public static void main(String[] args) {
        String number = "45535";
        int count = number.length() - number.replace("5", "").length();
        System.out.println("Number of 5's: " + count);
    }
}
