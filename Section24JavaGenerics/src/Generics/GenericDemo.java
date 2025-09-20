package Generics;

public class GenericDemo {
    public static void main(String[] args) {
        /*
        Object obj = new String("Hello");

        String str = (String)obj;
        */

        Object obj[]=new Object[3];
        //Capable to store any type of object.

        obj[0]="hi";
        obj[1]="bye";

        String s[]=new String[3];

        //Store only strings
        //obj[2]=new Integer(10);

        String str;

        for(int i=0;i<3;i++) {
            str=(String)obj[i];
            System.out.println(str);
        }
    }
}

/*
1. Object Array:
   - `Object obj[] = new Object[3];`
   - Ye array kisi bhi type ke objects (String, Integer, Double, etc.) ko store kar sakta hai.
   - Lekin drawback → jab tumhe retrieve karna hai, tumhe type casting karni padti hai:
     ```java
     str = (String)obj[i];
     ```
   - Agar galat type cast ho jaye → **Runtime Error (ClassCastException)** aayega.

2. Type Safety Problem:
   - Example: agar `obj[2] = new Integer(10);` likh do, toh code compile ho jaayega.
   - Lekin jab tum ise `String` me cast karoge:
     ```java
     str = (String)obj[2]; // Runtime me crash
     ```
   - Compiler isko rok nahi paata, kyunki `Object[]` me sab kuch valid hai.

3. String Array:
   - `String s[] = new String[3];`
   - Isme sirf `String` hi store ho sakta hai.
   - Agar tum `s[0] = new Integer(10);` karne ki koshish karoge, toh **Compile-time Error** aayega.
   - Matlab String array **type-safe** hai.

4. Why Generics Needed?
   - Generics ka main benefit → compile-time type safety bina casting ke.
   - Tumhe runtime errors se bachata hai, aur code clean & reusable banata hai.
   - Example with Generics:

     ArrayList<String> list = new ArrayList<>();
     list.add("Hello");
     String str = list.get(0); // No casting needed ✅

✔ `Object[]` → flexible but unsafe (runtime crash risk).
✔ `String[]` → type-safe but restricted to one type.
✔ Generics → best of both worlds → type-safe + reusable.
✔ Casting avoid hoti hai, aur compile-time me error pakad liya jaata hai.
*/
