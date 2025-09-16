public class WrapperClasses {
    public static void main(String[] args) {
        int m1=15;

        Integer m2=m1;
        Integer m3=15;

        Integer m4= Integer.valueOf("123");
        Integer m5= Integer.valueOf("11111", 2);
        Integer m6 =Integer.valueOf("A7", 15);
        Integer m7=Integer.bitCount(9999);

        System.out.println(m7);

        String m8="1234";
        System.out.println(Integer.parseInt(m8));


        System.out.println(Integer.reverseBytes(128));
        System.out.println(Integer.reverseBytes(128)==Integer.MIN_VALUE);

        System.out.println(Integer.toBinaryString(40));
        
        System.out.println(m4);
        System.out.println(m5);
        System.out.println(m6);

        System.out.println(m2.equals(m3));
    }
}

/*
Returns the number of one-bits in the two's complement binary representation of the specified int value.
This function is sometimes referred to as the population count.

Params: i – the value whose bits are to be counted.
Returns: the number of one-bits in the two's complement binary representation of the specified int value.

1. Autoboxing → int m1 = 15; automatically Integer object ban jaata hai.
2. Integer.valueOf(String, radix) → String ko specified base (radix) se Integer banata hai.
   - Example: "11111" base 2 → 31 decimal.
   - "A7" base 15 → decimal me convert hota hai.
3. Integer.bitCount(n) → n ke binary representation me kitne 1-bits hai (population count).
4. Integer.parseInt("1234") → String → int conversion.
5. Integer.reverseBytes(x) → Byte order (endianness) reverse kar deta hai.
6. Integer.toBinaryString(40) → decimal 40 ko binary string "101000" me convert karega.
7. equals() vs == → equals() values compare karta hai, == reference check karta hai (wrapper classes me confuse ho sakta hai).
*/
