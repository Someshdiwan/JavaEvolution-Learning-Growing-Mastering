//Remove extra spaces from string

//Logic:  String str = "abc      de       fgh           ijk"

//Method used here: str.ReplaceAll("\\s", " ");

//Small s means space capital s means not a space

public class RegularExpressionChallenge4 {
    public static void main(String[] args) {
        String str = "               abc    de      fgh        ijk";

        System.out.println(str.replaceAll("\\s+", " ").trim());
    }
}
