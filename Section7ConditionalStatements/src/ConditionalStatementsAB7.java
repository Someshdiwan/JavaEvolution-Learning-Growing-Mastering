/*
find a type of website and the protocol.

is it a government website, private, or org website?
*/

import java.util.Scanner;

public class ConditionalStatementsAB7 {
    public static void main(String[] args) {
       /* Scanner scan = new Scanner(System.in);

        String url = scan.nextLine();

        String protocol = url.substring(0, url.indexOf(":"));

        if (protocol.equals("htttp"))
        {
            System.out.println("Hypertext transfer protocol");
        }
        else if (protocol.equals("ftp"))
        {
            System.out.println("File Transfer Protocol");
        }

        String ext=url.substring(url.lastIndexOf("."));
        {
            if(ext.equals("com"))
            {
                System.out.println("Commercial");
            }
            else ("Org")
            {
                System.out.println("Organization");
            }
            else if ("Net")
            {
                System.out.println("Network");
            }
            else
            {
                System.out.println("Fuck you get out from here:");
            }*/

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a URL:");
        String url = scan.nextLine();

        // Extract the protocol
        String protocol = url.substring(0, url.indexOf(":"));

        if (protocol.equals("http")) {
            System.out.println("Hypertext Transfer Protocol");
        }
        else if (protocol.equals("ftp")) {
            System.out.println("File Transfer Protocol");
        }
        else {
            System.out.println("Unknown protocol");
        }

        // Extract the domain type
        String ext = url.substring(url.lastIndexOf(".") + 1);

        if (ext.equals("com")) {
            System.out.println("Commercial website");
        }
        else if (ext.equals("org")) {
            System.out.println("Organization website");
        }
        else if (ext.equals("net")) {
            System.out.println("Network website");
        }
        else {
            System.out.println("Unknown website type");
        }
    }
}
