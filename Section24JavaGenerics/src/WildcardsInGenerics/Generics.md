detailed explanation of wildcards and type parameters:
⸻

🚀 Java Generics: A Complete Guide

## 📦 Class & Interface Hierarchy

```text
                 +-----------------------------+
                 |      interface Repository<T> |
                 +-----------------------------+
                 | + save(T entity)            |
                 | + findById(int id): T       |
                 | + findAll(): List<T>        |
                 +-----------------------------+
                             ▲
                             |
             +---------------+---------------+
             |                               |
+-----------------------------+   +-----------------------------+
|       class UserRepository  |   |    class ProductRepository  |
| implements Repository<User> |   | implements Repository<Product> |
+-----------------------------+   +-----------------------------+
| + save(User user)           |   | + save(Product p)           |
| + findById(int id)          |   | + findById(int id)          |
+-----------------------------+   +-----------------------------+


                 +----------------------+
                 |       class Box<T>   |
                 +----------------------+
                 | - T item             |
                 | + getItem(): T       |
                 | + setItem(T)         |
                 +----------------------+

                 +-----------------------------------+
                 |        class UtilityMethods       |
                 +-----------------------------------+
                 | <T> void print(T item)            |
                 | <T extends Comparable<T>> T max(  |
                 |          T a, T b )               |
                 +-----------------------------------+
                 
```

📘 Legend:
•	T, K, V → type parameters (placeholders for actual types).
•	Arrows (▲) → implementation / usage of generic interface.
•	Replace T with real types like User, Product, Integer, etc.

⸻

📖 Theory: Why Java Generics?
1.	
2. Type Safety
•	Errors are caught at compile time rather than runtime.
•	Example:

List<String> names = new ArrayList<>();
names.add("Alice");
names.add(42);  // ❌ Compile-time error

	2.	Code Reuse
	•	Write once, use for many types.
	•	Same class can handle User, Product, or Integer without rewriting logic.

⸻

🏗️ Generic Classes & Interfaces

// Generic interface
public interface Repository<T> {
void save(T entity);
T findById(int id);
List<T> findAll();
}

// Implementation with concrete type
public class UserRepository implements Repository<User> {
public void save(User user) { ... }
public User findById(int id) { ... }
public List<User> findAll() { ... }
}

⸻

🎁 Generic Class Example

public class Box<T> {
private T item;

    public T getItem() { return item; }
    public void setItem(T item) { this.item = item; }
}

// Usage
Box<Integer> intBox = new Box<>();
intBox.setItem(42);

Box<String> strBox = new Box<>();
strBox.setItem("Hello");

	•	Box<Integer> → T becomes Integer
	•	Box<String> → T becomes String

⸻

🛠️ Generic Methods

public class UtilityMethods {
// Simple generic method
public static <T> void print(T item) {
System.out.println(item);
}

    // With bounded type parameter
    public static <T extends Comparable<T>> T max(T a, T b) {
        return (a.compareTo(b) > 0) ? a : b;
    }
}

// Usage
UtilityMethods.print("Generics are powerful!");
Integer bigger = UtilityMethods.max(10, 20);

	•	<T> before method return type = declares a generic type parameter.
	•	T extends Comparable<T> = T must be a type that implements Comparable.

⸻

🌀 Wildcards in Generics:

Wildcards (?) add flexibility when exact type parameters aren’t known.

1.	Unbounded Wildcard ?
List<?> items = new ArrayList<String>();
Object obj = items.get(0);   // ✅ Safe (read as Object)
items.add("Hello");          // ❌ Not allowed (unknown type)

Use when you only need to read.

	2.	Upper-Bounded Wildcard ? extends Type

List<? extends Number> nums = new ArrayList<Integer>();
Number n = nums.get(0);   // ✅ Safe
nums.add(3.14);           // ❌ Not allowed

Use when you consume data (read as parent type).

	3.	Lower-Bounded Wildcard ? super Type

List<? super Integer> ints = new ArrayList<Number>();
ints.add(42);            // ✅ Safe (Integer is allowed)
Object obj = ints.get(0); // ✅ But only read as Object

Use when you produce data (add elements safely).

⸻

🧩 Quick Comparisons:
•	List<?> → unknown type, read-only.
•	List<? extends Number> → safe to read as Number, not safe to add.
•	List<? super Integer> → safe to add Integer, not safe to read as Integer.

⸻

🌐 Big Picture

Generics in Java are like templates: they allow one blueprint to generate many type-safe variants of classes, 
interfaces, and methods. 

They shine most in frameworks (Spring, Hibernate, Collections API) where flexibility meets type safety.
