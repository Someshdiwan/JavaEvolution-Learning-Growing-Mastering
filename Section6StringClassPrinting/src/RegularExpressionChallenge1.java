//Find is number is hexa decimal or not
//[0-9A-F]+ plus is they are one or more

public class RegularExpressionChallenge1 {
    public static void main(String[] args) {
        String str = "234AB";
        System.out.println(str.matches("[0-9A-F]*"));
        /*
        The hexadecimal number system, often referred to as "hex," is a base-16 numeral system used extensively in
        computing and digital electronics.
        It consists of 16 symbols: the numbers 0 to 9 and the letters A to F.
        These letters represent the decimal values 10 to 15, respectively
        */
    }
}
