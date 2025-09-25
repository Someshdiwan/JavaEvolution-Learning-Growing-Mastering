public class StrongReferenceDemo {
    public static void main(String[] args) {
        // Create a strong reference to a Phone object.
        Phone phone = new Phone("Apple", "16 Pro Max");

        // At this point, 'phone' strongly refers to the Phone object in heap.
        System.out.println("Phone via strong reference: " + phone);

        // Nullify the reference, making the object eligible for GC.
        phone = null;

        // Now the Phone object has no references → eligible for GC.
        System.out.println("After nullifying reference: " + phone);
    }
}

// Demonstrates how strong references work in Java.
// A strong reference prevents an object from being garbage collected
// until the reference is explicitly set to null or goes out of scope.
