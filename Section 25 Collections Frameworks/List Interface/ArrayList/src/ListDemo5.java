import java.util.*;

public class ListDemo5 {
    public static void main(String[] args) {
        ArrayList<Integer> al1 = new ArrayList<>(20);
        ArrayList<Integer> al2 = new ArrayList<>(List.of(50, 60, 70, 80, 90));

        al1.add(10);
        al1.add(0,5);
        al1.addAll(1, al2);
        al1.set(5,70);
        al1.set(6, 100);

        Iterator<Integer> it=al1.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }

        ListIterator<Integer> it2 = al1.listIterator();

        while(it2.hasNext()) {
            System.out.println(it2.hasPrevious());
            System.out.println(it2.hasNext());
        }
    }
}
