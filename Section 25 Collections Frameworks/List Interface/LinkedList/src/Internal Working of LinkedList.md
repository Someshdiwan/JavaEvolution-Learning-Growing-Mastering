# Internal Working of LinkedList

This document explains how `java.util.LinkedList` works internally from a data-structure perspective. 

It covers the **theory, internal representation, working of core operations with ASCII examples, complexity analysis, 
memory layout, iteration semantics, concurrency notes, tuning tips, and debugging points**.

---

## Overview

- `LinkedList` is a **doubly linked list** implementation of `List` and `Deque`.
- Built from `Node` objects linked via `prev` and `next`.
- Tracks:
    - `first` → head node
    - `last` → tail node
    - `size` → number of elements
- **Strengths:** cheap insertions/removals at ends or via iterators.
- **Weaknesses:** slower random access than `ArrayList`.

---

## Conceptual Node Structure

```java
static class Node<E> {
    E item;         // stored value
    Node<E> next;   // reference to next node
    Node<E> prev;   // reference to previous node
}
```

Each node knows:

- Its **value** (`item`).
- Its **previous neighbor** (`prev`).
- Its **next neighbor** (`next`).

---

## Visual Representation

Empty list:

```
first -> null
last  -> null
size  = 0
```

List with [A, B, C]:

```
null <- [A] <-> [B] <-> [C] -> null
       ^first               ^last
size = 3
```

For node [B]: `prev → [A]`, `next → [C]`.

---

## Core Operations

### Append (`add` / `addLast`)

- Creates a new node at the tail.
- Steps:
    1. `newNode = new Node(last, e, null)`.
    2. If empty → `first = newNode`.
    3. Else link `last.next = newNode` and update `last`.
- Complexity: **O(1)**.

ASCII Example:

```
Before: [A] <-> [B]
After add(C): [A] <-> [B] <-> [C]
```

---

### Prepend (`addFirst`)

- Creates a new node at the head.
- Steps:
    1. `newNode = new Node(null, e, first)`.
    2. If empty → `last = newNode`.
    3. Else link `first.prev = newNode` and update `first`.
- Complexity: **O(1)**.

ASCII Example:

```
Before: [B] <-> [C]
After addFirst(A): [A] <-> [B] <-> [C]
```

---

### Insert at Index (`add(i, e)`)

- Traverses from nearest end using `node(index)`.
- Inserts between neighbors.
- Complexity: **O(n)**.

ASCII Example:

```
Before: [A] <-> [C]
Insert X at index 1: [A] <-> [X] <-> [C]
```

---

### Access (`get(i)` / `set(i, e)`)

- Traverses from closest end to reach node.
- Complexity: **O(n)**.

ASCII Example (`get(2)`):

```
[A] <-> [B] <-> [C] <-> [D]
Traversal path: first -> A -> B -> C
```

---

### Removal (`remove(i)` / `remove(Object o)`)

- Locates target, unlinks from neighbors, nulls references.
- Complexity: **O(n)**, except head/tail removals: **O(1)**.

ASCII Example:

```
Before: [A] <-> [X] <-> [B] <-> [C]
remove(2): unlink B
After: [A] <-> [X] <-> [C]
```

---

## Iteration

- `ListIterator` supports forward/backward traversal.
- Iterator `add` / `remove` → **O(1)**.
- **Fail-fast:** throws `ConcurrentModificationException` on structural change outside iterator.

ASCII Example (iteration):

```
Start -> [A] -> [B] -> [C] -> End
Iterator moves along nodes.
```

---

## Memory Layout & GC

- Each node = object header + 3 references + element.
- Higher overhead than `ArrayList` due to per-node object.
- After removal, sets `item`, `prev`, and `next` = `null` → helps GC.

---

## ⚡ Complexity Summary

| Operation                        | Time Complexity | Notes                                |
| -------------------------------- | --------------- | ------------------------------------ |
| `get(index)`                     | O(n)            | Traverses \~half of list on average. |
| `set(index, e)`                  | O(n)            | Must locate node first.              |
| `add(e)` / `addLast(e)`          | O(1)            | Tail insertion.                      |
| `addFirst(e)`                    | O(1)            | Head insertion.                      |
| `add(index, e)`                  | O(n)            | Traversal + insertion.               |
| `removeFirst()` / `removeLast()` | O(1)            | Direct head/tail removal.            |
| `remove(index)`                  | O(n)            | Traversal needed.                    |
| `contains(e)` / `indexOf(e)`     | O(n)            | Linear search.                       |

✅ **Rule of thumb:** Use `LinkedList` for **fast head/tail ops** & iterator-based changes; 
avoid for frequent random access.

---

## Concurrency

- Not synchronized → requires external sync.
- Alternatives: `ConcurrentLinkedDeque`, `ConcurrentLinkedQueue`.

---

## Practical Guidance

**Use when:**

- Frequent head/tail insertions/removals.
- Heavy iterator use.

**Avoid when:**

- Random access is common (→ prefer `ArrayList`).
- Memory overhead is critical.

---

## Performance & Debugging Tips

- Avoid `get(i)` in loops → O(n^2) trap.
- Use iterators or for-each.
- Profile allocations for large lists.
- For concurrency, consider `CopyOnWriteArrayList` or concurrent queues.

---

## Extended Visual Examples

1. **Start empty → addFirst(A) → addLast(B) → addLast(C):**

```
[A]
[A] <-> [B] <-> [C]
```

2. **add(1, X) on [A, B, C]:**

```
[A] <-> [X] <-> [B] <-> [C]
```

3. **remove(2) on [A, X, B, C] → remove B:**

```
[A] <-> [X] <-> [C]
```

4. **Iterator insertion at index 1 (on [A, C]):**

```
Before: [A] <-> [C]
Iterator add(B): [A] <-> [B] <-> [C]
```

---

## FAQ

- **Q:** Does it implement `Deque`? → **Yes.**
- **Q:** Is it thread-safe? → **No.** External sync required.
- **Q:** Better than `ArrayList`? → **Depends on workload.**

---
