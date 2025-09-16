public class MathMethodsUseIt {
    public static void main(String[] args) {
        System.out.println("Absolute Value ");
        System.out.println(Math.abs(-123));

        System.out.println("Absolute Value ");
        System.out.println(StrictMath.abs(-123));
        //More Precise result when we are working with the Float Value.

        System.out.println("Cube Root: ");
        System.out.println(Math.cbrt(27));

        /*
        int i=Integer.MIN_VALUE;

        //i--;
        System.out.println(i);

        System.out.println("Exact Decrement: ");
        System.out.println(Math.decrementExact(7));
        System.out.println(Math.decrementExact(Integer.MIN_VALUE));
        */

        System.out.println("Exponent Value in Floating Point Rep. :");
        System.out.println(Math.getExponent(123456));

        //Maintain Exponent form mai store hota hai.
        //Power of 10.

        System.out.println("Round Division: ");
        System.out.println(Math.floorDiv(50, 9));

        System.out.println("e Power x : ");
        System.out.println(Math.exp(1));

        System.out.println("Log base 10: ");
        System.out.println(Math.log10(100));

        System.out.println("Maximum: ");
        System.out.println(Math.max(100, 50));

        System.out.println("Tan :");
        //Trigonometric fun it takes radian value.

        System.out.println(Math.tan(45*Math.PI/180));
        //Computation on Floating number.

        System.out.println("Convert To Radians :");
        System.out.println(Math.toRadians(90));

        System.out.println("Convert to Degree :");
        System.out.println(Math.toDegrees(Math.atan(1)));

        System.out.println("Convert To Degree :");
        System.out.println(StrictMath.toDegrees(StrictMath.tanh(1)));

        System.out.println("Random: ");
        System.out.println(Math.random()*1000);

        System.out.println("Power: ");
        System.out.println(Math.pow(2, 3));

        System.out.println("Exact Product: ");
        System.out.println(Math.nextAfter(100, 200));

        System.out.println("Next Float Value :");
        System.out.println(Math.nextAfter(12.5, 13));
    }
}
