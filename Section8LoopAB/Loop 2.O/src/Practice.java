public class Practice {
    public static void main(String[] args) {
        int X = 3;
        int Y = 4;
        int Z = 12;

        if ((Z % X == 0) && (Z % Y == 0)) {
            System.out.println("Z is divisible by both X and Y");
        } else if ((Z % X == 0) && (Z % Y != 0)) {
            System.out.println("Z is divisible only by X");
        } else if ((Z % Y == 0) && (Z % X != 0)) {
            System.out.println("Z is divisible only by Y");
        } else {
            System.out.println("Z is divisible by neither X nor Y");
        }

        X = 3;
        Y = 5;
        Z = 13;

        if ((Z % X == 0) && (Z % Y == 0)) {
            System.out.println("Z is divisible by both X and Y");
        } else if ((Z % X == 0) && (Z % Y != 0)) {
            System.out.println("Z is divisible only by X");
        } else if ((Z % Y == 0) && (Z % X != 0)) {
            System.out.println("Z is divisible only by Y");
        } else {
            System.out.println("Z is divisible by neither X nor Y");
        }
    }
}