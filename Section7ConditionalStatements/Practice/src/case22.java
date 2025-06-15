import java.util.Scanner;

class Case22 {
    public static void main(String[] args) {
        int ch;
        do {
            System.out.println("1.Marathi 2.Hindi 3.English 4.Exit");
            Scanner sc = new Scanner(System.in);
            ch = sc.nextInt();

            switch(ch) {
                case 1: System.out.println("You have selected Marathi");
                    break;
                case 2: System.out.println("You have selected Hindi");
                    break;
                case 3: System.out.println("You have selected English");
                    break;
                case 4: System.out.println("Exited the menu");
                    break;
                default: System.out.println("You have selected the wrong option");
            }
        }
        while(ch!=4);
    }
}
