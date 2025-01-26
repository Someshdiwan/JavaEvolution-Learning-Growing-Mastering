//Find number of words in string
//Logic: we need to remove spaces and then count it.
//Method called split("\\s");

public class RegularExpressionChallenge5 {
    public static void main(String[] args) {
        String str = "abc bcc fgh ijk ok";

        str= str.replaceAll("\\s+", " ").trim();
        String words[] = str.split("\\s");
        System.out.println(words.length);

        //O/p: total 5 words.
    }
}
