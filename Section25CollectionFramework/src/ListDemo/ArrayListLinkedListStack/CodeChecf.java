package ListDemo.ArrayListLinkedListStack;
/*
Write a program that does the following.

Create an ArrayList of integers, add the elements [12, 25, 34, 46] to it Remove the number 25 from the ArrayList

Print the final ArrayList.
*/
import java.util.*;

class CodeChef {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(25);
        list.add(34);
        list.add(46);

        Integer RemoveANumber = list.remove(1);
        System.out.println("Number to be removed: "+RemoveANumber);
        System.out.println("Final List: "+list);
    }
}