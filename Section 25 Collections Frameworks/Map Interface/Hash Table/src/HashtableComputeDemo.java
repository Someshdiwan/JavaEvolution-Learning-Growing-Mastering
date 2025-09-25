import java.util.Hashtable;

public class HashtableComputeDemo {
    public static void main(String[] args) {
        Hashtable<Integer, String> ht = new Hashtable<>();

        ht.put(1, "A");
        ht.put(2, "B");
        ht.put(3, "C");

        System.out.println("Before compute: " + ht);

        // compute: recompute value for key 2 based on its current value
        // lambda (k, v) receives key and current value v (non-null for Hashtable)
        ht.compute(2, (k, v) -> v + "Z"); // "B" -> "BZ"

        // computeIfAbsent: if key 7 absent, compute and put "Z7"
        ht.computeIfAbsent(7, (k) -> "Z" + k);

        System.out.println("After compute & computeIfAbsent: " + ht);

        /*
         - compute(2, (k,v) -> v + "Z") : agar key 2 pe value thi (v="B"),
           to lambda return karega "BZ" aur woh new value ban jayegi.
         - computeIfAbsent(7, k -> "Z"+k) : agar key 7 nahi hai tab hi value "Z7" insert hogi.
        */
    }
}
