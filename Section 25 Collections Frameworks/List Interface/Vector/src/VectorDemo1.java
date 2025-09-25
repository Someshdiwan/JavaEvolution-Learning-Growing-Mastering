import java.util.LinkedList;
import java.util.Vector;

public class VectorDemo1 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(3);
        linkedList.add(2);
        System.out.println(linkedList.size());

        Vector<Integer> vector = new Vector<>(linkedList);
        System.out.println(vector);
    }
}
