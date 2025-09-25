import java.util.Map;
import java.util.WeakHashMap;

public class  WeakHashDemo  {
    public static void main(String[] args) {
        WeakHashMap<String, Image> imageCache = new WeakHashMap<>();
        loadCache(imageCache);

        System.out.println(imageCache);
        System.gc();

        simulateApplicationRunning();
        System.out.println("Cache after running (some entries may be cleared): " + imageCache);
    }

    public static void loadCache(Map<String, Image> imageCache) {
        String k1 = new String("img1");
        String k2 = new String("img2");
        imageCache.put(k1, new Image("Image 1"));
        imageCache.put(k2, new Image("Image 2"));
    }

    private static void simulateApplicationRunning() {
        try {
            System.out.println("Simulating application running...");
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Image1 {
    private String name;

    public Image1(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return name;
    }
}

/*
1. Purpose of Code:
   - Yeh code **WeakHashMap** ka demo hai jo dikhata hai ki keys agar
     weakly referenced hain aur unka strong reference nahi bacha, toh
     Garbage Collector (GC) unhe clean kar deta hai.
   - Mainly caching scenarios ke liye useful hai (auto memory cleanup).

2. loadCache():
   - Do naye String objects banaye gaye: "img1" aur "img2" (new ke saath,
     taaki ye String pool me na jaye).
   - Inhe WeakHashMap ke andar as keys use kiya gaya.
   - Values ke roop me `Image` objects store kiye gaye.

3. Garbage Collection Behavior:
   - Jab tak "img1" aur "img2" ka koi strong reference nahi hai,
     GC unhe clean kar dega.
   - WeakHashMap automatically un entries ko remove kar dega
     jinki keys GC ke through clear ho gayi hain.

4. simulateApplicationRunning():
   - Program 10 seconds wait karta hai, taaki GC ke pass time ho entries clean karne ka.

5. Output / Behavior:
   - First print karega map with 2 entries:
     {img1=Image 1, img2=Image 2}
   - `System.gc();` ke baad, agar GC chal gaya aur keys collect kar li gayi,
     to map empty ho sakta hai:
     Cache after running (some entries may be cleared): {}

6. Important Point:
   - Agar keys "new String()" ke bajaye directly string literal hote,
     to woh String pool me rehte aur GC unhe clean nahi karta.
   - Is case me WeakHashMap entries delete nahi hoti.

7. Quick Recap:
✔ WeakHashMap me keys weak reference hoti hain.
✔ Agar key ka strong reference nahi hai → GC usko remove kar deta hai.
✔ Auto cleanup useful for caching scenarios.
✔ Normal HashMap me aisa nahi hota (keys strong reference hoti hain).


•	WeakHashMap<String, Image> imageCache = new WeakHashMap<>();
→ Ek weak hash map banaya jisme keys String (weakly referenced) aur values Image hain.

•	loadCache(imageCache);
→ Method me do String banaye gaye new String("img1") aur new String("img2").
→ Important: Ye new String objects hain, String pool wale nahi.
→ Inhe keys ke roop me daala gaya map ke andar.

•	System.out.println(imageCache);
→ Abhi tak dono entries dikhengi (img1 → Image1, img2 → Image2).

•	System.gc();
→ GC ko trigger karte hain (suggestion hai, guarantee nahi).
Agar GC chal gaya aur dekha ki "img1" aur "img2" ka koi aur strong reference nahi hai, toh woh keys ko hata dega.

•	simulateApplicationRunning();
→ Thoda wait karte hain 10 seconds taaki GC ka time mile.

•	System.out.println("Cache after running... " + imageCache);
→ Agar GC ne keys collect kar liye, toh map empty ya partially empty ho jayega.
*/
