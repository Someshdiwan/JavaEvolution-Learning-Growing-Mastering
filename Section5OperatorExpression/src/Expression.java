import java.lang.*;
import java.util.Scanner;

class Expression {
    public static void main(String args[])
    {
        float base;
        float height;
        float area;

        System.out.println("Enter Base and Height ");
        Scanner sc = new Scanner(System.in); //Read the value

        base = sc.nextFloat();
        height = sc.nextFloat();

        area = base * height / 2;
        System.out.println("Area of Triangle is " + area);
    }
}