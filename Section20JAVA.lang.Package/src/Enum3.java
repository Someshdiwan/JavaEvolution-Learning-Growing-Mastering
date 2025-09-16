enum Color {
    RED,
    GREEN,
    BLUE;
}

public class Enum3 {
    public static void main(String[] args) {
        Color c1 = Color.RED;
        System.out.println(c1);
    }
}

// enum declaration inside a class.
class Enum4 extends Enum3 {
    enum Color {
        RED,
        GREEN,
        BLUE;
    }
    public static void main(String[] args) {
        Color c1 = Color.RED;
        System.out.println(c1);
    }
}

/*
Enum declaration rules:
1. Enum ko class ke bahar ya class ke andar declare kar sakte ho.
2. Lekin enum ko method ke andar declare nahi kar sakte.
3. enum keyword use karte ho (class keyword ki jagah).

1. Enum bahar bhi declare kar sakte ho (global scope)
   → "enum Color { ... }" outside any class.

2. Enum class ke andar bhi declare kar sakte ho
   → "class Enum4 { enum Color { ... } }"

3. Enum method ke andar declare.(not allowed).

4. Enum constants by default public, static, final hote hain.
   Isliye direct access: Color.RED

5. Best practice:
   - Enum names → singular (Color not Colors).
   - Constants → UPPERCASE (RED, GREEN, BLUE).

Enum declaration can be done outside a class or inside a class but not inside a method.
A simple enum example where enum is declared outside any class (Note enum keyword instead of class keyword).
*/
