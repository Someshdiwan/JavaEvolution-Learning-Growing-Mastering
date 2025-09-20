package GenericClass;

public class Main {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("Age", 50);
        Pair<String, Integer> pair2 = new Pair<>("Age", 88);

        System.out.println("Key: " + pair.getKey());
        System.out.println("Key: " + pair2.getKey());
        System.out.println("Value: " + pair.getValue());
        System.out.println("Value: " + pair2.getValue());
    }
}
