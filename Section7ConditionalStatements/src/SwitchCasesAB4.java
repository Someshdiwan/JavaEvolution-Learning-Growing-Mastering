//Display type of website

import java.util.Scanner;

public class SwitchCasesAB4 {
    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);
        System.out.print("Enter a Website URL To check In which category the website is belong: ");

        String Domain = read.nextLine();
        String ext = Domain.substring(Domain.lastIndexOf(".")+1);

        switch(ext.toLowerCase()) {
            case "com":
                System.out.println("commercial Website");
                break;

            case "org":
                System.out.println("Organization");
                break;

            case "gov":
                    System.out.println("Government");
                    break;

            case "net":
                System.out.println("Network");
                    break;

            default: System.out.println("Invalid Domain");
        }
    }
}
