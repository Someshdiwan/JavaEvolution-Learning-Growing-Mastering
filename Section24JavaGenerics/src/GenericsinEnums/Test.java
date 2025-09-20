package GenericsinEnums;

enum Operation {
    ADD, SUBTRACT, MULTIPLY, DIVIDE;

    public <T extends Number> double apply(T a, T b) {
        switch (this) {
            case ADD:
                return a.doubleValue() + b.doubleValue();
            case SUBTRACT:
                return a.doubleValue() - b.doubleValue();
            case MULTIPLY:
                return a.doubleValue() * b.doubleValue();
            case DIVIDE:
                return a.doubleValue() / b.doubleValue();
            default:
                throw new AssertionError("Unknown operation: " + this);
        }
    }
}

public class Test {
    public static void main(String[] args) {
        double result1 = Operation.ADD.apply(10, 20);
        double result2 = Operation.MULTIPLY.apply(5.5, 4);
        System.out.println(result1);
        System.out.println(result2);
    }
}

/*
1. Enum with Methods:
   - `enum Operation { ADD, SUBTRACT, MULTIPLY, DIVIDE; }`
   - Normally enum sirf constants rakhta hai, but yaha enum ke andar ek `apply()` method bhi likha gaya hai.
   - Matlab har ek enum constant (`ADD`, `SUBTRACT`, etc.) ek operation ko represent karta hai.

2. Generics with Enum:
   - `public <T extends Number> double apply(T a, T b)`
   - Ye method Generic hai → sirf `Number` class ya uske subclasses (`Integer`, `Double`, `Float`...) hi valid hain.
   - `a.doubleValue()` aur `b.doubleValue()` use karke unhe double me convert kar diya gaya hai.
   - Isse har numeric type ko safely handle kiya ja sakta hai.

3. Switch with `this`:
   - `switch (this)` ka matlab hai → jis enum constant pe call kiya gaya hai usko check karo.
   - Example:
     - Agar `Operation.ADD.apply(10, 20)` call hua, toh `case ADD:` execute hoga.
     - Agar `Operation.MULTIPLY.apply(5.5, 4)` call hua, toh multiply logic chalega.

4. Benefits:
   - Reusable: Tum same method `apply()` use karke add, subtract, multiply, divide kar sakte ho.
   - Type-safe: Sirf numbers hi accept karega, aur runtime me `ClassCastException` ka risk nahi hoga.
   - Clean code: Har operation ke liye alag `if-else` likhne ki zaroorat nahi.

5. Example Run:
   ```java
   double result1 = Operation.ADD.apply(10, 20); // 30.0
   double result2 = Operation.MULTIPLY.apply(5.5, 4); // 22.0

✔ Enum = fixed constants ka set (ADD, SUBTRACT, MULTIPLY, DIVIDE).
✔ Generic apply() = sirf Number types (Integer, Double, Float...) ke saath kaam karta hai.
✔ this in switch = current enum constant ke hisaab se operation select hota hai.
✔ Implementation ek simple calculator jaisa hai → clean, extensible aur type-safe.
*/
