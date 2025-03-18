package ListDemo.Vector;

import java.util.Vector;

public class VectorED {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>(5,5);
        //Its Capacity not size.
        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        System.out.println(vector.capacity());
        vector.add(1);
        vector.add(1);
        vector.add(1);
        System.out.println(vector.capacity());
        vector.add(1);
        System.out.println(vector.capacity());
        vector.add(1);
        System.out.println(vector.capacity());
    }
}
