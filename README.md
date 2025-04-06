![Daily Java Codes](Others/banner.svg)

Working will be updated soon.

Preview And Testing Readme.

```markdown
# Java Repository Documentation

This repository contains detailed documentation and examples covering a wide range of Java topics—from basic variable scope and access modifiers to advanced topics like multithreading and generics. This guide serves as a reference for understanding core Java concepts, design patterns, and useful programming tricks.

## Table of Contents 
- [Scope of Variables](#scope-of-variables)
- [Access Modifiers and Visibility](#access-modifiers-and-visibility)
- [Bitwise Operations](#bitwise-operations)
  - [Width vs. Possible Values](#width-vs-possible-values)
  - [Numerical Primitives](#numerical-primitives)
  - [Operators](#operators)
  - [Useful Tricks](#useful-tricks)
- [Exceptions](#exceptions)
- [Polymorphism](#polymorphism)
  - [Static Polymorphism](#static-polymorphism)
  - [Dynamic Polymorphism](#dynamic-polymorphism)
  - [Overriding Methods](#method-overriding)
- [Static vs Dynamic Binding](#static-vs-dynamic-binding)
- [Interfaces](#interfaces)
  - [Tagging Interfaces](#tagging-interfaces)
- [Nested Classes](#nested-classes)
- [Generics](#java-generics)
- [Serialization](#serialization)
- [Multithreading](#multithreading)
  - [Thread Synchronization](#thread-synchronization)
  - [Inter-thread Communication](#inter-thread-communication)
- [Java Collections Framework](#java-collections-framework)
  - [Overview](#overview)
  - [Maps](#maps)
  - [ArrayList vs. Vector](#arraylist-vs-vector)
- [Common Design Patterns](#common-design-patterns)
  - [Singleton Class](#singleton-class)
- [`Number` Wrapper Classes](#number-wrapper-classes)
- [Cloning Arrays](#cloning-arrays)
- [Other Useful Keywords](#other-useful-keywords)
  - [`final`](#final-keyword)
  - [`abstract`](#abstract-keyword)
  - [`synchronized`](#synchronized-keyword)
  - [`transient`](#transient-keyword)
  - [`throws`](#throws-keyword)
  - [`volatile`](#volatile-keyword)

---

## Scope of Variables

| **Local** | **Instance** | **Class/Static**  |
|-----------|--------------|-------------------|
| Declared in methods, constructors, or blocks | Declared in a class, but outside a method/block | Same as instance, but with `static` keyword |
| Created when block is entered, destroyed upon block exit | Created when an object is instantiated using `new` | Created when the program starts, destroyed when the program ends |
| No access modifiers | Access modifiers allowed; visible to all methods & constructors in the class | Access modifiers allowed; visible to all methods & constructors in the class |
| No default values | Have default values | Have default values |

[▲ TOP](#table-of-contents)

---

## Access Modifiers and Visibility

|              | **Public** | **Protected** | **Default** | **Private** |
|--------------|:----------:|:-------------:|:-----------:|:-----------:|
| Same Class                   | Y | Y | Y | Y |
| Same Package Subclass        | Y | Y | Y | N |
| Same Package Non-subclass    | Y | Y | Y | N |
| Different Package Subclass   | Y | Y | N | N |
| Different Package Non-subclass | Y | N | N | N |

- **Notes:**
  - Top-level classes and interfaces cannot be `private` or `protected`.
  - Methods declared `public` in a superclass must be `public` in subclasses.
  - Methods declared `protected` in a superclass can be `public` or `protected` in subclasses.
  - Private methods are not inherited.

[▲ TOP](#table-of-contents)

---

## Bitwise Operations

### Width vs. Possible Values
The number of bits used (width) determines the range of numbers:
- **Unsigned:** 0 through 2^n - 1
- **2's Complement:** -2^(n-1) through 2^(n-1) - 1

### Numerical Primitives
- **byte:** 8 bits (e.g., -128 to 127)
- **short:** 16 bits
- **char:** *unsigned* 16 bits
- **int:** 32 bits
- **long:** 64 bits

### Operators

Assuming:
- `a = 60` (binary: `0011 1100`)
- `b = 13` (binary: `0000 1101`)
- `c = -2` (binary: `1111 1110` in 2's complement)

| Operation | Function                                   | Example                                         |
|:---------:|--------------------------------------------|-------------------------------------------------|
| `&`       | AND                                        | `a & b` = `0000 1100` (12)                        |
| `\|`      | OR                                         | `a \| b` = `0011 1101` (61)                       |
| `^`       | XOR                                        | `a ^ b` = `0011 0001` (49)                        |
| `~`       | Complement (bitwise inversion)             | `~a` = `1100 0011` (-61 in 2's complement)        |
| `<<`      | Left shift                                 | `a << 2` = `1111 0000` (-16 in 2's complement)    |
| `>>`      | Arithmetic shift right                     | `c >> 2` = `1111 1111` (-1)                       |
| `>>>`     | Logical shift right (zero-fill)            | `c >>> 2` = `0111 1111` (127)                     |

### Useful Tricks
- **XOR Properties:**
  - `x ^ 0 = x`
  - `x ^ 1 = ~x`
  - For an integer `n`, `n ^ -1 = ~n` (since -1 is all 1s in 2's complement)
  - `x ^ x = 0`
- **AND Properties:**
  - `x & 0 = 0`
  - `x & 1 = x`
  - For an integer `n`, `n & -1 = n`
  - `x & x = x`
- **OR Properties:**
  - `x \| 0 = x`
  - `x \| 1 = 1`
  - `x \| x = x`
- **Swapping without Temporary Variable:**
  ```java
  // Example: a = 2 (0b0010), b = 5 (0b0101)
  a = a ^ b; // a becomes 7 (0b0111)
  b = a ^ b; // b becomes 2 (0b0010)
  a = a ^ b; // a becomes 5 (0b0101)
  ```

[▲ TOP](#table-of-contents)

---

## Exceptions

Java exceptions can be categorized into three types:
1. **Checked Exceptions:** Reported by the compiler at compile time.
2. **Unchecked Exceptions:** Runtime exceptions.
3. **Errors:** Serious issues that arise beyond the control of the application (e.g., stack overflow).

### Exception Hierarchy
Two diagrams below illustrate the Java exception hierarchy:

![Java Exceptions Hierarchy](http://cdncontribute.geeksforgeeks.org/wp-content/uploads/Exception-in-java1.png "Java Exceptions Hierarchy")

![Java Exceptions Hierarchy](http://www.benchresources.net/wp-content/uploads/2017/02/exception-hierarchy-in-java.png "Java Exceptions Hierarchy")

### try-with-resources
Automatically closes resources when done:

try (FileReader fr = new FileReader(filepath)) {
    // Use the resource
} catch (Exception e) {
    // Handle exception
}
```

