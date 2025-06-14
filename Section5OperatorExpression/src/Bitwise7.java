public class Bitwise7 {
    public static void main(String[] args)
    {
        int x = 8;    //  00001000 (Binary)
        System.out.println(x >> 1); // 00000100 -> Output: 4
        //System.out.println(x >>> 2);

        int y = -8;   //  11111000 (Binary in Two's Complement)
        System.out.println(y >> 1); // 11111100 -> Output: -4
    }
}
