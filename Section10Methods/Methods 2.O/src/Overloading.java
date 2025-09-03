public class Overloading {
    public static void main(String[] args) {
          fun(7);
          fun("Somesh Diwan");

          int ans = sum(3, 4, 78);
          System.out.println(ans);
    }

    //First method called.
    static int sum(int a, int b) {
        return a + b;
    }

    //Second method called.
    static int sum(int a, int b, int c) {
        return a + b + c;
    }

    static void fun(int a) {
        System.out.println("first one");
        System.out.println(a);
    }

    static void fun(String name) {
        System.out.println("Second one");
        System.out.println(name);
    }
}
