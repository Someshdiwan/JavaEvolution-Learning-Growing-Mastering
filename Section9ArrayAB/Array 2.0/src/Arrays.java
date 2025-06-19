public class Arrays {
    public static void main(String[] args) {
        String[] weekDays = new String[7];

        weekDays[0] = "Monday ";
        weekDays[1] = "Tuesday ";
        weekDays[2] = "Wednesday ";
        weekDays[3] = "Thursday ";
        weekDays[4] = "Friday ";
        weekDays[5] = "Saturday ";
        weekDays[6] = "Sunday ";

        int[] primes = {2, 3, 5, 7, 11, 13, 17};

        for (int i=0; i<7; i++) {
            System.out.print(weekDays[i]);
            System.out.println(primes[i]);
        }
    }
}
