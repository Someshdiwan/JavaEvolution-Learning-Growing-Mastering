public class Loops {
    public static void main(String[] args) {
        System.out.println("These are the odd numbers from 1 to 100.");

        System.out.println("Ready?");

        //for values from 1 to 100
        for (int value = 1; value <= 100; value++) {
            if (value % 2 != 0) {
                System.out.println(value);
            }
        }
        System.out.println("That was fast!");
    }
}
