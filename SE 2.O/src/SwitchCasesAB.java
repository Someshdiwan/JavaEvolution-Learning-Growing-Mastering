//Comparison between else if Ladder and switch cases.

public class SwitchCasesAB
{
    public static void main(String[] args) {
        //int n = 9;
        byte n = 9;
        //String str = "2";

        switch (n){
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            default:
                System.out.println("Number is not valid Try again");
        }
    }
}

//public class SwitchCasesAB {
//    public static void main(String[] args) {
//        int n = 1;
//        if(n==1)
//        {
//            System.out.println("One");
//        } else if (n==2) {
//            System.out.println("Two");
//        } else if (n==3) {
//            System.out.println("Three");
//        } else if (n==4) {
//            System.out.println("Four");
//        }
//        else {
//            System.out.println("Not a valid number");
//        }
//    }
//}
