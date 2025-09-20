package GenericInterface;

public class TestEmployee {
    public static void main(String[] args) {
        Employee1 e1 = new Employee1("Alice", 30);
        Employee1 e2 = new Employee1("Bob", 25);

        int result = e1.compareTo(e2);
        System.out.println(result);  // >0 means e1 is older, <0 means e2 is older
    }
}
