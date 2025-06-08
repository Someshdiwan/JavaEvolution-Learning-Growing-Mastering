package Solve;

import java.util.Scanner;

class Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int pos = 0;
        double topper = 0;

        System.out.print("Enter no. of Students: ");
        n = sc.nextInt();

        SolveIT[] s = new SolveIT[n];

        for (int i = 0; i < n; i++) {
            s[i] = new SolveIT();
        }

        for (int i = 0; i < n; i++) {
            s[i].getData();
        }

        for (int i = 0; i < n; i++) {
            s[i].display();
        }

        for (int i = 0; i < n; i++) {
            if (s[i].per > topper) {
                topper = s[i].per;
                pos = i;
            }
        }

        System.out.println("Topper is:");
        s[pos].display();
    }
}

class SolveIT {
    int roll;
    String name;
    double per;

    void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student Details:");
        System.out.print("Roll: ");
        roll = sc.nextInt();
        System.out.print("Name: ");
        name = sc.next();
        System.out.print("Percentage: ");
        per = sc.nextDouble();
    }

    void display() {
        System.out.println("Roll No: " + roll + ", Name: " + name + ", Percentage: " + per);
    }
}
