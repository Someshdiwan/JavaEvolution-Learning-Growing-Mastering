//In Java, dictionaries are implemented using HashMap.

import java.util.HashMap;
import java.util.Map;

public class ForLoopDictionaries {
    public static void main(String[] args)
    {
        Map<String, Integer> student = new HashMap<>();
        student.put("Alice", 20);
        student.put("Bob", 22);
        student.put("Charlie", 19);

        // Iterating through keys

        System.out.println("Keys:");
        for (String key : student.keySet())
        {
            System.out.println(key);
        }

        // Iterating through values
        System.out.println("\nValues:");
        for (int value : student.values())
        {
            System.out.println(value);
        }

        // Iterating through key-value pairs

        System.out.println("\nKey-Value Pairs:");
        for (Map.Entry<String, Integer> entry : student.entrySet())
        {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
