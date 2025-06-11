import java.util.Scanner;

class Item
{
    public static void main(String[] args)
    {
        Calculate c = new Calculate();
        c.getData();
        c.Result();
        c.Show();
    }
}

class Calculate
{
    int p, q, total;
    void getData()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the price of product:");
        p = sc.nextInt();
        System.out.println("Enter the quantity of the product:");
        q = sc.nextInt();
    }

    void Result()
    {
        total = p*q;
    }

    void Show()
    {
        System.out.println("Total price is: "+total);
    }
}