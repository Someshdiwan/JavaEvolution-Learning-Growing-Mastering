import java.util.ArrayList;

public class ArrayListDemo5 {
    public static void main(String[] args) {
        // Use Arraylist as a Stack.
        ArrayList<Integer> ArrayLists = new ArrayList<>();
        ArrayLists.add(1);
        ArrayLists.add(2);
        ArrayLists.add(3);

        ArrayLists.get(ArrayLists.size()-1); //Peek
        ArrayLists.remove(ArrayLists.size()-1); //Pop
    }
}

// arraylist as stack? Not good practice...In built methods they are not available.
