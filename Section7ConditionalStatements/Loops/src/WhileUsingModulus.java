public class WhileUsingModulus {
    public static void main(String[] args) {
        int num = 1;
        int count = 0;

        System.out.println("Checking numbers from 1 to 10:");

        while (num <= 10) {
            System.out.print("Number " + num + " is ");

            if (num % 2 == 0 && num % 3 == 0) {
                System.out.println("divisible by both 2 and 3!");
                count++;
            } else {
                System.out.println("not divisible by both 2 and 3");
            }
            num++;
        }

        System.out.println("\nTotal numbers divisible by both 2 and 3: " + count);
    }
}
