import java.util.Scanner;

public class EmailValidate {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your email address: ");
        String str = scanner.nextLine();

        int i = str.indexOf("@");

        String uname = str.substring(0, i);
        String domainname = str.substring(i + 1);

        System.out.println("UserName: " + uname);
        System.out.println("Domain is: " + domainname);

        System.out.println(domainname.startsWith("Gmail")); // Check if it starts with "Gmail"

        int j = domainname.indexOf(".");
        String name = domainname.substring(0, j);
        System.out.println(name.equalsIgnoreCase("gmail")); // Check if it's "gmail"

        scanner.close();
    }
}