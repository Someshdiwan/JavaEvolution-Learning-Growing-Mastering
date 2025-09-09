public class DemoExample {
    public static void main(String[] args) {
        String chacha = "Iron Man";

        //outside main class declare a method 'greet' and print name.
        greet(chacha);
    }
    static void greet(String naam) {
        System.out.println("Name: "+naam);
    }
}
