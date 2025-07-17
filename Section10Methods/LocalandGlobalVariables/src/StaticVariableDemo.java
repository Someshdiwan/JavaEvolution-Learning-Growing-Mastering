public class StaticVariableDemo {

    // 🔁 Static variable: belongs to the class, only one copy shared across all instances
    static int a = 10;

    void fun() {
        // 🔁 Local variable: created fresh every time the method is called
        int b = 10;

        // Print current values of a (static) and b (local)
        System.out.println(a + " " + b);

        // 🔼 ++a updates the shared static value, persists across calls
        ++a;

        // 🔁 ++b updates the local variable, but b is destroyed after method ends
        ++b;
    }

    public static void main(String[] args) {
        StaticVariableDemo s = new StaticVariableDemo();

        // ✅ First call to fun()
        // a = 10 → printed, then incremented to 11
        // b = 10 → printed, then dies after the method ends
        s.fun();

        // ✅ Second call to fun()
        // a = 11 (static retains value) → printed, then incremented to 12
        // b = 10 (new local copy) → printed again, dies again
        s.fun();
    }
}
