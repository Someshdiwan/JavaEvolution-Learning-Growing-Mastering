public class StaticBlock {
    //Class loaded and then executed a static without main method.
    static {
        System.out.println("Block One");
    }

    static {
        System.out.println("Block Three");
    }

    public static void main(String[] args) {
        Test t = new Test();
        System.out.println("Main");
        System.out.println("Print after the satic execuation block");
    }

    static {
        System.out.println("Block Two");
    }
}
