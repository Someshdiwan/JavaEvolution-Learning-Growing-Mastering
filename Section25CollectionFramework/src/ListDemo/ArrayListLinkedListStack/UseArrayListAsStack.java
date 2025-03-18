package ListDemo.ArrayListLinkedListStack;

import java.util.ArrayList;

public class UseArrayListAsStack {
    public static void main(String[] args) {
        ArrayList<Integer> ArrayLists = new ArrayList<>();
        ArrayLists.add(1);
        ArrayLists.add(2);
        ArrayLists.add(3);

        ArrayLists.get(ArrayLists.size()-1); //Peek
        ArrayLists.remove(ArrayLists.size()-1); //Pop
    }
}
/*
arraylist as stack?
Not good practice...In built methods are not available.
*/