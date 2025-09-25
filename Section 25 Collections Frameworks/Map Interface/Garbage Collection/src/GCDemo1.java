import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

public class GCDemo1 {
    // A simple object with a moderately large byte[] so GC will likely reclaim it under pressure.
    static class Big {
        private final byte[] data;
        private final int id;

        Big(int id) {
            this.id = id;
            // allocate ~1MB so GC can notice memory pressure in small demos
            this.data = new byte[1_000_000];
        }

        @Override
        public String toString() {
            return "Big#" + id;
        }
    }

    public static void main(String[] args) throws Exception {
        ReferenceQueue<Big> refQueue = new ReferenceQueue<>();

        // 1) Strong reference: will keep object alive until cleared
        Big strong = new Big(1);

        // 2) WeakReference to a freshly created Big(2) — no strong ref -> eligible immediately
        WeakReference<Big> weak1 = new WeakReference<>(new Big(2), refQueue);

        // 3) WeakReference to the object currently held by "strong"
        WeakReference<Big> weak2 = new WeakReference<>(strong, refQueue);

        System.out.println("Before GC:");
        System.out.println("  strong = " + strong);
        System.out.println("  weak1.get() = " + weak1.get());
        System.out.println("  weak2.get() = " + weak2.get());
        System.out.println("  refQueue.poll() = " + refQueue.poll());
        System.out.println();

        // Make the previously-strong object eligible for GC by removing the strong ref
        strong = null;

        // Suggest GC and wait a bit — JVM may run GC and clear weak refs
        System.gc();
        Thread.sleep(800);

        System.out.println("After GC:");
        System.out.println("  weak1.get() = " + weak1.get()); // most likely null (no strong refs ever)
        System.out.println("  weak2.get() = " + weak2.get()); // likely null now (strong was nulled)
        System.out.println();

        // Inspect reference queue to see which weak references were enqueued after GC
        Reference<? extends Big> enqueued;
        while ((enqueued = refQueue.poll()) != null) {
            System.out.println("Reference enqueued (cleared by GC): " + enqueued);
        }

        System.out.println("\nDemo finished.");
    }
}

/*
1. Purpose of Code:
- Yeh program dikhata hai ki JVM Garbage Collector **strong** aur **weak** references ko kaise treat karta hai.
- `WeakReference` wali objects strong reference ke bina garbage collect ho sakti hain.
- Agar object GC ke dwara clear hoti hai, toh weak reference ko `ReferenceQueue` me daal diya jata hai.

2. Important Parts:
- Big class: ek heavy object (~1MB array) banaya gaya hai taaki GC ko pressure dikhe.
- strong reference: object ko alive rakhta hai jab tak null nahi hota.
- weak1: ek object ke liye jo sirf weakly referenced hai, aur jaldi collect ho jaayega.
- weak2: initially same object ko point karta hai jo strong bhi refer kar raha hai.
- ReferenceQueue: jab weak reference clear hota hai, JVM usko queue me enqueue kar deta hai.

3. Execution Flow:

- Before GC:
       strong -> Big#1
       weak1.get() -> Big#2
       weak2.get() -> Big#1
       refQueue = empty

- After `strong = null;` + GC:
       strong -> null
       weak1.get() -> null (collected)
       weak2.get() -> null (collected)
       refQueue -> [weak1, weak2]

4. ASCII Diagram:

   Before GC:
   -------------------------
   strong ---> [Big#1]
   weak1 -X-> [Big#2]
   weak2 -X-> [Big#1]
   refQueue: empty
   -------------------------

   After GC:
   -------------------------
   strong -> null
   weak1.get() -> null
   weak2.get() -> null
   refQueue: [weak1, weak2]
   -------------------------

5. Quick Recap:
✔ Strong reference: object ko GC se bachata hai.
✔ Weak reference: GC kabhi bhi clear kar sakta hai agar strong ref na ho.
✔ ReferenceQueue: pata lagta hai ki object collect ho gaya.
✔ `System.gc()` sirf JVM ko suggestion deta hai (force nahi).

Practical Use:
- Weak references caches me use hote hain.
- Yeh memory leaks prevent karte hain jab object ki lifetime app ke control me nahi hoti.

Initially (before pulling strong):
Heap:
[ Big#1 ] <-- strong
[ Big#2 ] <-- only weak1 (no strong)
References:
strong -> Big#1
weak1 -X-> Big#2 (weak)
weak2 -X-> Big#1 (weak)
refQueue: empty


After strong = null and GC:
Heap:
[ <free> ]  (Big#1 reclaimed)
[ <free> ]  (Big#2 reclaimed)
References:
strong -> null
weak1.get() -> null
weak2.get() -> null
refQueue: [ weak1, weak2 ]  (weak refs enqueued)
*/
