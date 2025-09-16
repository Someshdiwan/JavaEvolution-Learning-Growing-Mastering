public class WrapperClassesDemo {
    public static void main(String[] args) {
        // Primitive data types
        char letter = 'A';
        boolean value = true;
        int intNum = -269;
        double floatNum = Math.pow(2, 2); // 2^2 = 4.0

        // Autoboxing: Primitive → Wrapper Objects
        Character Letter = letter;   // (Character.valueOf(letter))
        Boolean Value = value;       // (Boolean.valueOf(value))
        Integer IntNum = intNum;     // (Integer.valueOf(intNum))
        Double FloatNum = floatNum;  // (Double.valueOf(floatNum))

        // Wrapper objects print their stored values
        System.out.println(Letter + " " + Value + " " + IntNum + " " + FloatNum);

        // More wrapper objects
        Long Num1 = 987L;
        Float Num2 = 34.56f;

        // Unboxing: Wrapper → Primitive
        long num1 = Num1;   // (Num1.longValue())
        float num2 = Num2;  // (Num2.floatValue())

        System.out.println(num1 + " " + num2);
    }
}

/*
1. Autoboxing & Unboxing:
   - Primitive → Wrapper automatically ho jaata hai.
     Example: int x = 5; Integer y = x; // Autoboxing
   - Wrapper → Primitive bhi automatic hota hai.
     Example: Integer obj = 10; int z = obj; // Unboxing

2. Wrapper Classes ka kaam:
   - Primitive types ko Objects ki tarah treat karne ke liye use hote hain.
   - Useful in Collections (ArrayList<int> allow nahi hai, but ArrayList<Integer> chalega).

3. Common methods:
   - Integer.valueOf(String, radix) → String ko given base (radix) se integer me convert karta hai.
     Example:
       "11111" base 2 → 31 decimal
       "A7" base 15 → decimal 157
   - Integer.parseInt("1234") → String ko int me convert karta hai.

4. Special methods:
   - Integer.bitCount(n) → n ke binary representation me kitne 1-bits hai (population count).
   - Integer.reverseBytes(x) → Byte order reverse kar deta hai (endianness swap).
   - Integer.toBinaryString(40) → 40 ko binary string "101000" me convert karega.

5. equals() vs == :
   - equals() → object ke values compare karta hai.
   - == → reference (memory address) compare karta hai.
   - Wrapper classes me confusion ho sakta hai (Integer caching effect ke wajah se).

6. Performance Note:
   - Wrapper classes thread-safe nahi hote, sirf object wrappers hote hain.
   - Autoboxing zyada use karne se performance cost ho sakti hai (boxing/unboxing overhead).
*/
