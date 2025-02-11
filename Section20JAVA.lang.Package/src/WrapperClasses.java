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
Note:
Returns the number of one-bits in the two's complement binary representation of the specified int value.
This function is sometimes referred to as the population count.

Params: i – the value whose bits are to be counted

Returns: the number of one-bits in the two's complement binary representation of the specified int value.
*/