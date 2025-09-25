# 📌 Internal Working of Stack in Java (Enhanced & Detailed)

## Introduction

- In Java, `Stack` is a **legacy class** from the `java.util` package.
- It extends `Vector`, which means:
    - Backed by a **dynamic array** (like `Vector`).
    - Inherits **synchronization** for thread safety.
- Represents a **Last-In, First-Out (LIFO)** data structure.
- Although still used, it is often replaced with `ArrayDeque` in modern applications due to performance advantages.

---

## 1. Underlying Data Structure

- `Stack` is built on top of `Vector`, which internally uses an **array** (`Object[]`) to store elements.
- Key points:
    - The array resizes dynamically when capacity is exceeded.
    - Synchronization makes operations thread-safe but slower.

Declaration:

```java
Stack<Integer> stack = new Stack<>();
```

Internally:

```java
Vector<Object> elementData = new Vector<>(initialCapacity);
```

- Default capacity starts at 10.
- Resizing: when the array is full, capacity is **doubled**.

---

## 2. Core Operations of Stack

### push(E item)

- Adds element to the **top of the stack**.
- Internally calls `addElement(item)` from `Vector`.

Example:

```java
stack.push(10); // adds 10 to stack top
```

Flow:

1. Check capacity.
2. If full → grow array.
3. Place element at `elementData[size]`.
4. Increment size.

---

### pop()

- Removes and returns the **top element**.
- Internally:
    - Retrieves last element via `elementAt(size-1)`.
    - Calls `removeElementAt(size-1)`.

Example:

```java
int x = stack.pop();
```

Flow:

1. Call `peek()` to get element.
2. Reduce size by 1.
3. Nullify the removed slot for GC.

---

### peek()

- Returns the **top element without removing it**.
- Uses `elementAt(size-1)`.
- Throws `EmptyStackException` if empty.

---

### empty()

- Checks if the stack has no elements.
- Returns `size() == 0`.

---

### search(Object o)

- Returns the **1-based position from the top** of the stack.
- If not found, returns -1.
- Internally scans linearly (`O(n)`).

---

## 3. ASCII Representation

Empty Stack:

```
[]
size = 0, capacity = 10
```

After stack.push(5), stack.push(10), stack.push(20):

```
[5, 10, 20]
size = 3, capacity = 10
Top → 20
```

After stack.pop():

```
[5, 10]
size = 2
Top → 10
```

---

## 4. Complexity of Operations

- push(E) → O(1) amortized (resizing may cost O(n)).
- pop()   → O(1).
- peek()  → O(1).
- empty() → O(1).
- search() → O(n) (linear search).

---

## 5. Internal Source Code Insight

### Class Declaration

```java
public class Stack<E> extends Vector<E> {
    public Stack() { }
}
```

### push()

```java
public E push(E item) {
    addElement(item); // Vector method
    return item;
}
```

### pop()

```java
public synchronized E pop() {
    E obj;
    int len = size();
    obj = peek();
    removeElementAt(len - 1);
    return obj;
}
```

### peek()

```java
public synchronized E peek() {
    int len = size();
    if (len == 0)
        throw new EmptyStackException();
    return elementAt(len - 1);
}
```

---

## 6. Advantages of Stack

- Simple and direct **LIFO** implementation.
- Thread-safe due to synchronization.
- Useful in recursion, expression evaluation, undo/redo functionality, parsing, and backtracking algorithms.

---

## 7. Limitations of Stack

- Synchronization overhead makes it slower.
- Being a legacy class, it’s less recommended.
- For most modern use cases, `` is a better choice:
    - Faster (no synchronization).
    - Provides both stack and queue operations.

---

## 8. Example Code

```java
import java.util.*;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack: " + stack);     // [10, 20, 30]
        System.out.println("Top: " + stack.peek()); // 30

        stack.pop();
        System.out.println("After pop: " + stack); // [10, 20]

        System.out.println("Search 10: " + stack.search(10)); // 2
        System.out.println("Is empty? " + stack.empty());     // false
    }
}
```

---

## 9. Complexity Summary Table

| Operation | Time Complexity | Notes                |
| --------- | --------------- | -------------------- |
| push()    | O(1) amortized  | May trigger resize   |
| pop()     | O(1)            | Remove last element  |
| peek()    | O(1)            | Access last element  |
| empty()   | O(1)            | Check size           |
| search()  | O(n)            | Linear scan from top |

---

## 10. Stack vs ArrayDeque (Comparison)

| Feature              | Stack (java.util.Stack)       | ArrayDeque (java.util.ArrayDeque) |
| -------------------- | ----------------------------- | --------------------------------- |
| Underlying structure | Dynamic array (via Vector)    | Resizable array (double-ended)    |
| Synchronization      | Yes (thread-safe)             | No (faster)                       |
| Performance          | Slower due to sync overhead   | Faster in single-threaded use     |
| push/pop/peek        | O(1) amortized                | O(1) amortized                    |
| search               | O(n)                          | O(n) (manual traversal)           |
| Recommendation       | Legacy, avoid in new projects | Preferred modern replacement      |

---

## 🔑 Summary

- `Stack` in Java is a **synchronized, LIFO data structure**.
- Internally backed by `Vector` (dynamic array).
- Provides core operations: push, pop, peek, empty, search.
- Suitable for thread-safe but low-performance cases.
- ✅ For most new projects, **prefer **`` for better performance and flexibility.
