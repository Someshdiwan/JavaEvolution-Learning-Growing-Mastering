import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Demo {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();

        // List<String> shoppingList = new ArrayList<>();
        // Uncomment and see error then comment and run.

        List<String> shoppingList = new CopyOnWriteArrayList<>();
        shoppingList.add("Milk");
        shoppingList.add("Eggs");
        shoppingList.add("Bread");

        /*
         System.out.println("Initial Shopping List: "+shoppingList);
         for(String item : shoppingList) {
             System.out.println(item);
         }
        */

        // Read and write both at a time while reading.
        System.out.println("Initial Shopping List: "+ shoppingList);

        for(String item : shoppingList) {
            System.out.println(item);

            if(item.equals("Eggs")) {
                shoppingList.add("Butter");
                System.out.println("Adding Butter while reading.");
            }
        }
        System.out.println("Updated shopping list: "+ shoppingList);
    }
}

/*
Single threaded operation and snapshot create karta hai...photocopy of an item or object.

Copy On Write means That whenever a write operation like adding or removing an element,
instead of directly modifying the existing list, a new copy of the list is created,
and the modification is applied to that copy

This ensures that other threads reading the last while it's being modified are being unaffected.

Read Operations: Fast and direct, since they happen-on a static list without interference from modification.

write operations: A new copy of the list is created for every modification.

The reference to the list is then updated so that subsequent(later) reads use this new list.

Notepad --> Notepad copy

Applications Read intensive operations ho.More memory consumption things here.
*/
