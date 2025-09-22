class OuterStatic {
    int x=10;
    static int y=20;
    static class MyStatic {
        public void show() {
            System.out.println(y);
        }
    }
}
public class StaticInnerClass {
    public static void main(String[] args) {
        OuterStatic.MyStatic o = new OuterStatic.MyStatic();
        o.show();
    }
}
