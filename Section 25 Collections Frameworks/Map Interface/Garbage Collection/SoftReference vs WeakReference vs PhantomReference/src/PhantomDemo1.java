import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;

public class PhantomDemo1 {
    static class NativeResource {
        private final int id;
        NativeResource(int id) { this.id = id; }
        @Override public String toString() { return "NR#" + id; }
    }

    public static void main(String[] args) throws InterruptedException {
        ReferenceQueue<NativeResource> queue = new ReferenceQueue<>();
        NativeResource res = new NativeResource(1);

        // create phantom ref (get() returns null)
        PhantomReference<NativeResource> pr = new PhantomReference<>(res, queue);

        System.out.println("before nulling res, pr.get() = " + pr.get()); // always null

        // drop strong ref
        res = null;

        // suggest GC
        System.gc();
        Thread.sleep(200);

        // check queue - if enqueued, we can run cleanup
        Reference<? extends NativeResource> r = queue.poll();
        if (r != null) {
            System.out.println("Phantom enqueued — do cleanup now for " + r);
            // free native memory / close handles here
            r.clear();
        } else {
            System.out.println("No phantom enqueued yet.");
        }
    }
}

// PhantomReference + ReferenceQueue example (cleanup).
