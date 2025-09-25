public class CollisionInHashMapDemo {
    public static void main(String[] args) {
        System.out.println(simpleHash("ABC"));
        System.out.println(simpleHash("CBA"));
    }

    public static int simpleHash(String key) {
        int sum = 0;
        for( char c : key.toCharArray()) {
            sum += (int) c;
        }
        return sum % 10;
    }
}

/*
1. Purpose of Code:
   - Yeh code ek simple **hash function** dikhata hai jo ek String ko ek chhote number me convert karta hai.
   - Iska use mainly HashMap jaise data structures me hota hai jaha keys ko bucket index me map karna padta hai.

2. Function simpleHash(String key):
   - Ek String ko character array me convert karta hai.
   - Har character ka ASCII value nikal ke `sum` me add karta hai.
   - Finally `sum % 10` return karta hai → matlab remainder 10 se divide karne ke baad.

   Example:
   - `"ABC"` → A=65, B=66, C=67
     sum = 198 → 198 % 10 = 8

   - `"CBA"` → C=67, B=66, A=65
     sum = 198 → 198 % 10 = 8

3. Collision Concept:
   - Dono Strings `"ABC"` aur `"CBA"` alag hain but hash value same (8) aayi.
   - Is situation ko **Collision** bolte hain (different keys → same hash bucket).
   - Real HashMap me bhi aisa ho sakta hai, isliye collision handling zaroori hai (chaining, open addressing, etc.).

4. Quick Recap:
   ✔ Hash function banaya jo string ko int me convert karta hai.
   ✔ ASCII values add karke `% 10` se bucket index milta hai.
   ✔ Example me `"ABC"` aur `"CBA"` dono ka result same aaya → Collision example.
*/
