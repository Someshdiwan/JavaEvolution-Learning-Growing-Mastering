package IteratorDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorForEachLoop {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        for (int i : list)
        {
            System.out.print("List of Arrays using for each loop: "+i);
        }

        System.out.println("Using Iterator");
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }


        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

//        for (Integer number : numbers) {
//            if (number % 2 == 0) {
//                numbers.remove(number);
//            }
//        }

        System.out.println("Using Iterator Remove Even Numbers");
        Iterator<Integer> itr = numbers.iterator();
        while (itr.hasNext()) {
            Integer number = itr.next();
            if (number % 2 == 0) {
                itr.remove();
            }
        }
        System.out.println(numbers);


        ListIterator<Integer> listIterator = numbers.listIterator();
        while (listIterator.hasNext())
        {
            System.out.println(listIterator.next());
//            listIterator.set();
        }
    }
}