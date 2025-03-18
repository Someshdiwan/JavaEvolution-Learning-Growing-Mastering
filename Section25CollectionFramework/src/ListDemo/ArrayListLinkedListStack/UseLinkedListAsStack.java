package ListDemo.ArrayListLinkedListStack;

import java.util.LinkedList;

public class UseLinkedListAsStack {
    public static void main(String[] args) {
        LinkedList<Integer> integers = new LinkedList<>();
        integers.addLast(1);
        integers.addLast(2);
        integers.addLast(3);

        Integer last = integers.getLast(); //Peek
        System.out.println(last);

        Integer remove = integers.removeLast(); //Poop
        System.out.println(remove);

        integers.size();
        integers.isEmpty();
        System.out.println(integers);

        //O(1) Time complexity.
    }
}
