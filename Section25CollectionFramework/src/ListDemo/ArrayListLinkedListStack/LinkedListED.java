package ListDemo.ArrayListLinkedListStack;

import java.util.LinkedList;

public class LinkedListED {
    public static void main(String[] args) {
    /*  Node node1 = new Node();
        Node node2 = new Node();

        node2.value = 2;
        node1.value = 1;

        node1.next = node2;
        node2.next = null;
    */

        //JAVA Ke Andar doubly linked list hoti hai.
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        System.out.println(linkedList.get(2)); //O(n) Time Complexity

        linkedList.addLast(4);
        // O(1) Koi loop nahi laga rahe hai element ko add karne mai.
        //Loop hota toh O(n) hoti like in ArrayList

        linkedList.addFirst(0); // O(1)

        linkedList.getLast();

        System.out.println(linkedList);
        /*
        Data and Pointer. Next and previous pointer to linked list.
        Time Complexity:
        Insertion and deletions are frequent. O(1)
        */
    }
}