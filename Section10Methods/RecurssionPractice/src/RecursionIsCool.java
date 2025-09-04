public class RecursionIsCool {
    public static void main(String[] args) {
        //calling a method sayHi. Method called it-self.
        sayHi();
    }
    public static void sayHi() {
        System.out.println("Hi");
        //Method called inside(it-self).
        sayHi();
    }
}
