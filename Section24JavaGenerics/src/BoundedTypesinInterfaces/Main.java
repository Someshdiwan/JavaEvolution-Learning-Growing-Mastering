package BoundedTypesinInterfaces;

public class Main {
    public static void main(String[] args) {
        Box<Integer> box = new Box<>();
        //Bounded type parameter laga deya hai.

        //Box<String> box = new Box<String>();
        //remove comment and check error.
    }
}

/*
1. Generic Class `Box<T extends Number>`:
   - Yaha `T` ek **bounded type parameter** hai.
   - Matlab `T` sirf `Number` class ya uske subclasses (Integer, Double, Float, Long, etc.) hi ho sakte hain.
   - Example: `Box<Integer>`, `Box<Double>` valid hai.
   - Example: `Box<String>` error dega, kyunki String Number ka subclass nahi hai.

2. Why Bound Generics?
   - Jab tumhe generics ke andar sirf specific type hierarchy allow karni ho.
   - Example: Agar tumhe mathematical calculations karni hain → toh sirf `Number` aur uske subclasses ka support chahiye.

3. getValue() / setValue():
   - `getValue()` → box ke andar ka value return karta hai.
   - `setValue(T value)` → box ke andar ek naya value set karne deta hai.
   - Type safety maintain hoti hai, kyunki `T` fixed hai (Integer, Double etc.).

4. Main Class:
   - `Box<Integer> box = new Box<>();` → sahi hai (Integer extends Number).
   - Agar `Box<String>` try karoge toh compile-time error aayega.
     - Error: "Type parameter String is not within its bound".

✔ `T extends Number` → bounded generics, sirf Number aur uske subclasses allowed.
✔ Compile-time safety: galat type (jaise String) detect ho jaati hai.
✔ Useful jab tumhe generics me type restriction enforce karna ho.
*/
