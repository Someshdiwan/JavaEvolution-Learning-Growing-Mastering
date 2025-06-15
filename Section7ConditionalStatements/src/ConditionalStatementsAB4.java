/*
Find a person is young or not young.

if(age >= 14 && age <= 55), if age>=14 true young, if(age <14 || age > 55) not young.
*/

import java.util.Scanner;

public class ConditionalStatementsAB4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age;
        System.out.println("Enter a age of the person");

        age = scanner.nextInt();

        if(age >=14 && age <=55) {
            System.out.println("Person is young");
        } else {
            System.out.println("Person is not a young");
        }
    }
}
