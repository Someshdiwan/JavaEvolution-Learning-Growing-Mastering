import java.lang.reflect.Field;
import java.util.ArrayList;

public class ArrayListCapacityReflection {
    public static void main(String[] args) throws Exception {
        // Start with an initial capacity hint of 11
        ArrayList<Integer> list = new ArrayList<>(11);

        // Fill with eleven elements
        for (int i = 0; i < 11; i++) list.add(1);

        // Access private elementData via reflection (for demo/learning only)
        Field field = ArrayList.class.getDeclaredField("elementData");
        field.setAccessible(true);

        Object[] elementData = (Object[]) field.get(list);
        System.out.println("ArrayList capacity: " + elementData.length);

        // Force an addition to trigger resize
        list.add(1);
        elementData = (Object[]) field.get(list);
        System.out.println("ArrayList capacity after adding one more: " + elementData.length);

        // Remove many elements to observe size vs capacity
        for (int i = 0; i < 8; i++) list.remove(2);
        elementData = (Object[]) field.get(list);
        System.out.println("ArrayList capacity after removals: " + elementData.length);

        // Trim to size to shrink a backing array
        list.trimToSize();
        elementData = (Object[]) field.get(list);
        System.out.println("ArrayList capacity after trimToSize(): " + elementData.length);
    }
}
