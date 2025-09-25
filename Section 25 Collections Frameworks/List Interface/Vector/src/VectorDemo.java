import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>(5,5);
        //Its Capacity doesn't size.
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(7);
        vector.add(5);

        System.out.println(vector.capacity());

        vector.add(100);
        vector.add(90);
        vector.add(110);

        System.out.println(vector.capacity());

        vector.add(11);

        System.out.println(vector.capacity());

        vector.add(88);

        System.out.println(vector.capacity());
    }
}
