class OldClass {
    public void display() {
        System.out.println("Hello");
    }

    @Deprecated
    public void show() {
        System.out.println("Hi");
    }
}

public class Annotations {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        OldClass o=new OldClass();
        o.show(); //Deprecated Method
    }
}

/*
1. @Deprecated
   - Jab kisi method/class ko future me use na karne ki recommendation hoti hai
     to usse @Deprecated mark karte hain.
   - Compiler warning deta hai ki ye method "old" hai aur avoid karna chahiye.
   - Example: o.show() ek deprecated method hai.

2. @SuppressWarnings("deprecation")
   - Jab tum intentionally deprecated method ko use karna chahte ho
     aur warning avoid karni hai, to ye annotation use karte ho.
   - Sirf warning suppress hoti hai, code chalna continue karega.

3. Is example me:
   - `OldClass` ke andar `show()` ko deprecated mark kiya gaya.
   - `main()` me use call kiya gaya, but warning suppress karne ke liye
     @SuppressWarnings("deprecation") lagaya gaya.

4. Use Case:
   - Jab purane APIs ya libraries use kar rahe ho lekin abhi migrate nahi kar pa rahe,
     to warnings avoid karne ke liye ye annotation lagate ho.
*/
