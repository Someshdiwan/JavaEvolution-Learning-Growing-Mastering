public class SBClass {
    public static void main(String args[]) {
        // Creating a new StringBuffer
        StringBuffer str = new StringBuffer("Hello");
        str.append(" World!");
        System.out.println(str);
    }
}

/*
StringBuffer is a class that allows us to create and modify a flexible, expandable sequence of characters.

It is thread-safe.
This means that it can be safely used when multiple threads are accessing or modifying the string concurrently.

But due to synchronization, it is slower than StringBuilder. StringBuffer str = new StringBuffer();

Example:
Above is an example which implements the StringBuffer class. Java program to demonstrate the StringBuffer class

1. StringBuffer ek mutable sequence of characters hai.
   Matlab ek baar object create karne ke baad bhi uske andar ke content ko
   change (modify) kiya ja sakta hai bina naye object create kiye.

2. Thread-safety:
   - StringBuffer synchronized hoti hai.
   - Matlab multiple threads agar ek hi object ko access/modify karein
     to ye safe rehti hai.
   - Downside: synchronization ke wajah se ye thoda slow hoti hai.

3. StringBuilder vs StringBuffer:
   - StringBuilder → NOT synchronized, faster, single-threaded use case ke liye best.
   - StringBuffer → Synchronized, thread-safe, multi-threaded use case ke liye best.

4. Commonly used methods:
   - append() → end me add karne ke liye
   - insert() → beech me insert karne ke liye
   - delete() → characters remove karne ke liye
   - reverse() → pura string ulta karne ke liye
   - capacity() → buffer capacity check karne ke liye
   - ensureCapacity() → minimum capacity set karne ke liye

5. Example flow:
   StringBuffer str = new StringBuffer("Hello");
   str.append(" World!");
   Output: Hello World!

Real-life use case:
Jab tumhe string ke upar **bahut saare modifications** karne hain (like append, insert, delete in loops)
aur multi-threaded environment hai, tab StringBuffer ek solid choice hai.
*/
