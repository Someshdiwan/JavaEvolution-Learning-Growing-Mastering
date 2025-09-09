public class MethodAB2 {
    static void inc(int x) {
        x++;
        System.out.println(x);
    }
    public static void main(String[] args) {
        int a=10,b=15;
        inc(a); //Parameter passing. the value of actual parameter will not modify if the formal parameter will change.
        System.out.println(a); //Call by value
    }
}
