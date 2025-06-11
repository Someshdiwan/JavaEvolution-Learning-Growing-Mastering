````
               +------------------------+
               |  interface Repository<T> |
               +------------------------+
               | + save(T entity)       |
               | + findById(int id): T  |
               | + findAll(): List<T>   |
               +------------------------+
                          ▲
                          |
         +----------------+----------------+
         |                                 |
+------------------------+     +------------------------+
|  class UserRepository   |     | class ProductRepository |
|  implements Repository<User> | implements Repository<Product> |
+------------------------+     +------------------------+
| + save(User user)      |     | + save(Product p)       |
| + findById(int id)     |     | + findById(int id)      |
+------------------------+     +------------------------+

                   +-------------------+
                   |   class Box<T>     |
                   +-------------------+
                   | - T item          |
                   | + getItem(): T    |
                   | + setItem(T)      |
                   +-------------------+

                   +----------------------------+
                   | class UtilityMethods       |
                   +----------------------------+
                   | <T> void print(T item)     |
                   | <T extends Comparable<T>>  |
                   |   T max(T a, T b)          |
                   +----------------------------+

📘 Legend
- `T`, `K`, `V` are **type parameters**
- Arrows (▲) show **implementation or use of generic interfaces**
- Replace `T` with specific types like `User`, `Product`, `Integer`, etc.


````

## 📖 Theory: Understanding Java Generics

1. **Why Generics?**
    - **Type Safety**: Catch mismatched types at compile time rather than at runtime.
    - **Code Reuse**: Write one class or method that works with any object type.

2. **Generic Classes & Interfaces**
   ```java
   public interface Repository<T> {
       void save(T entity);
       T findById(int id);
       List<T> findAll();
   }


Wildcards (?)

Unbounded: List<?> — you can read items as Object, but cannot add anything (except null).

Upper-bounded: List<? extends Number> — you can read items as Number, but cannot add.

Lower-bounded: List<? super Integer> — you can add Integer (or subclass), but reads return Object.