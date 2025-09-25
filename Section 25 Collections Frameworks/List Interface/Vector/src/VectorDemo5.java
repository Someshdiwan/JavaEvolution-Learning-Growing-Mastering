import java.util.LinkedList;
import java.util.Vector;

public class VectorDemo5 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

        Vector<Integer> vector = new Vector<>(linkedList);
        System.out.println(vector);
        System.out.println("Size of the vector LinkedList Integrated: " + vector.size());

        for(int i=0;i<vector.size();i++) {
            System.out.println(vector.get(1));
        }
    }
}