### User-defined Exceptions
- Must extend `Throwable`
    - For checked exceptions, extend `Exception`
    - For unchecked exceptions, extend `RuntimeException`

[▲ TOP](#table-of-contents)

---

## Polymorphism

Polymorphism allows objects to be treated as instances of their parent class or interface. Every Java object is polymorphic since all objects are instances of `Object`.

- **Reference Variables:** A reference variable can refer to any object of its declared type or any subtype.
- **Method Resolution:** The type of the reference variable determines which methods can be invoked.

### Static Polymorphism
Also known as compile-time polymorphism; achieved via method overloading:

int add(int a, int b) {
    return a + b;
}

int add(int a, int b, int c) {
    return a + b + c;
}

// Usage:
int x = add(1, 2);    // x = 3
int y = add(1, 2, 3); // y = 6
```

### Dynamic Polymorphism
Also known as runtime polymorphism; achieved via method overriding:

class Parent {
    public void myMethod() {
        System.out.println("I am the parent");
    }
}

class Child extends Parent {
    public void myMethod() {
        System.out.println("I am the child");
    }

    public static void main(String[] args) {
        Parent p = new Child();
        Child c = new Child();
        p.myMethod(); // Outputs: I am the child
        c.myMethod(); // Outputs: I am the child
    }
}
```

### Method Overriding
Rules:
- Same argument list.
- Same or covariant return type.
- The access level cannot be more restrictive.
- Only inherited instance methods can be overridden.
- `final` methods cannot be overridden.
- `static` methods can be redeclared but not overridden.
- Constructors cannot be overridden.

[▲ TOP](#table-of-contents)

---

## Static vs Dynamic Binding

Binding is the association of a method call with the method body.

1. **Static Binding (Early Binding):** Resolved at compile time (e.g., for `static`, `private`, and `final` methods).
2. **Dynamic Binding (Late Binding):** Resolved at runtime, which is used for overridden methods.

**Example of static binding with static methods:**

class Human {
    public static void walk() {
        System.out.println("Human walks");
    }
}
class Boy extends Human {
    public static void walk(){
        System.out.println("Boy walks");
    }

    public static void main(String[] args) {
        Human b = new Boy();    // Reference type: Human, object type: Boy
        Human h = new Human();  // Both reference and object are Human
        b.walk();  // Calls Human.walk() due to static binding
        h.walk();  // Calls Human.walk()
    }
}
```

**Example of dynamic binding with instance methods:**
```java
class Human {
    public void walk() {
        System.out.println("Human walks");
    }
}
class Boy extends Human {
    public void walk(){
        System.out.println("Boy walks");
    }

    public static void main(String[] args) {
        Human b = new Boy();    // Reference type: Human, object type: Boy
        Human h = new Human();
        b.walk();  // Calls Boy.walk() via dynamic binding
        h.walk();  // Calls Human.walk()
    }
}
```

[▲ TOP](#table-of-contents)

---

## Interfaces

Interfaces define a contract for classes to implement. They can include abstract methods, default methods, static methods, constants, and nested types.

- **Characteristics:**
    - Cannot be instantiated.
    - Do not have constructors.
    - Methods are implicitly abstract (unless default or static).
    - Only constant variables (`static final`) are allowed.
    - A class can implement multiple interfaces, but cannot extend multiple classes.

### Tagging Interfaces
A tagging interface is an interface with no methods. It is used to mark a class with a particular property or capability. For example, `java.util.EventListener` is a tagging interface for event-listener classes.

[▲ TOP](#table-of-contents)

---

## Nested Classes

Nested classes allow you to logically group classes that are only used in one place. They come in various forms:
```
                              Nested classes
                                    |
                   ___________________________________
                  |                                   |
            Inner classes                    Static nested classes
    ________________________                   
   |                        |                  
Method-local inner classes  Anonymous inner classes
```
- **Note:** Java does not support multiple inheritance (a class cannot extend more than one class). However, a class can implement multiple interfaces.

[▲ TOP](#table-of-contents)

---

## Java Generics

Generics enable types (classes and methods) to operate on objects of various types while providing compile-time type safety.

**Example – Generic Method:**

public static <E> void printArray(E[] array) {
    for (E element : array)
        System.out.print(element + " ");
}
```
Usage:

Integer[] intArr = {1, 2, 3};
Double[] doubleArr = {1.1, 2.2, 3.3};

printArray(intArr);
printArray(doubleArr);
```

**Bounded Type Parameter:**

public static <T extends Comparable<T>> T max(T x, T y) {
    return x.compareTo(y) > 0 ? x : y;
}
```

**Generic Class Example:**

public class Box<T> {
    private T t;
    public void set(T t) { this.t = t; }
    public T get() { return t; }
}
```

[▲ TOP](#table-of-contents)

---

## Serialization

Serialization converts an object into a sequence of bytes, which can be stored or transmitted and later deserialized to reconstruct the object.

**Requirements:**
1. The class must implement `java.io.Serializable`.
2. All fields must be serializable (or marked as `transient`).

**Serialization Example:**

try {
    FileOutputStream fileOut = new FileOutputStream("/tmp/employee.ser");
    ObjectOutputStream out = new ObjectOutputStream(fileOut);
    out.writeObject(employee); // 'employee' is an instance of Employee
    out.close();
    fileOut.close();
} catch (IOException i) {
    i.printStackTrace();
}
```

**Deserialization Example:**

Employee employee = null;
try {
    FileInputStream fileIn = new FileInputStream("/tmp/employee.ser");
    ObjectInputStream in = new ObjectInputStream(fileIn);
    employee = (Employee) in.readObject();
    in.close();
    fileIn.close();
} catch (IOException i) {
    i.printStackTrace();
} catch (ClassNotFoundException c) {
    c.printStackTrace();
}
```

[▲ TOP](#table-of-contents)

---

## Multithreading

Multithreading allows multiple threads to run concurrently, providing better performance for concurrent tasks.

**Thread Lifecycle:**
- **New:** Thread is created.
- **Runnable:** Thread is executing.
- **Waiting:** Thread is waiting for another thread's action.
- **Timed Waiting:** Thread waits for a specified time.
- **Terminated:** Thread has finished execution.

Threads can be created in two ways:
1. **Implementing the `Runnable` interface:**
    - Implement the `run()` method.
    - Create a `Thread` object and pass the Runnable.
    - Start the thread using `start()`.
2. **Extending the `Thread` class:**
    - Override the `run()` method.
    - Instantiate the subclass and call `start()`.

### Thread Synchronization
To prevent concurrent access issues (e.g., multiple threads writing to the same file), use synchronization:

synchronized (object) {
    // Code that accesses shared resource
}
```

### Inter-thread Communication
Threads can communicate using:
- `wait()`
- `notify()`
- `notifyAll()`

*These methods must be called from within a synchronized context.*

#### Thread Deadlock
Deadlock occurs when threads are waiting for each other indefinitely. Avoid by careful lock ordering.

[▲ TOP](#table-of-contents)

---

## Java Collections Framework

### Overview
The Java Collections Framework provides a set of classes and interfaces for storing and manipulating groups of objects. It includes lists, sets, maps, and more.

![Java Collections Framework](https://media.geeksforgeeks.org/wp-content/uploads/java-collection.jpg "Java Collections Framework")

### Maps
Common map implementations:
- **HashMap:** No guaranteed order.
- **TreeMap:** Sorted according to natural order or a custom comparator.
- **LinkedHashMap:** Maintains insertion order.
- **Hashtable:** Legacy class (use `ConcurrentHashMap` for thread-safe operations).

![Map Overview](https://www.programcreek.com/wp-content/uploads/2009/02/MapClassHierarchy-600x354.jpg "Map Overview")

### ArrayList vs. Vector
- **Synchronization:** `Vector` is synchronized; `ArrayList` is not.
- **Performance:** `ArrayList` is generally faster.
- **Growth:** `ArrayList` increases size by 50%, while `Vector` doubles its size.
- **Traversal:** `Vector` supports both `Enumeration` and `Iterator`; `ArrayList` supports `Iterator`.

[▲ TOP](#table-of-contents)

---

## Common Design Patterns

### Singleton Class
The Singleton pattern restricts a class to a single instance. It is useful for managing shared resources like database connections.

**Example:**
```java
public class Singleton {
    private static Singleton instance = new Singleton();

    private Singleton() { }

    public static Singleton getInstance() {
        return instance;
    }

    public void demoMethod() {
        System.out.println("Demo method");
    }
}
```
Usage:
```java
Singleton singleton = Singleton.getInstance();
singleton.demoMethod();
```

**Further Reading:**
- [Singletons in Java - Baeldung](https://www.baeldung.com/java-singleton)
- [Double-Checked Locking with Singleton](https://www.baeldung.com/java-singleton-double-checked-locking)
- [Java Singleton Design Pattern Best Practices with Examples](https://www.journaldev.com/1377/java-singleton-design-pattern-best-practices-examples)

[▲ TOP](#table-of-contents)

---

## `Number` Wrapper Classes

The `Number` class is the superclass for numeric wrapper classes:
```
                   Number
                     |
  ___________________|_________________
 |       |       |       |      |      |
Byte  Integer  Double  Short  Float  Long
```
- **Boxing:** Converting a primitive to its corresponding object.
- **Unboxing:** Converting an object to its corresponding primitive.

[▲ TOP](#table-of-contents)

---

## Cloning Arrays

Two common methods for array cloning:
- **Using `System.arraycopy()`:**
  ```java
  int[] dest = new int[orig.length];
  System.arraycopy(orig, 0, dest, 0, orig.length);
  ```
- **Using `clone()`:**
  ```java
  int[] dest = orig.clone();
  ```
`clone()` is compact and easier to read, especially for larger datasets.

[▲ TOP](#table-of-contents)

---

## Other Useful Keywords

### `final` Keyword
- **Variables:** Can be assigned only once.
- **Methods:** Cannot be overridden.
- **Classes:** Cannot be subclassed.

### `abstract` Keyword
- **Methods:** No implementation; must be implemented by subclasses.
- **Classes:** Cannot be instantiated; may contain both abstract and concrete methods.

### `synchronized` Keyword
Indicates that a method or block can only be executed by one thread at a time.

### `transient` Keyword
Marks a variable to be skipped during serialization.

### `throws` Keyword
Indicates that a method may throw a checked exception.
```java
public void deposit(double amount) throws RemoteException {
    // Method implementation...
    throw new RemoteException();
}
```

### `volatile` Keyword
Ensures that changes to a variable are immediately visible to other threads by forcing reads/writes from/to main memory.

[▲ TOP](#table-of-contents)