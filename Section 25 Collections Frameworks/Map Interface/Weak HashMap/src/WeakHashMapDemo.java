import java.util.WeakHashMap;

public class WeakHashMapDemo {

    public static void main(String[] args) {
        WeakHashMap<String, Image> imageChache = new WeakHashMap<>();

        imageChache.put("img1", new Image("Image 1"));
        imageChache.put("img2",new Image("Image 2"));
        System.out.println(imageChache);

        simlateApplicationRunning();
        System.gc();
        System.out.println("Cache after running (some entries may be cleared): " + imageChache);
    }
    private static void simlateApplicationRunning(){
        try {
            System.out.println("Simukleting application running...");
            Thread.sleep(10000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

class Image{
    private String name;
    public Image(String name){
        this.name = name;
    }
}
