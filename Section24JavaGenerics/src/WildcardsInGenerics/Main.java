package WildcardsInGenerics;

import java.util.ArrayList;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {

    }

    /*
    public <T> void printArrayList(ArrayList<T> list) {
        for(T o: list) {
            System.out.println(o);
        }
    }
    */

    public void printArrayList(ArrayList<?> list) {
        for(Object o: list) {
            System.out.println(o);
        }
    }

    /*
    <T> Object getFirst(ArrayList<?> list) {
        return list.get(0);
    }
    */

    /*
    public<T> T getFirst(ArrayList<T> source, ArrayList<T> destination) {
        for(T item : source) {
            destination.add(item);
        }
    }
    */
}
