package ListDemo.SatckDemo;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        /*
        LIFO- Last-In First Out Principle.
        Last item added to the stack.That item removed first.

        Stack extends vector
        Stack extends the vector. it is synchronized, making it thread safe.
        */

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack);

        Integer RemoveElement =  stack.pop();
        System.out.println(stack);

        Integer peek = stack.peek();
        System.out.println(peek);

        System.out.println(stack.isEmpty());

        System.out.println(stack.size());

        stack.add(2, 7);
        System.out.println(stack);

        int search = stack.search(4); //getting index of Top element. from top of the stack.
        System.out.println(search);
       /*
        4
        3
        2
        1
        0
        ...... Indexing of elements in stack.

        Returns the 1-based position where an object is on this stack.

        If the object o occurs as an item in this stack, this method returns the distance
        from the top of the stack of the occurrence nearest the top of the stack;

        the topmost item on the stack is considered to be at distance 1.

        The equals method is used to compare o to the items in this stack.
        */
    }
}
