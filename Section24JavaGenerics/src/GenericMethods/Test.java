package GenericMethods;

public class Test {
    public static void main(String[] args) {
        /*
        Test test = new Test();
        Integer[] intArray = {1,2,3,4};
        String[] stringsArray = {"Hello","World"};
        test.printArray(intArray);
        test.printArray(stringsArray);
        */

        Integer[] intArray = {1,2,3,4};
        String[] stringsArray = {"Hello","World"};
        printArray(intArray);
        printArray(stringsArray);
    }
    public static <T> void printArray(T[] array) {
        //method body.
        for (T element : array) {
            System.out.println(element + " ");
        }
        System.out.println();
    }
}

/*
1. Generic Method Definition:
   - `public static <T> void printArray(T[] array)`
   - Yaha `<T>` ek **type parameter** hai jo batata hai ki method generic hai.
   - Matlab tum kisi bhi type ka array pass kar sakte ho (Integer[], String[], Double[], etc.).

2. Usage:
   - `printArray(intArray);` → Integer[] ke liye kaam karega.
   - `printArray(stringsArray);` → String[] ke liye kaam karega.
   - Compiler automatically T = Integer ya T = String decide karega (type inference).

3. for-each Loop:
   - `for (T element : array)`
   - Har element ko loop me print karta hai, bina is baat ki tension liye ki array kis type ka hai.

4. Output Example:
   - Agar `intArray = {1,2,3,4}` hai → output hoga:
     ```
     1
     2
     3
     4
     ```
   - Agar `stringsArray = {"Hello","World"}` hai → output hoga:
     ```
     Hello
     World
     ```

5. Why Generic Method instead of Overloading?
   - Agar tumne alag methods banaye hote:
     ```java
     void printArray(Integer[] arr) {...}
     void printArray(String[] arr) {...}
     ```
     toh har type ke liye duplicate code likhna padta.
   - Generic method ek hi jagah reusable code deta hai, type-safe bhi hai.


✔ `<T>` → method ko generic banata hai.
✔ Compiler call ke time pe type decide karta hai.
✔ Same method Integer[], String[], Double[] arrays ke liye reuse hota hai.
✔ Clean, reusable aur type-safe solution bina overloading ke.
*/
