public class Break {
    public static void main(String[] args) {
        int i =0;

        while(i<10000) {
            System.out.println(i);

            if(i==500) {
                break;
            }
            i++;
        }
        System.out.println("Break and Continue");
    }
}
