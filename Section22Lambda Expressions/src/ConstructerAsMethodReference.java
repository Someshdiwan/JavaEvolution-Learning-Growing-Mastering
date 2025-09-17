interface MyConstructor {
    public void display(String str);
    //You can assign the more than one Parameters.
}

public class ConstructerAsMethodReference {
    public ConstructerAsMethodReference(String s) {
        System.out.println(s.toUpperCase());
    }

    public static void main(String[] args) {
        MyConstructor m1=ConstructerAsMethodReference::new;
        //Constructor new along with the class name
        m1.display("print the upper case letters");
    }
}

/*
1. Functional Interface:
   - `MyConstructor` ek functional interface hai (sirf ek abstract method: display).
   - Iska purpose hai ki us method ko kisi method reference / lambda se map kara sake.

2. Constructor Reference Syntax:
   - `ClassName::new`
   - Ye ek special type ka method reference hai jo constructor ko call karta hai.
   - Yahan `ConstructerAsMethodReference::new` ka matlab hai:
     -> Jab bhi `display(String s)` call hoga, ek naya object banega
     -> Aur us object ke constructor me wahi string pass ho jaayegi.

3. Flow in this program:
   - `MyConstructor m1 = ConstructerAsMethodReference::new;`
   - Matlab: "display(String)" ko map kar diya hai `ConstructerAsMethodReference(String s)` constructor pe.
   - Jab `m1.display("print the upper case letters");` call hota hai:
       → Constructor call hoga
       → String ko uppercase me convert karke print karega

4. Output:
   PRINT THE UPPER CASE LETTERS

5. Key Point:
   - Method references sirf tabhi work karte hain jab functional interface ka method signature
     constructor/method ke signature ke saath compatible ho.
   - Yahan `display(String)` perfectly match hota hai constructor `ConstructerAsMethodReference(String)` se.

- Constructor references ko functional programming ke saath use karke object creation ko simplify kar sakte ho.
- Example: Streams me mapping:
  list.stream().map(ConstructerAsMethodReference::new).collect(Collectors.toList());
  (Har element ke liye ek naya object ban jayega.)
*/
