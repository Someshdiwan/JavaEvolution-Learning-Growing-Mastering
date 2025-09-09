public class VariableArguments {
    static void show(int ...A) {
        for (int x : A) {
            System.out.print(" "+x);
        }
    }
    public static void main(String[] args) {
        show();
        show(10,20,30);
        show(new int[]{3,4,5,6,7,8,9,10});
        //New means created in heap
        //No reference it is an anonymous array reference.
    }
}
