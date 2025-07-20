import java.util.Scanner;

class ClAdd {
    public static void main(String[] args) {
        Add a = new Add();
        a.getData();
        a.getTotal();
        a.showData();
    }
}

class Add {
    int a, b, total;

    void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values of a & b to perform addition: ");
        a = sc.nextInt();
        b = sc.nextInt();
    }

    void getTotal() {
        total = a+b;
    }

    void showData() {
        System.out.println("Addition of a & b is: "+total);
    }
}
