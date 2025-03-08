package ListDemo;
/*
Write a program that does the following.

Create an ArrayList of integers, add the elements [12, 25, 34, 46] to it Remove the number 25 from the ArrayList

Print the final ArrayList.
*/
import java.util.*;

class CodeChef {
    public static void main(String[] args) {
        ArrayList<Integer> EnterANumber = new ArrayList<>();
        EnterANumber.add(12);
        EnterANumber.add(25);
        EnterANumber.add(34);
        EnterANumber.add(46);

        EnterANumber.remove(1);
        System.out.println(EnterANumber);
    }
}