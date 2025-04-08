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
- [Number Wrapper Classes](#number-wrapper-classes)
- [Cloning Arrays](#cloning-arrays)
- [Other Useful Keywords](#other-useful-keywords)
  - [`final`](#final-keyword)
  - [`abstract`](#abstract-keyword)
  - [`synchronized`](#synchronized-keyword)
  - [`transient`](#transient-keyword)
  - [`throws`](#throws-keyword)
  - [`volatile`](#volatile-keyword)
---
<sup><sub>[▲ TOP](#table-of-contents)</sub></sup>


## Scope of Variables

* detailed comparison of local, instance, and class (static) variables.
* context regarding memory allocation, lifecycle, and usage.

---

| **Characteristic**       | **Local Variables** | **Instance Variables** | **Class (Static) Variables**           |
|--------------------------|---------------------|------------------------|----------------------------------------|
| **Declaration**          | Within methods, constructors, or blocks | Inside a class, but outside any method or block | Inside a class with the `static` keyword |
| **Scope**                | Limited to the block or method where declared | Tied to the specific object; accessible to all instance methods of that object | Tied to the class itself; accessible by all static and instance methods in the class |
| **Lifetime**             | Created when the block/method is entered and destroyed on exit | Created when an object is instantiated (via `new`) and lasts as long as the object exists | Initialized when the program loads and destroyed when the program terminates |
| **Memory Allocation**    | Typically allocated on the stack | Allocated on the heap as part of each object instance | Allocated in the static memory area (or method area) |
| **Access Modifiers**     | Cannot be specified (local variables have no access modifiers) | Can have access modifiers like `private`, `protected`, or `public` | Can have access modifiers and behave similarly to instance variables regarding access control |
| **Default Initialization** | No implicit default; must be explicitly initialized before use | Automatically assigned default values (e.g., numeric types default to 0, booleans to `false`, object references to `null`) | Automatically assigned default values in the same way as instance variables |
| **Usage Considerations** | Used for temporary data that is only needed within a particular block of code | Used to store the state or properties of an object | Used for values or methods that should be shared among all instances of the class, such as constants or counters |

---

### Detailed Explanation

1. **Declaration & Scope**

  - *Local Variables:*  
    These are declared within a method, constructor, or block (like a loop or an `if` statement). 
    Their scope is strictly local to the block in which they are defined. 
    This means you cannot use a local variable outside the method or block where it was created.

  - *Instance Variables:*  
    Declared in the class but outside any method, constructors, or blocks, instance variables are part of 
    the state of an object. Each object maintains its own copy of these variables.
  - *Class (Static) Variables:*  
    These are declared similarly to instance variables but with the addition of the `static` modifier. 
    They belong to the class itself rather than any particular instance, meaning all objects of that class share a single copy.

2. **Lifetime & Memory Allocation**

  - *Local Variables:*  
    Their lifetime is temporary; they are created when the associated block or method is entered and removed 
    when it exits, with their memory typically allocated on the stack.
  - *Instance Variables:*  
    Their lifetime is tied to the object they belong to. Memory for these variables is allocated on the heap when the 
    object is instantiated and will exist for the duration of the object’s life.
  - *Class (Static) Variables:*  
    These exist as long as the program runs. They are allocated once when the class is loaded, 
    regardless of how many instances of the class are created.

3. **Access Modifiers & Default Values**

  - *Local Variables:*  
    They cannot be declared with access modifiers because they are not accessible outside their own blocks. 
    Additionally, they do not get default values, so you must initialize them before use to avoid compilation errors.
  - *Instance & Class Variables:*  
    Both can have access modifiers, ensuring encapsulation and controlled access within the class or outside it. 
    Moreover, if no explicit initialization is provided, these variables are automatically set to default 
    values (e.g., `0` for integers, `false` for booleans, and `null` for object references).

4. **Usage Considerations**

  - *Local Variables:*  
    Best used for temporary storage or calculations where the data is not needed beyond a small block of code.
  - *Instance Variables:*  
    They represent the state or properties of an individual object instance. 
    Each instance maintains its own data independent of others.
  - *Class Variables:*  
    Ideal for data or methods that should be common to all instances of a class—such as configuration settings, 
    counters shared across instances, or utility methods that operate on a class-level basis.

---
<sup><sub>[▲ TOP](#table-of-contents)</sub></sup>


## Access Modifiers and Visibility

---

| **Context**                    | **Public** | **Protected** | **Default** | **Private** |
|--------------------------------|:----------:|:-------------:|:-----------:|:-----------:|
| **Same Class**                 | Y          | Y             | Y           | Y           |
| **Same Package Subclass**      | Y          | Y             | Y           | N           |
| **Same Package Non-subclass**  | Y          | Y             | Y           | N           |
| **Different Package Subclass** | Y          | Y             | N           | N           |
| **Different Package Non-subclass** | Y      | N             | N           | N           |

---

### Key Points and Detailed Explanation

1. **Public Access**

    - **Accessibility:**
        - Accessible from any class in any package.
        - This means any code, regardless of its location, can interact with public members.
    - **Usage:**
        - Ideal for API methods or fields that need to be universally accessible.
    - **Table Reflection:**
        - Marked "Y" (Yes) in every context.

2. **Protected Access**
    
    - **Accessibility:**
        - Accessible within the same class, same package (both subclass and non-subclass), and in subclasses in different packages.
        - Not accessible in different package non-subclasses.
    - **Usage:**
        - Often used when you want to allow extending classes in other packages to access or modify the member, while still limiting access to other non-related classes.
    - **Table Reflection:**
        - Same class and any member in the same package are accessible.
        - For different package subclasses, access is provided; however, for non-subclasses in different packages, access is denied.

3. **Default (Package-Private) Access**
    
    - **Accessibility:**
        - Accessible only within classes in the same package, regardless of subclass or non-subclass status.
        - Not accessible outside the package.
    - **Usage:**
        - Commonly used when you want to restrict use to classes that are logically grouped together in one package.
    - **Table Reflection:**
        - Accessible for any code within the same package (both subclasses and non-subclasses) but not for any code in different packages.

4. **Private Access**
    
    - **Accessibility:**
        - Accessible only within the same class where it is declared.
        - Not inherited by subclasses or accessible from any other class.
    - **Usage:**
        - Perfect for encapsulation, ensuring that class internals remain hidden and protected from outside interference.
    - **Table Reflection:**
        - Only the declaring class can see or modify private members.
        - Even subclasses (whether in the same package or not) cannot access these members.

---

### Additional Considerations

- **Top-level Classes & Interfaces:**
    - Cannot be declared with `private` or `protected` modifiers.
    - They can only be declared with `public` or with default (package-private) access.

- **Method Inheritance and Overriding:**
    - **Public Methods:**
        - Methods declared as `public` in a superclass must remain `public` in any subclass that overrides them.
    - **Protected Methods:**
        - Subclasses can override `protected` methods with either `protected` or `public` access, but not with default or `private` access.
    - **Private Methods:**
        - Private methods are not inherited by subclasses. They are accessible only within the class where they are declared, effectively making them unavailable for overriding.

---

### Recap

- **Public:** Offers the broadest level of access—visible everywhere.
- **Protected:** Provides a balance between accessibility and encapsulation—visible within the same package and subclasses (even in different packages).
- **Default:** Restricts access to within the same package; suitable for closely related classes.
- **Private:** Ensures that the members remain encapsulated within the defining class only.

---

<sup><sub>[▲ TOP](#table-of-contents)</sub></sup>


## Bitwise Operations
### Width vs. Possible Values
The number of bits used (width) determines the numbers that can be encoded: 2^n total.
- Unsigned: 0 through 2^n - 1
- 2's Complement: -2^(n-1) through 2^(n-1) - 1

### Numerical primitives
- **byte:** 8 bits, e.g. from -128 to 127
- **short:** 16 bits
- **char:** *unsigned* 16 bits
- **int:** 32 bits
- **long:** 64 bits

### Operators

For the following examples, assume a = 60, b = 13, c= -2. Their binary 2's complement representations are below.  
a = 0011 1100  
b = 0000 1101  
c = 1111 1110  

| Operation | Function | Example |
|:---:|:---:|---|
| `&`   |AND                            | `a&b` = `0000 1100 (12)` |
| `\|`  |OR                             | `a\|b` = `0011 1101 (61)` |
| `^`   |XOR                            | `a^b` = `0011 0001 (49)` |
| `~`   |Complement (bitwise inversion) | `~a` = `1100 0011 (-61 in 2's complement)` |
| `<<`  |Left shift                     | `a << 2` = `1111 0000 (-16 in 2's complement)` |
| `>>`  |Arithmetic shift right         | `c >> 2` = `1111 1111 (-1)` |
| `>>>` |Logical shift right (zero-fill)| `c >>> 2` = `0111 1111 (127)` |

### Useful Tricks
- Note that in the following examples, x, 0, and 1 refer to a single bit, not a multi-bit integer
  - **XOR**
    - x ^ 0 = x
    - x ^ 1 = ~x
      - For a multi-bit integer n, n ^ -1 = ~n. This works because -1 in 2's complement is represented as 11111111..., so each bit gets XOR'd with 1
    - x ^ x = 0
  - **AND**
    - x & 0 = 0
    - x & 1 = x
      - For a multi-bit integer n, n & -1 = n. This works because -1 in 2's complement is represented as 11111111..., so each bit gets AND'd with 1
    - x & x = x
  - **OR**
    - x \| 0 = x
    - x \| 1 = 1
    - x \| x = x
---  
- Swapping two values without a temporary variable
  ```
  You can swap the values of two integers using XOR without an extra temporary variable. 
  
  For example, suppose: // E.g. a = 2 (0b0010), b = 5 (0b0101)

  a = a ^ b;  // Step 1: a becomes 7 (binary: 0111)
  b = a ^ b;  // Step 2: b becomes 2 (binary: 0010)
  a = a ^ b;  // Step 3: a becomes 5 (binary: 0101)
  
  1. Step 1:
  a = a ^ b; 
  - Explanation: (a) becomes (a oplus b). 
    For example, if (a=2) (0010) and (b=5) (0101), then (a) becomes (7) (0111).
  
  2. Step 2:
   b = a ^ b;
  - Explanation: Now, (b = (a oplus b) oplus b) simplifies to (a) (since (b oplus b = 0)). 
    Thus, (b) becomes the original (a) (2).
  
  3. Step 3:
   a = a ^ b; 
  - Explanation: Finally, (a = (a oplus b) oplus a) simplifies to (b) (as (a oplus a = 0)). 
    So, (a) becomes the original (b) (5).
---  
<sup><sub>[▲ TOP](#table-of-contents)</sub></sup>

## Exceptions

Three types:
1. **Checked Exceptions:** Notified by the compiler at compile-time
2. **Unchecked Exceptions:** Runtime Exceptions
3. **Errors:** Problems that arise beyond the control of the user and programmer, e.g. stack overflow

### Exception Hierarchy

<img src="http://cdncontribute.geeksforgeeks.org/wp-content/uploads/Exception-in-java1.png" alt="Java Exceptions Hierarchy" style="max-width: 80%; display: block; margin: 1rem auto;" />

<img src="http://www.benchresources.net/wp-content/uploads/2017/02/exception-hierarchy-in-java.png" alt="Java Exceptions Hierarchy" style="max-width: 80%; display: block; margin: 1rem auto;" />

### try-with-resources
Automatically closes the resources used, e.g.
```java
try (FileReader fr = new FileReader(filepath)) {
    // use the resource
} catch () {
    // handle the exception
}
```

### User-defined Exceptions
- Must be a child of `Throwable`
- If checked exception, must extend `Exception`
- If unchecked exception, must extend `RuntimeException`
---

<sup><sub>[▲ TOP](#table-of-contents)</sub></sup>

## Polymorphism
- Any object that can pass an IS-A test is polymorphic
  - All objects are polymorphic to the `Object` class
- Objects can **only** be accessed through reference variables
  - A reference variable can only be of one type, and that type cannot be changed once declared. However, 
    the reference variable can be reassigned to other objects (given that it is not `final`)
    - The type of reference variable determines the methods it can invoke on an object
    - A reference variable can refer to any object of its declared type or any subtype
    - A reference variable can be declared as a class or interface type
    
Example:
Given the following:  
```java
public interface Vegetarian { ... }
public class Animal { ... }
public class Deer extends Animal implements Vegetarian { ... }
```
then a Deer IS-A Animal, Vegetarian, Deer, and Object

Thus the following are all legal:
```java
Deer d = new Deer();
Animal a = d;
Vegetarian v = d;
Object o = d;
```
All four of these references refer to the same Deer object on the heap.

---
### Static Polymorphism
*Static Polymorphism* is polymorphism that is resolved at compile time. 
Method *overloading* is an example of static polymorphism.

For example, say we have the following code:
```java
int add(int a, int b) {
    return a + b;
}

int add(int a, int b, int c) {
    return a + b + c;
}

```
int x = add(1, 2);    // Calls the first add method. x = 3
int y = add(1, 2, 3); // Calls the second add method. y = 6
```

When we make a call to the `add` function, we can tell which function will be called 
before even running our code, based on the type and number of our arguments. 

And, in fact, the compiler does just this -- it resolves which method will be called at compile time, 
rather than waiting until runtime.

### Dynamic Polymorphism
*Dynamic Polymorphism* is polymorphism that is resolved at runtime. 
Method *overriding* is an example of dynamic polymorphism.

For example, consider the following code:

class Parent {
    public void myMethod() {
        System.out.printline("I am the parent");
    }
}

public class Child extends Parent {
    public void myMethod() {
        System.out.printline("I am the child");
    }
    
    public static void main(String[] args) {
        Parent p = new Child();
        Child c = new Child();
        p.myMethod(); // I am the child
        c.myMethod(); // I am the child
    }
}
```
Here, we instantiate two Child objects, one using a Parent reference `p`, and the other using a Child reference `c`.

While invoking `c.myMethod()`, the compiler sees `myMethod()` in the `Child` class at compile time, and the JVM invokes

`myMethod()` in the `Child` class at run time.

`myMethod()` on `p` is quite different because `p` is a Parent reference. 

When the compiler sees `p.myMethod()`, the compiler sees the `myMethod()` method in the `Parent` class.  

Here, at compile time, the compiler used `myMethod()` in `Parent` to validate this statement. 

At run time, however, the JVM invokes `myMethod()` in the `Child` class.

This behavior is also referred to as **virtual method invocation**, and these methods are referred to as **virtual methods**. 

An overriding method is invoked at runtime, no matter the data type the reference is that was used in the source code at compile time.

### Method Overriding
Rules for *overriding* methods (**NOT** overloading!)
- The argument list must be the same
- The return type must be the same or a subtype of the return type declared in the overriden method
- The access level cannot be more restrictive than the overidden method's
- Instance methods can only be overridden if they are inherited by the subclass
- `final` methods cannot be overriden
- A `static` method can be redeclared, but not overridden
- If a method cannot be inherited, it cannot be overriden
- Constructors cannot be overriden.

---------------------------------

<sup><sub>[▲ TOP](#table-of-contents)</sub></sup>

## Static vs Dynamic Binding

Association of a method call to a method body is known as **binding**. There are two types of binding:
1. **Static Binding** (aka Early Binding): Binding resolved at compile time
2. **Dynamic Binding** (aka Late Binding): Binding resolved at run time

In Java, static binding is used for the binding of `static`, `private`, and `final` methods. 

This is because these methods cannot be overridden, and thus calls to such methods are necessarily unambiguous. 

The type of the class these methods belong to can be determined at compile time.

This is important to know, for example, in situations where you might call a `static` method via an object 
(all though this is generally ill-advised), like in the example below.

```java
class Human {
   public static void walk() {
       System.out.println("Human walks");
   }
}
class Boy extends Human {
   public static void walk(){
       System.out.println("Boy walks");
   }
   
   public static void main(String args[]) {
       Human b = new Boy();    // Reference is type Human, object is type Boy
       Human h = new Human();  // Reference is type Human, object is type Human
       b.walk();  // Human walks
       h.walk();  // Human walks
   }
}
```

On the other hand, dynamic binding is used when the compiler is not able to resolve the binding at compile time:

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
   
   public static void main(String args[]) {
       Human b = new Boy();    // Reference is type Human, object is type Boy
       Human h = new Human();  // Reference is type Human, object is type Human
       b.walk();  // Boy walks
       h.walk();  // Human walks
   }
}
```

Note that, as detailed in the [Polymorphism](#polymorphism) section, the binding of *overloaded* methods is static, 
while the binding of *overridden* methods is dynamic.

<sup><sub>[▲ TOP](#table-of-contents)</sub></sup>

---

## Interfaces
An interface may have abstract methods, default methods, static methods, constants, and nested types. 
Method bodies exist only for default and static methods.

An interface contains behaviors that a class implements. 
All methods of an interface must be defined in the implementing class, unless the class itself is abstract.

Interfaces are **similar** to classes in that:
- They can contain any number of methods
- Saved as InterfaceName.java

Interfaces are **different** from classes in that:
- Interfaces cannot be instantiated
- Interfaces don't have constructors
- All interface methods are *implicitly* abstract
- An interface cannot have instance fields; only `static final` fields (constants)
- An interface can extend multiple interfaces (classes can implement multiple interfaces - but they *cannot* extend multiple classes)

Interfaces and their methods are implicitly `abstract`. Their methods are implicitly `public`.

### Tagging Interfaces
The most common use of extending interfaces occurs when the parent interface doesn't have any methods.
Example:
The MouseListener interface in `java.awt.event` extends `java.util.EventListener`, which is defined as follows:  
```java
package java.util;
public interface EventListener {}
```
Thus, an interface with no methods is a **tagging interface**.  
These have two basic design purposes:  
1. Creates a common parent
2. Adds a data type to a class. A class that implements a tagging interface becomes an interface type through polymorphism

---
<sup><sub>[▲ TOP](#table-of-contents)</sub></sup>

## Nested Classes
Types of nested classes:
```
                                Nested classes
                                      |
                   ___________________|__________________
                  |                                      |
            Inner classes                      Static nested classes
    ______________|_________________
   |              |                 |
 Inner      Method-local        Anonymous
classes     inner classes     inner classes
```

**Java does NOT support multiple inheritance.**  
This means a class cannot inherit multiple classes. However, a class **can** implement multiple interfaces.

---
<sup><sub>[▲ TOP](#table-of-contents)</sub></sup>

## Java Generics
```java
public static <E> void printArray(E[] array) {
    for (E element : array)
        System.out.print(element + " ");
}

// Example usage:
Integer[] intArr = {1, 2, 3};
Double[] doubleArr = {1.1, 2.2, 3.3};

printArray(intArr);
printArray(doubleArr);
```

You can also bound the type of the Generic parameters, e.g.  
```java
public static <T extends Comparable<T>> T max(T x, T y) { ... }
```

Can be applied to Generic classes as well, e.g.  
```java
public class Box<T> {
    private T t;
    ....
 }
 ```
---
<sup><sub>[▲ TOP](#table-of-contents)</sub></sup>

## Serialization
Serialization allows an object to be represented as a sequence of bytes that includes the object's data as well as 
info about the object's type and the types of data stored in the object.

After a serialized object has been written to a file, it can be read from the file and deserialized to recreate the object in memory.

For a class to be serialized, it must meet two conditions:
1. It must implement the `java.io.Serializable` interface
2. All of the fields must be serializable. If a field is not serializable, it must be marked with the `transient` keyword.

Example of serialization:
```java
try {
    FileOutputStream fileOut = new FileOutputStream("/tmp/employee.ser");
    ObjectOutputStream out = new ObjectOutputStream(fileOut);
    out.writeObject(e); // Assume e is an Employee object
    out.close();
    fileOut.close();
}
```
The data for object `e` is now saved in `/tmp/employee.ser`.  
Note: convention is to use `.ser` (?)

Example of deserialization:
```java
Employee e = null;
try {
    FileInputStream fileIn = new FileInputStream("/tmp/employee.ser");
    ObjectInputStream in = new ObjectInputStream(fileIn);
    e = (Employee)in.readObject();
    in.close();
    fileIn.close();
}
```
The return value of `readObject()` should be cast to the proper class.


---
<sup><sub>[▲ TOP](#table-of-contents)</sub></sup>


## Multithreading
Lifecycle of a thread:
- **New:** a new thread begins in this state where it remains until the program starts the thread
- **Runnable:** executing its task
- **Waiting:** waiting for another thread to finish a task
- **Timed Waiting:** waiting for a certain amount of time
- **Terminated:** dead

Thread priorities range from `MIN_PRIORITY` (a constant of 1) to `MAX_PRIORITY` (a constant of 10).

There are two ways of creating a thread:
1. Implement the `Runnable` interface
  - If you want a class to be executed as a thread, it must implement `Runnable`. This method takes three basic steps:
    1. Implement a `run()` method
    2. Instantiate a `Thread` object, like so: `Thread (Runnable threadObj, String threadName)`, where threadObj is an instance of a class that implements `Runnable`, and threadName is the name given to the new thread
    3. Start a Thread object with `start()`, which executes a class to the class's `run()` method

2. Extend the `Thread` class
  - This approach provides more flexibility in handling multiple threads created using available methods in the `Thread` class.
    1. Override the `run()` method in `Thread` class
    2. After creating the `Thread` object, start it with the `start()` method

### Thread Synchronization
What if two threads try to access the same resources? For example, if multiple threads try to write to the same 
file at the same time, they could corrupt the file.

**Monitors** allow us to make sure only one thread can access a shared resource at a time. 
Each object in Java has a monitor associated with it, which a thread can lock or unlock. 

Only one thread at a time may hold a lock on a monitor.

Use a `synchronized` block to contain shared data.

See [this detailed video on Java Multithreading - Synchronizers](https://www.youtube.com/watch?v=HYbXlvODl6E&list=PLnNp-JheilQXVUGkdj_WVttaZ032xE2Di&index=6&ab_channel=DoSomeDev) 
for an in-depth explanation and practical examples.

See the [Java Multithreading - Synchronization examples](https://github.com/Someshdiwan/JavaEvolution-Learning-Growing-Mastering/tree/master/Section19MultiThreading/Synchronization) 
in this GitHub repository for practical implementation and code walk-throughs.

### Inter-thread Communication
Threads can be built to exchange information using three simple methods:
  1. `public void wait()` -- causes the current thread to wait until another thread invokes `notify()`
  2. `public void notify()` -- wakes up a single thread that is waiting on the object's monitor
  3. `public void notifyAll()` -- wakes up all threads that called `wait()` on the same object
  
All three methods can **only** be called from within a `synchronized` context.

#### Thread Deadlock
Situation where two or more threads are blocked forever, waiting for each other. 
Occurs when multiple threads need the same locks, but obtain them in a different order. 
Obviously, we want to **avoid this!**

Explore the [Deadlock scenarios and solutions in Java](https://github.com/Someshdiwan/JavaEvolution-Learning-Growing-Mastering/tree/master/Section19MultiThreading/DeadLock) 
with hands-on examples that demonstrate how circular waits occur and how to prevent them effectively.

---
<sup><sub>[▲ TOP](#table-of-contents)</sub></sup>

## Java Collections Framework
### Overview

<div style="text-align: center;">
  <img src="https://media.geeksforgeeks.org/wp-content/uploads/java-collection.jpg" 
       alt="Java Collections Framework" 
       class="responsive-img java-img"
       style="max-width: 600px; width: 100%; height: auto;" />
</div>

---
### Maps
There are four commonly used map implementations in Java: HashMap, TreeMap, LinkedHashMap, and Hashtable.

<div style="text-align: center;">
  <img src="https://raw.githubusercontent.com/Someshdiwan/JavaEvolution-Learning-Growing-Mastering/master/Section25CollectionFramework/src/HashMapDemo/Map%20Demo.png" 
       alt="Java Collections Framework" 
       class="responsive-img java-img"
       style="max-width: 600px; width: 100%; height: auto;" />
</div>


To summarize them:
- **HashMap** makes no guarantees on the ordering of keys or values.
- **TreeMap** will iterate according to the "natural ordering" of the keys according to their `compareTo()` 
    method (or an externally supplied `Comparator`). Additionally, it implements the `SortedMap` interface, 
    which contains methods that depend on this sort order. It is implemented via a red-black tree.
- **LinkedHashMap** is a subclass of HashMap with a linked-list implementation. 
    It will iterate in the order in which the entries were put into the map.
- **Hashtable** is an obsolete class from the days of Java 1.1 before the collections framework existed. 
    It should not be used anymore, because its API is cluttered with obsolete methods that duplicate functionality, and 
    its methods are synchronized (which can decrease performance and is generally useless). Furthermore, in a `Hashtable`, 
    neither the key nor value can be `null`. This is not the case with `HashMap`, which may have a single `null` key and 
    multiple `null` values.

- Use [ConcurrentHashMap](https://docs.oracle.com/javase/7/docs/api/java/util/concurrent/ConcurrentHashMap.html) &
[ConcurrentMap Example](https://github.com/Someshdiwan/JavaEvolution-Learning-Growing-Mastering/tree/master/Section25CollectionFramework/src/ConcurrentMap) 
instead of `Hashtable` when synchronization is needed.


---

### 🧠 Understanding the Differences

| Property             | HashMap             | TreeMap                        | LinkedHashMap              |
|----------------------|----------------------|---------------------------------|-----------------------------|
| **Iteration Order**  | Unpredictable        | Natural key ordering            | Insertion order             |
| **Time Complexities**| get/put/remove: O(1) | get/put/remove: O(log n)        | get/put/remove: O(1)        |
| **Interfaces**       | Implements Map       | Implements Map, SortedMap, NavigableMap | Implements Map      |
| **Null Support**     | One null key, many null values | Only null values allowed | One null key, many null values |
| **Fail-fast?**       | Yes (not guaranteed) | Yes (not guaranteed)            | Yes (not guaranteed)        |
| **Implementation**   | Hash buckets         | Red-Black Tree                  | Hash buckets + doubly linked list |
| **Thread-safe?**     | ❌ Not synchronized  | ❌ Not synchronized             | ❌ Not synchronized          |

---

### 💡 Notes & Deeper Explanations

- **HashMap**: Best for constant-time performance if ordering is not important. Backed by an array of linked lists or trees.
- **TreeMap**: Ideal when you need keys in sorted order. Backed by a self-balancing binary search tree (Red-Black Tree).
- **LinkedHashMap**: Preserves insertion order. Useful for creating caches (e.g., access-order with `removeEldestEntry`).
- **Hashtable**: Legacy class. Thread-safe but generally avoided in favor of [ConcurrentHashMap](https://docs.oracle.com/javase/7/docs/api/java/util/concurrent/ConcurrentHashMap.html).
- **ConcurrentHashMap**: Thread-safe, high-performance map for concurrent environments. Use when working with multiple threads.

---

### 📌 When to Use What?

| Use Case                               | Recommended Map     |
|----------------------------------------|---------------------|
| Fast lookups, no order required        | `HashMap`           |
| Sorted keys needed                     | `TreeMap`           |
| Maintain insertion order               | `LinkedHashMap`     |
| Thread-safe access                     | `ConcurrentHashMap` |
| Cache with eviction (LRU/FIFO)         | `LinkedHashMap` (custom logic) |
| Deprecated legacy code (not advised)   | `Hashtable`         |

---

```
ArrayList vs. Vector:

1. Synchronization: Vector is synchronized, which means only one thread can access it at a time, 
     while ArrayList is not synchronized, which means multiple threads could read it at the same time.
2. Performance:ArrayList is faster, as Vector incurs slight overhead in acquiring the lock.
3. Growth: Vector and ArrayList both grow and shrink dynamically, but ArrayList increments 50% 
   of the current array size if the number of elements exceeds its capacity, while Vector increments 100%.
4. Traversal: Vector can use both Enumeration and Iterator for traversing elements, while ArrayList can only use Iterator.

Generally, you'll want to use an ArrayList; in the single-threaded case it's a better choice, and in the multi-threaded case, 
you get better control over locking. 

Want to allow concurrent reads? Fine. 
Want to perform one synchronization for a batch of ten writes? Also fine. It does require a little more care on your end, 

but it's likely what you want. Also note that if you have an ArrayList, 
---

Common Design Patterns:

Singleton Class:
Controls object creation, limiting # of objects to only one. Since there is only one instance, instance fields 
will occur once per class, similar to static fields.

Singletons often control access to resources like database connections or sockets.  

public class Singleton {
    private static Singleton singleton = new Singleton();
    private Singleton () {} // private constructor prevents any other class from instantiating
    
    public static Singleton getInstance() { return singleton; }
    protected static void demoMethod() { System.out.println("demo"); }
}

🗺️ Java Map Implementations – Detailed Comparison

Java provides several implementations of the Map interface, each with unique properties and use-cases. 

Here's a detailed breakdown:

---

🔢 Time Complexities of Operations In Detail:

| Operation          | HashMap      | TreeMap          | LinkedHashMap  |
|--------------------|--------------|------------------|----------------|
| get()              | O(1)         | O(log n)         | O(1)           |
| put()              | O(1)         | O(log n)         | O(1)           |
| remove()           | O(1)         | O(log n)         | O(1)           |
| containsKey()      | O(1)         | O(log n)         | O(1)           |
| iteration time     | O(n)         | O(n)             | O(n)           |

---

📊 Feature Comparison Table

| Feature              | HashMap                             | TreeMap                               | LinkedHashMap                          |
|----------------------|-------------------------------------|---------------------------------------|----------------------------------------|
|   Ordering           | No ordering guarantee               | Sorted by natural/comparator order    | Maintains insertion order              |
|   Null keys/values   | One null key, many null values      | No null keys, null values allowed     | One null key, many null values         |
|   Implementation     | Array + Linked List / Tree bins     | Red-Black Tree                        | Hash buckets + Doubly Linked List      |
|   Thread Safety      | ❌ Not synchronized                 | ❌ Not synchronized                   | ❌ Not synchronized                    |
|   Fail-Fast?         | Yes (not guaranteed in concurrency) | Yes (not guaranteed in concurrency)   | Yes (same behavior)                    |
|   Interfaces         | Map                                 | Map, SortedMap, NavigableMap          | Map                                    |

---

🧠 Individual Map Descriptions

✅ HashMap
-  Best for: General-purpose map usage with fast access.
-  Performance: Very efficient in most scenarios.
-  Behavior: No guaranteed order of keys. Backed by hashing, uses linked lists and tree bins internally (since Java 8).
-  Use Case: Caching, frequency counting, etc.

✅ TreeMap
- Best for: Sorted data (like a dictionary or leaderboard).
- Behavior: Keys are kept in ascending order or based on a custom Comparator.
- Performance: Slightly slower due to tree traversal.
- Use Case: Range-based queries, maintaining sorted keys.

✅ LinkedHashMap
- **Best for: Preserving insertion order or implementing LRU cache.
- **Behavior: Combines HashMap performance with predictable iteration order.
- **Use Case: JSON serialization, access-order tracking.

---

🧵 Thread-Safe Alternative

✅ ConcurrentHashMap
- Thread-safe version of HashMap for concurrent applications.
- Divides the map into segments for high-performance multithreading.
- Doesn’t allow null keys or values.

Map<String, Integer> map = new ConcurrentHashMap<>();

```

Example usage:
```java
Singleton tmp = Singleton.getInstance();
tmp.demoMethod();
```

you can use the [Collections.synchronizedList](https://docs.oracle.com/javase/8/docs/api/java/util/Collections.html#synchronizedList-java.util.List-)
function to create a synchronized list, thus getting you the equivalent of a `Vector`.

----

Some useful posts on the variations of the Singleton pattern in Java:
- [Singletons in Java - Baeldung](https://www.baeldung.com/java-singleton)
- [Double-Checked Locking with Singleton](https://www.baeldung.com/java-singleton-double-checked-locking)
- [Java Singleton Design Pattern Best Practices with Examples](https://www.journaldev.com/1377/java-singleton-design-pattern-best-practices-examples)

---

<sup><sub>[▲ TOP](#table-of-contents)</sub></sup>

## Number Wrapper Classes
```
                   Number
                     |
  ___________________|_________________
 |       |       |       |      |      |
Byte  Integer  Double  Short  Float  Long
```

Converting primitive data types into objects is called **boxing**.  
Similarly, the reverse operation is called **unboxing**.

---
<sup><sub>[▲ TOP](#table-of-contents)</sub></sup>

## Cloning Arrays
Two methods of copying an array are using `System.arraycopy()` and `clone()`.  
An example of `System.arraycopy()`:
```java
int[] dest = new int[orig.length];
System.arraycopy(orig, 0, dest, 0, orig.length);
```

An example of `clone()`:
```java
int[] dest = orig.clone();
```

Long story short, it seems the first method may be quicker on shorter arrays, but on larger datasets they have similar 
performance. Furthermore, `clone()` is much more compact and easy to read. Thus, tend to prefer `clone()`.

For more information, see [this article](https://www.javaspecialists.eu/archive/Issue124.html).

---
<sup><sub>[▲ TOP](#table-of-contents)</sub></sup>

## Other Useful Keywords
### `final` Keyword
Can be applied to variables, methods, and classes.

#### Variables
- Can be initialized only once
- A reference variable declared `final` can never be reassigned to refer to a different object. However, 
  the data within the object can be changed (unless it is also `final`). 
- In other words, the state of the object can be changed, but not the reference.

#### Methods
- Cannot be overriden by subclasses

#### Classes
- Cannot be subclassed. Thus, no features can be inherited.

### `abstract` Keyword
Can be applied to both methods and classes.

#### Methods
- Have no implementation. Implementation is provided by subclass.
- Can never be `final` or `strict`
- Any class that extends an `abstract` class must implement **all** of its `abstract` methods, 
unless the subclass is also `abstract`

#### Classes
- Can never be instantiated
- Cannot be both `abstract` and `final` (there is an obvious conflict of purpose between those two keywords)
- If a class contains `abstract` methods, the class **must** be declared as `abstract`
- An `abstract` class may have `abstract` as well as other methods
- An `abstract` class doesn't have to have `abstract` methods.

### `synchronized` Keyword
Indicates a block of code that can only be executed by one thread at a time. Can be applied to methods or independent blocks.

A synchronized block can specify an object to use as a lock. This object is referred to as a "monitor" object.

See [this post](http://tutorials.jenkov.com/java-concurrency/synchronized.html) or the 
[accompanying video](https://youtu.be/eKWjfZ-TUdo) for more information.

### `transient` Keyword
An instance variable marked as `transient` tells the JVM to skip that variable when serializing the object containing it.

### `throws` Keyword
Used to postpone the handling of a checked (compile-time) exception.
E.g.
```java
import java.io.*;
public class MyClass {
    public void deposit(double amount) throws RemoteException {
        // Method implementation ...
        throw new RemoteException();
    }
}
```
---
### `volatile` Keyword
Tells the JVM that a thread accessing the variable must merge its own private copy of the variable with the master copy in memory. 
In technical terms, any variable marked as volatile will only ever be read from & written to main memory, bypassing any CPU caching.

If a variable is not declared `volatile`, we have no guarantee about when exactly the master copy will be accessed or modified. 
This can subtly cause problems in multithreaded applications that may be difficult to debug. 

`volatile` can only be used on instance variables.

See [this fantastic post](http://tutorials.jenkov.com/java-concurrency/volatile.html) or the [accompanying video](https://www.youtube.com/watch?v=nhYIEqt-jvY&ab_channel=JakobJenkov) 
for more information.

Check out the [Volatile and Atomic concepts in Java](https://github.com/Someshdiwan/JavaEvolution-Learning-Growing-Mastering/tree/master/Section19MultiThreading/Volatile%20and%20Atomic) 
for clear examples and explanations on memory visibility and atomic operations in multithreaded programming.