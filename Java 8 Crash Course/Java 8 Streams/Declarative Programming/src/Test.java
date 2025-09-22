import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        // Imperative approach.
        // Below code, if the current number is even then add into a sum. finding sum of even numbers.
        int[] array = {1,2,3,4,5};
        int sum1 = 0;

        for(int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                sum1 += array[i];
            }
        }
        System.out.println(sum1);

        // Declarative Approach.
        int[] array2 = {1,2,3,4,5};
        int sum2 = Arrays.stream(array2).filter(n -> n % 2 == 0).sum();
        System.out.println(sum2);
    }
}
