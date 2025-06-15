import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a character: ");

       char ch = in.next().trim().charAt(0);

        if (Character.isLetter(ch)) {
            if (Character.isLowerCase(ch)) {
                System.out.println("'" + ch + "' is Lowercase");
            } else {
                System.out.println("'" + ch + "' is Uppercase");
            }
        } else {
            System.out.println("'" + ch + "' is not a letter");
        }
        in.close();
    }
}
