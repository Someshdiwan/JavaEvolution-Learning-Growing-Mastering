public class RecursionIsCool {
    public static void main(String[] args) {
        //calling a method sayHi.
        sayHi();
        //Method called it-self.
    }
    public static void sayHi() {
        System.out.println("Hi");
        //Method called inside(it-self).
        sayHi();
    }
}
