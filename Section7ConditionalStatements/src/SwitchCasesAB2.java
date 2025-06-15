import javax.swing.*;
import java.util.Scanner;

public class SwitchCasesAB2 {
    public static void main(String[] args) {
        Scanner read = new Scanner((System.in));

        System.out.println("Enter a number to check the month: ");

        int Number = read.nextInt();

        switch (Number) {
            case 1: {
                System.out.println("Jan");
                break;
            }
            case 2: {
                System.out.println("Feb");
                break;
            }
            case 3: {
                System.out.println("March");
                break;
            }
            case 4: {
                System.out.println("April");
                break;
            }
            case 5: {
                System.out.println("May");
                break;
            }
            case 6: {
                System.out.println("June");
                break;
            }
            case 7: {
                System.out.println("July");
                break;
            }
            case 8: {
                System.out.println("Aug");
                break;
            }
            case 9: {
                System.out.println("Sep");
                break;
            }
            case 10: {
                System.out.println("Oct");
                break;
            }
            case 11: {
                System.out.println("Nov");
                break;
            }
            case 12: {
                System.out.println("December");
                break;
            }
            default: {
                System.out.println("Month is not valid try another number to check month");
                break;
            }
        }
    }
}
