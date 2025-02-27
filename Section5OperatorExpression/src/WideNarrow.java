public class WideNarrow {
    public static void main(String[] args) {
        byte b;
        short s = 100;

        int i;
        long l;
        float f;
        double d;

        // Narrowing (Explicit)
        b = (byte) s;
        System.out.println("Byte: " + b);

        // Widening (Implicit)
        i = s;
        System.out.println("Int: " + i);

        l = s;
        System.out.println("Long: " + l);

        f = s;
        System.out.println("Float: " + f);

        d = s;
        System.out.println("Double: " + d);

        // Narrowing (Explicit) - Float to Int (loses decimals)
        f = 10.5f;
        i = (int) f;
        System.out.println("Int after casting from Float: " + i);
    }
}

/*
short s = 120; s is assigned the value 120.

Type Conversions:

1️⃣ Narrowing: short → byte (Explicit Casting)

b = (byte) s;

System.out.println(b);

short (16-bit) → byte (8-bit).

s = 120 is within the valid range of byte (-128 to 127), so no data loss occurs.

Output: 120

2️⃣ Widening: short → int (Implicit Casting)

i = s;

System.out.println(i);

short (16-bit) → int (32-bit).

No explicit casting needed because int is larger than short.

Output: 120

3️⃣ Widening: short → long (Implicit Casting)

l = s;

System.out.println(l);

short (16-bit) → long (64-bit).

Output: 120

4️⃣ Widening: short → float (Implicit Casting)

f = s;

System.out.println(f);

short (16-bit) → float (32-bit).

Output: 120.0 (since float has decimal representation)

5️⃣ Widening: short → double (Implicit Casting)

d = s;

System.out.println(d);

short (16-bit) → double (64-bit).

Output: 120.0 (because double supports decimal values)

Final Output

120      //byte
120     //int
120    //long
120.0  //float
120.0 // double

Because s = 120 is within range, all conversions preserve its value.

What Happens If s = 130?

short s = 130;
b = (byte) s;

System.out.println(b);
byte range is -128 to 127.

130 exceeds the byte range, so data loss occurs.

Byte wraps around (because of overflow):
130 - 256 = -126
Output: -126

Conclusion:
Widening (short → int, long, float, double) keeps the value intact ✅.
Narrowing (short → byte) works only when the value fits the range.

If the value exceeds the target type's range, overflow occurs.
*/