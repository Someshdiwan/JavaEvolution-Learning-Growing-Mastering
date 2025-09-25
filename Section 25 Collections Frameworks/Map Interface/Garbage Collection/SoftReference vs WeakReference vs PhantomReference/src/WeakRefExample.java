import java.lang.ref.WeakReference;

public class WeakRefExample {
    public static void main(String[] args) {
        Object strong = new Object();
        WeakReference<Object> weak = new WeakReference<>(strong);

        System.out.println("weak.get(): " + weak.get()); // object present

        strong = null;
        System.gc();

        System.out.println("after GC weak.get(): " + weak.get()); // likely null
    }
}
