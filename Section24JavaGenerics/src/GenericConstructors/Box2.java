package GenericConstructors;

public class Box2 {
    private Number value;

    // Generic constructor
    public <T extends Number> Box2(T value) {
        this.value = value;
    }

    public Number getValue() {
        return value;
    }

    public static void main(String[] args) {
        Box2 boxInt = new Box2(2);        //Integer
        Box2 boxDouble = new Box2(3.14);  //Double

        System.out.println("Box2 int: " + boxInt.getValue());
        System.out.println("Box2 double: " + boxDouble.getValue());
    }
}

/*
1. Non-Generic Class + Generic Constructor:
   - Class `Box2` khud generic nahi hai (iska type parameter <T> nahi hai).
   - Lekin isme ek **generic constructor** banaya gaya hai:
        public <T extends Number> Box2(T value)
   - Matlab: constructor ko call karte waqt tum koi bhi `Number` subclass (Integer, Double, Float, Long, etc.)
     pass kar sakte ho.

2. Working:
   - new Box2(2);       // Integer (autoboxed to Number)
   - new Box2(3.14);    // Double
   - Constructor accept karta hai dono, kyunki dono `Number` ke subclasses hain.
   - Internally `this.value` me as a `Number` store hota hai.

3. Difference from Generic Class:
   - Agar class generic hoti (`class Box<T extends Number>`), toh value specific type me store hoti.
   - Yaha class non-generic hai, isliye har value ko `Number` type me store kiya jaata hai.

4. Advantage:
   - Reusability → ek hi class ka constructor alag-alag numeric types accept kar leta hai.
   - Compile-time safety → sirf `Number` subclasses hi pass kar sakte ho.
   - Flexibility → bina class ko generic banaye, tum generic behavior pa lete ho.

✔ Class non-generic hai, lekin constructor generic hai.
✔ `<T extends Number>` ensure karta hai ki sirf numeric types pass ho.
✔ Internally `Number` type ke variable me store hota hai.
✔ Useful jab tumhe sirf `Number` values store karni ho, lekin flexibility maintains karni ho.
*/
