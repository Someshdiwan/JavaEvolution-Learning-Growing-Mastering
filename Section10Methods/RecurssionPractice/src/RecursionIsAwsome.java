public class RecursionIsAwsome {
    public static void main(String[] args)
    {
        sayHi(5);
    }
    public static void sayHi(int n) {
        //Need a Base Case.
        //Base case means when to stop. printing infinite times.
        if(n==0) {
            System.out.println("Done!");
        }
        else {
            System.out.println("Hi");
            n--;
            sayHi(n);
        }
    }
}
