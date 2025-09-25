package Package;

public class Test {
    public static void main(String[] args) {
        // Behind the view of working a Linked list in Java.
        Node linkedlistNode = new Node();
        Node linkedlistNode2 = new Node();

        linkedlistNode.value = 2;
        linkedlistNode2.value = 1;

        linkedlistNode.next = linkedlistNode2;
        linkedlistNode2.next = null;

    }
}

class Node {
    public int value;
    public Node next; // Reference to what ...Next Node
}
