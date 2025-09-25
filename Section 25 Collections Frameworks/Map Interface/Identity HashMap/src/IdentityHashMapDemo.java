import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new IdentityHashMap<>();

        /*
         * IdentityHashMap ek special Map implementation hai jo keys ko compare karta hai
         * sirf reference equality (==) ke basis par.

         * Matlab:
         * - Normal HashMap me comparison hota hai equals() aur hashCode() ke basis par.
         * - IdentityHashMap me comparison hota hai (k1 == k2).

         * Example:
         * Agar do alag String objects "Akshit" banaye (new String("Akshit")),
         * to HashMap unko equal maan lega (kyunki equals() true hoga).
         * Lekin IdentityHashMap unko alag treat karega (kyunki == false hoga).
         */

        // Agar chaho to neeche ka HashMap wala line use karke difference check kar sakte ho:
        // Map<String, Integer> map = new HashMap<>();

        String key1 = new String("Akshit");
        String key2 = new String("Akshit");

        map.put(key1, 90);
        map.put(key2, 92);

        // identityHashCode() ek utility hai jo object ka "memory reference based hash" deta hai.
        // Isse pata chalta hai ki dono objects alag-alag memory me store hain.
        System.out.println(System.identityHashCode(key1));
        System.out.println(System.identityHashCode(key2));

        /*
         * Normal HashMap me:
         *   - key1.equals(key2) true hota (kyunki String content same hai).
         *   - hashCode bhi same aata → same bucket me jaata.
         *   - Result: sirf ek entry banti, value overwrite ho jaati.
         *
         * IdentityHashMap me:
         *   - key1 == key2 false hai (alag objects hai).
         *   - Isliye dono alag keys treat hote hain.
         *   - Result: 2 alag entries banti hain.
         */

        // System.out.println(key1.equals(key2));  // Ye true hoga (normal equals check)
        System.out.println(map);
    }
}
