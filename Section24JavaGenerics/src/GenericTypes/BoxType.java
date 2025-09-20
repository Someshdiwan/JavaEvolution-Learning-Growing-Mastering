package GenericTypes;

public class BoxType {
    public static void main(String[] args) {
        Box box = new Box();
        box.setValue(1);

        String i = (String) box.getValue(); // EXCEPTION !!!
        System.out.println(i);
    }
}
