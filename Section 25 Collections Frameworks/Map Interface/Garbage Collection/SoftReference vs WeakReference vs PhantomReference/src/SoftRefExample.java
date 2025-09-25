import java.lang.ref.SoftReference;

public class SoftRefExample {
    public static void main(String[] args) {
        Object strong = new Object();
        SoftReference<Object> soft = new SoftReference<>(strong);

        System.out.println("soft.get(): " + soft.get()); // likely non-null

        strong = null; // drop strong ref
        System.gc();

        System.out.println("after GC soft.get(): " + soft.get()); // null if memory low
    }
}
