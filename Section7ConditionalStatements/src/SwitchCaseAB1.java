//Display name of the day based on the number.

//The 'switch' statement cannot be used to compare string values; it only works with integral or enumeration types


import java.util.Scanner;

public class SwitchCaseAB1 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter Day Number");
        int day = read.nextInt();

        switch (day){
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wed");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Sat");
                break;

            case 7:
                System.out.println("sunday");
                break;

            default:
                System.out.println("Day is not a valid day try another one");
                break;
        }
    }
}
