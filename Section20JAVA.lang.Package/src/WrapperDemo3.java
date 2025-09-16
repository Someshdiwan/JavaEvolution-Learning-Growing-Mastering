public class WrapperDemo3 {
    public static void main(String[] args) {
        //Character Class.
        Character a1='a';
        a1 = Character.toUpperCase(a1);

        System.out.println(a1);

        String str = Character.toString(a1);
        System.out.println(str);

        /*
        Character a1='a';
        Character.toUpperCase(a1);
        System.out.println(a1);

        Why doesn't a1 change?
        Immutability: The Character class is immutable, meaning its value cannot be changed once assigned.
        Return Value Not Used: Character.toUpperCase(a1) returns a new character ('A') but does not modify a1 in place.

        How to Fix It?
        You need to store the returned value from toUpperCase(a1),like this:

        Character a1 = 'a';
        a1 = Character.toUpperCase(a1);
        System.out.println(a1);  // Prints 'A'

        Similarly, Character.toString(a1) returns a String representation of a1, but does not modify a1.
        */

        //Boolean Class.
        Boolean b;
    }
}

/*
1. Character Wrapper Class immutable hai → ek baar object ban gaya to uski value
   change nahi hoti. Har method naya value return karega.

2. Example: Character.toUpperCase('a') → 'A' return karega,
   lekin original variable tabhi update hoga jab tum explicitly
   usse assign karoge:
   a1 = Character.toUpperCase(a1);

3. Character.toString(a1) → ek String banata hai (original Character ko
   modify nahi karta).

4. Boolean Wrapper Class bhi immutable hai.
   - Boolean.valueOf("true") → String ko Boolean object me convert karega.
   - print karne pe directly "true" ya "false" dikhata hai.

5. Rule of Thumb:
   - Wrapper classes (Integer, Character, Boolean, etc.) sab immutable hote hain.
   - Har operation me naya object return hota hai,
     original variable change nahi hota jab tak tum explicitly assign na karo.
*/
