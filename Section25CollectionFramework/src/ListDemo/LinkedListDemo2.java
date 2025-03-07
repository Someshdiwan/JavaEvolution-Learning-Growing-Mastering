package ListDemo;

// Submit to check the output
import java.util.*;

class LinkedList2
{
    public static void main (String[] args) {
        LinkedList<String> myList = new LinkedList<String>();
        LinkedList<Integer> myList2 = new LinkedList<Integer>();

        myList.add("Finish Report");
        myList.addFirst("Call Client");
        myList.addLast("Send Email");

        myList2.add(2);
        myList2.addFirst(3);
        myList2.addLast(3);

        System.out.println(myList+" "+myList2);
    }
}