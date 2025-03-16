package GarbageCollectionDemo;

import java.lang.ref.WeakReference;

public class GCDemo {
    public static void main(String[] args) {
        /*
        Strong reference:
        Phone phone = new Phone("Apple", "16 Pro Max");
        //Obj create keya hai heap mai.
        phone = null;
        System.out.println(phone);
        */
        Phone phone = new Phone("Apple", "16 Pro");

        // Create a Phone object and wrap it in a WeakReference
        WeakReference<Phone> phoneWeakReference = new WeakReference<>(phone);
        //Weak References.

        // Print the phone object through weak reference
        System.out.println("Before Garbage Collection: " + phoneWeakReference.get());

        // Remove strong reference
        phone = null;

        // Request garbage collection
        System.gc();

        try {
            Thread.sleep(10000); // Give some time for GC to run
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Check if object is still accessible
        System.out.println("After GC: " + phoneWeakReference.get());
    }
}

class Phone
{
    String brand;
    String model;

    public Phone(String brand, String model)
    {
        this.brand = brand;
        this.model = model;
    }

    @Override
    public String toString()
    {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}