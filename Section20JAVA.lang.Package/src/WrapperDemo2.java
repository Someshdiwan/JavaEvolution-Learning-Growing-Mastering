public class WrapperDemo2 {
    public static void main(String[] args) {
        float a =12.5f;
        Float b =12.5f/0;
        Float c =(float)Math.sqrt(9); //Square root of 9 is 3. then it is a number.

        System.out.println(b.equals(a));
        System.out.println(b.isInfinite()); //Checking is a number infinite or not.

        System.out.println(b==Float.POSITIVE_INFINITY);

        System.out.println(b==Float.NEGATIVE_INFINITY);

        System.out.println(c.isNaN());

        System.out.println(b==Float.NaN);

        System.out.println(b!=Float.NaN);

        System.out.println(Float.NaN!=Float.NaN);
    }
}
