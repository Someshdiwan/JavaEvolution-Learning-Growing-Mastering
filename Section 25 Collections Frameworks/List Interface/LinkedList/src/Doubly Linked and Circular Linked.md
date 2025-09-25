# Internal Working of doubly linked list and circular linked lists

This document explains how `java.util.LinkedList` works internally. 

It is based on **doubly linked list** principles but also compares with **circular linked lists** for conceptual 
understanding. 

It includes node structure, internal mechanics of add/remove operations, traversal behavior, complexity analysis, 
memory layout, iteration, concurrency aspects, and use cases.

---

## Overview

- `LinkedList` in Java implements both `List` and `Deque` interfaces.
- Internally, it is a **doubly linked list** — each node holds references to its predecessor and successor.
- Provides efficient insertions and deletions at both ends.
- Unlike `ArrayList`, elements are stored as individual node objects, not in a contiguous array.
- Maintains:
    - `first` → head pointer
    - `last` → tail pointer
    - `size` → count of elements
- **Strengths:** cheap insertions/removals at ends, efficient iterator-based modifications.
- **Weaknesses:** slower random access compared to arrays.

---

## Node Structure

Conceptual inner class:

```java
private static class Node<E> {
    E item;
    Node<E> next;
    Node<E> prev;
    Node(Node<E> prev, E element, Node<E> next) {
        this.item = element;
        this.next = next;
        this.prev = prev;
    }
}
```

Each node contains:
- The **value** stored (`item`).
- Pointer to the **previous node** (`prev`).
- Pointer to the **next node** (`next`).

---

## ASCII Diagram — Doubly Linked List

Example with 3 nodes (A, B, C):

```
head → [A | prev=null | next= ] ⇄ [B | prev | next ] ⇄ [C | prev | next=null] ← tail
```

- Bidirectional traversal is possible: forward from `head` to `tail`, backward from `tail` to `head`.

---

## Core Operations — Internal Mechanics

### `add(E e)` (append at tail)

1. Create new node: `newNode = new Node(last, e, null)`.
2. If empty → update `first = newNode`.
3. Else link `last.next = newNode`.
4. Update `last = newNode`, increment size.

Cost: **O(1)**

ASCII:

```
Before: [A] <-> [B]
After add(C): [A] <-> [B] <-> [C]
```

---

### `addFirst(E e)` (insert at head)

1. Create node: `newNode = new Node(null, e, first)`.
2. If empty → update `last = newNode`.
3. Else link `first.prev = newNode`.
4. Update `first = newNode`, increment size.

Cost: **O(1)**

ASCII:

```
Before: [B] <-> [C]
After addFirst(A): [A] <-> [B] <-> [C]
```

---

### `add(int index, E e)` (insert at position)

1. Validate index.
2. Locate successor node using `node(index)` (chooses shortest traversal path).
3. Insert `newNode` between `pred` and `succ`.
4. Rewire neighbors’ `next`/`prev`.

Cost: **O(n)** due to traversal.

ASCII:

```
Before: [A] <-> [C]
Insert X at index 1 → [A] <-> [X] <-> [C]
```

---

### `get(int index)`

- Traverses from head or tail depending on index position.
- Returns node’s `item`.
- Cost: **O(n)**

ASCII (get(2)):

```
[A] <-> [B] <-> [C] <-> [D]
Traversal: A → B → C
```

---

### `remove(int index)`

1. Locate target node.
2. Rewire neighbors: `pred.next = next`, `next.prev = pred`.
3. Null out target’s fields for GC.
4. Update size.

Cost: **O(n)**, except head/tail removal: **O(1)**.

ASCII:

```
Before: [A] <-> [X] <-> [B] <-> [C]
remove(2): unlink B
After: [A] <-> [X] <-> [C]
```

---

## Circular Linked List — Comparison

- In a **circular doubly linked list**, tail’s `next` → head, and head’s `prev` → tail.
- Benefits: endless iteration, round-robin scheduling, buffer management.
- Java’s `LinkedList` is not circular, but iteration can simulate circular traversal with modular indexing.

ASCII:

```
[A] ⇄ [B] ⇄ [C]
 ^                 |
 |_________________|
```

---

## ⚡ Complexity Summary

