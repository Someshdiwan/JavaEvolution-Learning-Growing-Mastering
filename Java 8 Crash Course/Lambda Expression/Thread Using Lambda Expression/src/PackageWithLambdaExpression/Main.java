package PackageWithLambdaExpression;

public class Main {
    public static void main(String[] args) {
        /* functional interface acts as a type for lambda expression. */
        Runnable runnable = () -> {
            for(int i=1; i<+10; i++) {
                System.out.println("Hello "+i);
            }
        };
        Thread childthread = new Thread(runnable);
        childthread.run();
    }
}
