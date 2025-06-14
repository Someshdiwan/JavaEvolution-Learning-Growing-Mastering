import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your Roll No: ");
        int rollno = input.nextInt();
        System.out.println("Your Roll No is: " + rollno);

        System.out.println("Please enter your Name: ");
        String name = input.next();
        System.out.println(name);

        System.out.println("Please enter your Marks: ");
        float marks = input.nextFloat();
        System.out.println(marks);
    }
}
