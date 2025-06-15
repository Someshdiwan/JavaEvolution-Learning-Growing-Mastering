import java.util.Scanner;

class Practice {
    public static void main(String[] args) {
        int x, y, res, ch;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        
        x = sc.nextInt();
        y = sc.nextInt();

        do {
            
            System.out.println("1.Addition 2.Subtraction 3.Multiplication 4.Division 5.Exit");
            ch = sc.nextInt();
           
            switch(ch) {
                case 1: res = x+y;
                    System.out.println("Addition of x & y is: "+res);
                    break;

                case 2: res = x-y;
                    System.out.println("Subtraction of x & y is: "+res);
                    break;

                case 3: res = x*y;
                    System.out.println("Multiplication of x & y is: "+res);
                    break;

                case 4: res = x/y;
                    System.out.println("Division of x & y is: "+res);
                    break;

                case 5: System.out.println("Succesfully Exited the Calculator");
                    break;

                default: System.out.println("Wrong Choice!!");
            }
        } while(ch!=5);
    }
}
