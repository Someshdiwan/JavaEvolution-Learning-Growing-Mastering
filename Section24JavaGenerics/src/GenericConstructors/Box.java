package GenericConstructors;

public class Box<T extends Number> {
    private T value;

    public Box(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value  = value;
    }
}

/*
1. Generic Class with Constructor:
   - Class `Box<T extends Number>` ek bounded generic class hai.
   - Yaha `T` sirf `Number` class ya uske subclasses (Integer, Float, Double, Long, etc.) hi ho sakte hain.
   - Ab constructor me `Box(T value)` banaya gaya hai jo object create karte waqt initial value set karega.

2. Example Usage:
   Box<Integer> intBox = new Box<>(10);   //Allowed
   Box<Double> doubleBox = new Box<>(20.5); //Allowed
   Box<String> strBox = new Box<>("Hello"); //Error (String is not a Number)

3. Methods:
   - `getValue()` → box ke andar jo value hai usko return karta hai.
   - `setValue(T value)` → box ke andar naya value set karne deta hai.

4. Benefits of Bounded Generics with Constructor:
   - Type safety → sirf numeric types hi box me store honge.
   - Compile-time error detection → agar galat type pass karoge (jaise String) toh compiler turant error dega.
   - Code reusability → ek hi class alag-alag numeric types (Integer, Float, Double) ke liye use ho sakti hai.

5. Why Constructor is Important?
   - Jab a tum object create karte ho, turant ek value assign kar sakte ho.
   - Example:
       Box<Integer> b1 = new Box<>(100);
       System.out.println(b1.getValue()); // Output: 100

✔ `T extends Number` → Sirf numeric subclasses allowed.
✔ Constructor `Box(T value)` → initialization ke time value set karta hai.
✔ Safe, reusable aur strongly typed container ban jata hai numeric values ke liye.
*/