Below is a side-by-side comparison of **asymptotic complexities** for a standard **doubly linked list** 
(the model used by Java's `LinkedList`) and 
a **circular doubly linked list** (a conceptual variant where `tail.next` → `head` and `head.prev` → `tail`).

> **Important:** changing a list from linear doubly-linked to circular **does not** change the big‑O time complexity of 
> core operations — it changes traversal semantics and enables certain patterns 
> (like easy wrap-around or constant-time rotation) which can simplify algorithms.

| Operation                        | Doubly Linked List (Java `LinkedList`) | Circular Doubly Linked List (conceptual) |
| -------------------------------- | -------------------------------------- | ---------------------------------------- |
| `get(index)`                     | O(n) — traverse from nearest end; average ~n/2 steps. | O(n) — same asymptotic cost; traversal can wrap-around but still linear to target. |
| `set(index, e)`                  | O(n) — locate node then replace item. | O(n) — same. |
| `add(e)` / `addLast(e)`          | O(1) — append at tail using `last` pointer. | O(1) — append at tail; must update circular links (`tail.next = head`). |
| `addFirst(e)`                    | O(1) — prepend at head using `first` pointer. | O(1) — prepend at head; maintain circular links. |
| `add(index, e)`                  | O(n) — traversal + insertion. | O(n) — traversal + insertion; insertion logic similar but must maintain circular links. |
| `removeFirst()` / `removeLast()` | O(1) — direct removal at ends. | O(1) — direct removal; keep circular pointers consistent. |
| `remove(index)`                  | O(n) — traversal needed then unlink. | O(n) — traversal needed then unlink and update circular links. |
| `contains(e)` / `indexOf(e)`     | O(n) — linear search from head. | O(n) — linear search; ensure termination by limiting steps to `size` (avoid infinite loop). |

### Notes & Practical Differences
- **Wrap-around iteration:** Circular lists allow easy wrap-around traversal without extra bounds checks (useful for round-robin scheduling, buffers, or games). 
For example, rotating the list by one position can be done in **O(1)** by moving a single pointer reference to a different node in a circular list — 
an operation that is also O(1) conceptually on a doubly-linked list if you maintain an external cursor, but circular lists make rotation semantics explicit.
- **Termination safety:** When iterating a circular list, you must explicitly stop after `size` steps or detect revisiting the start node; otherwise traversal can become infinite.
- **Memory & GC:** Both variants have the same per-node memory footprint (object header + 3 references + item). Circular lists add no asymptotic memory overhead; they simply set `tail.next = head` and `head.prev = tail`.
- **When to prefer circular:** choose circular when your algorithm benefits from natural wrap-around or cheap rotations (e.g., round-robin task schedulers, ring buffers). 
For most general-purpose use, the standard doubly-linked layout (as in Java) is sufficient and simpler.

✅ **Summary:** The table shows that **asymptotic complexities remain the same** between doubly linked and 
circular doubly linked lists. 

The choice between them is driven by traversal semantics and algorithmic convenience rather than raw performance.

## Memory & GC Considerations

- Each node consumes extra memory (object header + 3 references + item).
- Larger overhead vs `ArrayList`’s contiguous storage.
- After removal, references are nulled to ensure garbage collection.

---

## Iterators

- Provides fail-fast iterators.
- `ListIterator` allows **bidirectional traversal** and modifications.
- Structural modification outside iterator → `ConcurrentModificationException`.

ASCII:

```
Start -> [A] -> [B] -> [C] -> End
```

---

## Concurrency

- Not synchronized by default.
- For thread safety: `Collections.synchronizedList(new LinkedList<>())`.
- For lock-free alternatives: use `ConcurrentLinkedDeque`, `ConcurrentLinkedQueue`.

---

## Practical Guidance

**Use when:**

- Frequent insertions/removals at head or tail.
- Heavy use of `ListIterator`.

**Avoid when:**

- Workload is random-access heavy (use `ArrayList`).
- Memory overhead is critical.

---

## Performance & Debugging Tips

- Avoid `get(i)` in loops → can lead to O(n^2).
- Use iterators or enhanced for-loops.
- Profile allocations when handling large lists.
- For concurrent scenarios, use specialized concurrent collections.

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

4. **Circular conceptual example:**

```
[A] ⇄ [B] ⇄ [C]
 ^                 |
 |_________________|
```

---

## FAQ

- **Q:** Does it implement `Deque`? → **Yes.**
- **Q:** Is it thread-safe? → **No.** External synchronization required.
- **Q:** Better than `ArrayList`? → **Depends on workload.**

---
