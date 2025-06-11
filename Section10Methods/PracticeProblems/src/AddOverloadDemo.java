public class AddOverloadDemo {

    // Method 1: No parameters, adds hardcoded numbers
    void add() {
        int a = 10, b = 20;
        int sum = a + b;
        System.out.println("Sum (no parameters): " + sum);
    }

    // Method 2: Two parameters, returns the sum
    int add(int x, int y) {
        return x + y;
    }

    // Method 3: Three parameters, prints the sum
    void add(int x, int y, int z) {
        int sum = x + y + z;
        System.out.println("Sum (three parameters): " + sum);
    }

    // Main method to call all add methods
    public static void main(String[] args) {
        AddOverloadDemo obj = new AddOverloadDemo();

        obj.add();  // Calls method with no parameters

        int result = obj.add(15, 25);  // Calls method with two parameters
        System.out.println("Sum (two parameters): " + result);

        obj.add(5, 10, 20);  // Calls method with three parameters
    }
}
