import java.lang.ref.WeakReference;

public class WeakReferenceDemo {
    public static void main(String[] args) {
        // Create a strong reference to a Phone object.
        Phone phone = new Phone("Apple", "16 Pro");

        // Wrap the Phone object inside a WeakReference.
        WeakReference<Phone> phoneWeakReference = new WeakReference<>(phone);

        // At this point:
        // strong reference -> 'phone'
        // weak reference   -> 'phoneWeakReference'
        System.out.println("Before GC: " + phoneWeakReference.get());

        // Remove the strong reference. Now only weak reference exists.
        phone = null;

        // Request Garbage Collection.
        System.gc();

        try {
            Thread.sleep(3000); // Give GC time to run.
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // WeakReference may have been cleared by GC.
        System.out.println("After GC: " + phoneWeakReference.get());
    }
}

// Demonstrates how weak references work in Java using WeakReference.
// Weak references do not prevent an object from being garbage collected.
