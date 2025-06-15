package Solve2;

import java.util.Scanner;

class StudentInfo {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.getData();
        s2.getData();

        s1.showData();
        s2.showData();
    }
}

class Student {
    int roll_no;
    String name;
    double per;

    void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter details of student:");
        System.out.print("Roll No: ");
        roll_no = sc.nextInt();

        System.out.print("Name: ");
        name = sc.next();

        System.out.print("Percentage: ");
        per = sc.nextDouble();
    }

    void showData() {
        System.out.println("Details are:");
        System.out.println("Roll No: " + roll_no + ", Name: " + name + ", Percentage: " + per);
    }
}
