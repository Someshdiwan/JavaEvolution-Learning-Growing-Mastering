enum Size
{
    SMALL
            {
                public String toString()
                {
                    return "Pizza is small";
                }
    },
    MEDIUM, LARGE, EXTRALARGE
}

public class Enum1 {
    public static void main(String[] args) {
        System.out.println(/*"string value of SMALL is " +*/ Size.SMALL.toString());
        System.out.println("string value of MEDIUM is " + Size.MEDIUM.name());
        System.out.println(Size.values().length);
    }
}

/*
1. toString():
   - By default -> enum constant ka name return karta hai (jaise name()).
   - Lekin override kar sakte ho per-constant basis.
   - Example: SMALL -> "Pizza is small" (custom string).

2. name():
   - Hamesha constant ka original declared name return karega (SMALL, MEDIUM, ...).
   - Isko override nahi kar sakte.

3. values():
   - Enum ke sare constants ek array me return karta hai.
   - Useful for loops or counting constants.

4. Enum is implicitly final and extends java.lang.Enum.

In Java, we can get the string representation of enum constants using the toString() method or the name() method.
*/
