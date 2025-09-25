import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;

public class PhantomDemo {
    static class NativeResource {
        private final int id;
        NativeResource(int id) { this.id = id; }
        @Override public String toString() { return "NR#" + id; }
    }
    public static void main(String[] args) throws InterruptedException {
        ReferenceQueue<NativeResource> queue = new ReferenceQueue<>();
        NativeResource res = new NativeResource(1);

        PhantomReference<NativeResource> pr = new PhantomReference<>(res, queue);

        System.out.println("pr.get() = " + pr.get()); // always null
        res = null; // drop strong reference

        System.gc();
        Thread.sleep(200);

        Reference<? extends NativeResource> r = queue.poll();
        if (r != null) {
            System.out.println("Phantom enqueued — cleanup now");
            r.clear();
        }
    }
}

/*
•	SoftReference → Cache data that can be reloaded (but let JVM evict under memory pressure).
•	WeakReference → Avoid preventing GC (e.g., weak keys in maps, listener cleanup).
•	PhantomReference → Do resource cleanup safely (close files, free native memory).
*/
