class SharedObject{
    private volatile boolean flag = false;
    //Remove volatile and observe.

    public void setFlagTrue(){
        System.out.println("Writer thread made the true ");
        flag = true;
    }

    public void printFlagTrue(){
        while (!flag) {

        }
        System.out.println("Flag is true !");
    }
}


public class VolatileExample {
    public static void main(String[] args) {
        SharedObject obj1 = new SharedObject();
        Thread writerThread = new Thread(() -> {
            try{
                Thread.sleep(3000);
            }catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
            obj1.setFlagTrue();
        });
        Thread readerThread = new Thread(() -> obj1.printFlagTrue());

        writerThread.start();
        readerThread.start();
    }
}
