package QueueDemo.ArrayDeque;

import java.util.ArrayDeque;

public class ArrayDequeDemo {
    public static void main(String[] args) {
    ArrayDeque<Integer> DQ  = new ArrayDeque<>();
    /*
    nic ArrayDeque<>();  Constructor.
    Takes Constant time.
    */

    DQ.offerLast(10);
    DQ.offerLast(20);
    DQ.offerLast(40);
    DQ.offe