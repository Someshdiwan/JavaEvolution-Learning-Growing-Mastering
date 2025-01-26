import java.util.Scanner;

public class Email2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an email address: ");
        String str = scanner.nextLine();

        // Check if the email contains '@' and a '.' after '@'

        if (str.contains("@") && str.indexOf("@") < str.lastIndexOf("."))
        {
            int i = str.indexOf("@");
            String uname = str.substring(0, i);
            String domainname = str.substring(i + 1);

            System.out.println("Username: " + uname);
            System.out.println("Domain: " + domainname);

            // Check if the domain starts with "Gmail" (case-insensitive)
            boolean isGmail = domainname.toLowerCase().startsWith("gmail");
            System.out.println("Domain starts with 'Gmail': " + isGmail);

            // Check if the domain is exactly "gmail.com" (case-insensitive)
            int j = domainname.indexOf(".");
            if (j != -1) {
                String name = domainname.substring(0, j);
                boolean isValidGmail = name.equalsIgnoreCase("gmail");
                System.out.println("Is a valid Gmail address: " + isValidGmail);
            } else {
                System.out.println("Invalid domain format: missing '.' after '@'");
            }
        } else {
            System.out.println("Invalid email format. Please enter a valid email address.");
        }

        scanner.close();
    }
}