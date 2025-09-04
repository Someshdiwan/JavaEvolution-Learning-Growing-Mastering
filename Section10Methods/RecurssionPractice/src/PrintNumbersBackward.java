public class PrintNumbersBackward {
    public static void main(String[] args) {
        countBackwards(7);
    }
    public static void countBackwards(int n){
        if(n==0) {
            System.out.println("Done!");
        }
        else {
            System.out.println(n);
            n--;
            countBackwards(n);
        }
    }
}
