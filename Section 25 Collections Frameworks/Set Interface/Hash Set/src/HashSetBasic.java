import java.util.HashSet;

public class HashSetBasic {
    public static void main(String[] args) {
        HashSet<Integer> HS = new HashSet<>();

        HashSet<Integer> HS1 = new HashSet<>(20,0.24F);

        HS.add(10);
        HS.add(20);
        HS.add(30);
        HS.add(10);

        HS1.add(10);
        HS1.add(20);
        HS1.add(30);
        HS1.add(10);

        //Duplicate is not allowed.
        System.out.println(HS);

        System.out.println(HS1);
    }
}
