import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListDemo1 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(7);
        linkedList.add(6);
        linkedList.add(8);
        linkedList.add(9);
        linkedList.add(10);
        linkedList.add(44);
        linkedList.add(46);
        linkedList.add(70);

        linkedList.sort(null); // Natural order of the sorting.
        System.out.println(linkedList);

        // Removing Even Numbers from Linked List.
        linkedList.removeIf(x-> x % 2 == 0);
        System.out.println("Removed Even Numbers From Linked List: " + linkedList);


        LinkedList<String> animals = new LinkedList<>(Arrays.asList("Cat","Dog","Elephant","lion"));
        LinkedList<String> animalsToRemove = new LinkedList<>(Arrays.asList("Dog","lion"));

        animals.removeAll(animalsToRemove);
        System.out.println(animals);
    }
}
