package HashMapDemo.LinkedHashMapDemo;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapFixSize
{
    public static void main(String[] args)
    {
        // Create an anonymous subclass of LinkedHashMap that overrides removeEldestEntry
        LinkedHashMap<Integer, String> LHM = new LinkedHashMap<>(5, 0.75F, true)
        {
            @Override
            protected boolean removeEldestEntry(Map.Entry<Integer, String> eldest)
            {
                // Remove the eldest entry if the size exceeds 7
                return size() > 7;
            }
        };

        //Suppose you want to limit the size of the Linked-Hash Map then you need to override the method
        //inside Class and anonymous class must be...protected boolean ....

        LHM.put(1,"Hello");
        LHM.put(2,"Bye");
        LHM.put(3,"See You");
        LHM.put(4,"Gotham City");
        LHM.put(5,"The Dark Night Rises");
        LHM.put(6,"I am the BatMan");
        LHM.put(7,"Just Grind Hard Everyday and night");

        String s = LHM.get(2);
        s = LHM.get(5);
        s= LHM.get(1);
        LHM.put(8,"Least access element removed and here this is the new element added");
        LHM.forEach((k,v)->System.out.println(k+" "+v));
    }
}