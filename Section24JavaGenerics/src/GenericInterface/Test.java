package GenericInterface;

interface Printable {
    void print();
}

class MyNumber extends Number implements  Printable {
    private final int value;

    public MyNumber(int value) {
        this.value = value;
    }

    public void print() {
        System.out.println("MyNumber: "+value);
    }

    public int intValue() {
        return value;
    }

    public long longValue() {
        return value;
    }

    public float floatValue() {
        return value;
    }

    public double doubleValue() {
        return 0;
    }
}

class Box<T extends Number & Printable> {
    //First class and then Interface after the "&".
    public T item;

    public Box(T item) {
        this.item = item;
    }

    public void display() {
        item.print();
    }

    public T getItem() {
        return item;
    }
}

public class Test {
    public static void main(String[] args) {
        MyNumber myNumber = new MyNumber(12);
        Box<MyNumber> box = new Box<>(myNumber);

        box.display();
    }
}


/*
✔ Purpose:
  - `Box<T extends Number & Printable>`: T sirf aise types ho sakte hain jo
    (1) `Number` extend karte hain (numeric behavior) AND
    (2) `Printable` implement karte hain (print() method).
  - Isse compile-time pe dono guarantees milti hain: numeric methods + print capability.

✔ Order of bounds:
  - Java rule: agar a class bound ho to pehle woh class likho, phir interfaces.
    Example: `T extends Number & Printable`  // correct
    (Class first, then interfaces.)

✔ MyNumber:
  - `MyNumber` extends `Number` and implements `Printable`, isliye `Box<MyNumber>` valid hai.
  - It implements `intValue(), longValue(), floatValue(), doubleValue()` as required by `Number`.
  - Note / Warning: `doubleValue()` currently returns `0` — that looks like a bug.
    It should return the numeric value (e.g. `return value;`) to preserve correctness.

✔ Box behavior:
  - `Box` stores a `T item` and `display()` simply delegates to `item.print()`.
  - This is a neat example of combining numeric computation capability (Number) with a behavior interface (Printable).

✔ When to use this pattern:
  - Use when you need both structural guarantees: numeric operations (Number API) and a custom behavior (like print/log).
  - It keeps the API type-safe and expressive: callers know they can both treat the item as a number AND ask it to
    print itself.

Quick Recap
✔ Bounded generics allow precise compile-time constraints.
✔ Syntax: class bound first, then `&` interfaces.
✔ Implement required `Number` methods correctly (fix `doubleValue()` to return `value`).
✔ Pattern is useful for small DSLs where objects must be both numeric and behaviorful.
*/
