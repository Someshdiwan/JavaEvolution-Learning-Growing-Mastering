package GenericMethods;

import static GenericMethods.Test.printArray;

public class MethodOverloading{
    public static void main(String[] args) {
        Integer[] intArray = {1,2,3,4};
        String[] stringsArray = {"Hello","World"};
        printArray(intArray);
        printArray(stringsArray);
        display(12);
        display(12.1);
    }
    public static <T> void display(T element) {
        System.out.println("Generic display: "+ element);
    }

    public static void display(Integer element) {
        System.out.println("Integer Display: "+ element);
    }
}

/*
1. Generic Methods:
   - `public static <T> void display(T element)`
   - Yaha `<T>` ek **type parameter** hai jo compile-time pe decide hota hai.
   - Matlab tum koi bhi type ka element pass kar sakte ho (Integer, Double, String, etc.).

2. Method Overloading + Generics:
   - Do methods hain:
     a) `public static <T> void display(T element)` → generic method.
     b) `public static void display(Integer element)` → specifically Integer ke liye overload.
   - Java compiler **overloading resolution** ke time pe sabse specific method choose karta hai.
     - Agar tum `display(12)` call karoge → Integer version call hoga.
     - Agar tum `display(12.1)` (Double) ya `display("Hello")` call karoge → generic version call hoga.

3. printArray Example:
   - Tumne `import static GenericMethods.Test.printArray;` kiya hai.
   - `printArray(intArray)` aur `printArray(stringsArray)` dono chal jaate hain, kyunki generic method arrays ke
      saath kaam karta hai:

     public static <T> void printArray(T[] array) {
         for(T elem : array) System.out.println(elem);
     }
     ```
   - Output me array ke elements print hote hain.

4. Example Flow (MethodOverloading.java):
   - `display(12);`  → Integer overload → "Integer Display: 12"
   - `display(12.1);` → Generic overload → "Generic display: 12.1"

5. Key Concept:
   - Overloaded methods ke beech agar ek exact match (non-generic) milta hai, toh wahi prefer hota hai.
   - Agar exact match nahi mila, toh generic method fallback hota hai.

✔ Generic methods allow type-safe reusability (`<T>`).
✔ Overloading + generics → compiler sabse specific match choose karega.
✔ Integer case → specific overload prefer hota hai.
✔ Dusre types (Double, String) → generic method use hota hai.
✔ `printArray` example → generic method arrays ke liye kaafi flexible hai.
*/
