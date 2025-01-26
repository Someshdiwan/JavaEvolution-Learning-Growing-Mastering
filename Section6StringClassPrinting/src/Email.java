import java.util.Scanner;

public class Email {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter an email address
        System.out.print("Enter your email address: ");
        String str = scanner.nextLine();

        // Check if the email contains '@' and '.' to validate its format
        if (!str.contains("@") || !str.contains(".")) {
            System.out.println("Invalid email format.");
        } else {
            // Extract the username and domain name
            int i = str.indexOf("@");
            String uname = str.substring(0, i);
            String domainname = str.substring(i + 1);

            System.out.println("UserName: " + uname);
            System.out.println("Domain is: " + domainname);

            // Check if the domain starts with "Gmail"
            System.out.println("Is it a valid Gmail domain (case-sensitive)? " + domainname.startsWith("Gmail"));

            // Further check if the domain name is valid for Gmail
            int j = domainname.indexOf(".");
            String name = domainname.substring(0, j);
            System.out.println("Is it a valid Gmail domain (case-insensitive)? " + name.equalsIgnoreCase("gmail"));
        }

        // Close the scanner
        scanner.close();
    }
}
