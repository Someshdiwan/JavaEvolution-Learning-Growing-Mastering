public class StringBufferBuilder {
    public static void main(String[] args) {

        String s1 =new String("Hello");
        StringBuffer s2 = new StringBuffer("Hello");
        StringBuilder s3 = new StringBuilder("Hello");

        s1.concat(" World");
        s2.append(" World");
        s3.append(" World");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}

/*
1. String (Immutable):
   - Jab bhi hum concat(), replace(), etc. use karte hain,
     ek naya String object ban jata hai.
   - Purana string object modify nahi hota.
   - Example: "Hello" + " World" → naya object create hoga.

2. StringBuffer (Mutable + Thread-safe):
   - append(), insert(), delete() → directly existing object me changes karta hai.
   - Synchronization ki wajah se multi-threaded environment me safe hai,
     but performance thoda slow hota hai.

3. StringBuilder (Mutable + Faster):
   - Almost same as StringBuffer but NOT synchronized.
   - Isliye ye single-threaded use case me fastest option hai.

4. Output of this program:
   - s1 → "Hello" (kyunki String immutable hai aur concat() ka result ignore kiya gaya)
   - s2 → "Hello World" (append ne existing object update kar diya)
   - s3 → "Hello World" (append ne existing object update kar diya)

- Use String → jab value kabhi change nahi hogi.
- Use StringBuilder → jab frequent modifications single-threaded environment me karne hain.
- Use StringBuffer → jab multi-threaded environment me modifications karne hain.
*/
