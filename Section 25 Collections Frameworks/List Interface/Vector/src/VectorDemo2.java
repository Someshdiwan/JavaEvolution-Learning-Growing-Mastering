import java.util.Collections;
import java.util.LinkedList;
import java.util.Vector;

public class VectorDemo2 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(3);
        linkedList.add(2);

        System.out.println(getSize(linkedList, null));
        Vector<Integer> vector = new Vector<>(linkedList);
        System.out.println(vector);
    }

    public static int getSize(LinkedList<Integer> list, Object arg) {
        if (arg == null) {
            Collections.sort(list);  // Sort the list in natural order
        }
        return list.size();
    }
}

/* getSize()
Argument: The actual value passed when calling the method. Object arg is a parameter, and when you pass null,
it becomes an argument that controls the sorting behavior before returning the size.
*/
