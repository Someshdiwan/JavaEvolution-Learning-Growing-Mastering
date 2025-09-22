# Java 8 — Features (theory only)

lists the major features introduced in Java 8, with explanations of what they are and why they matter. 

---

## 1. Lambda Expressions
- **What:** Functions can be treated as first-class citizens and passed around as values.
- **Why:** Greatly reduces boilerplate of anonymous inner classes and enables functional-style programming.

---

## 2. Functional Interfaces
- **What:** Interfaces with exactly one abstract method, used as targets for lambda expressions.
- **Why:** Provide the bridge between Java’s object-oriented foundation and functional constructs.

---

## 3. Stream API
- **What:** A pipeline abstraction for processing collections with operations like map, filter, reduce, and collect.
- **Why:** Encourages declarative, composable programming and enables parallelism with minimal effort.

---

## 4. Default Methods in Interfaces
- **What:** Interfaces can now include method implementations using the `default` keyword.
- **Why:** Allows APIs to evolve without breaking existing implementations, critical for backward compatibility.

---

## 5. Static Methods in Interfaces
- **What:** Interfaces can define static methods directly.
- **Why:** Improves cohesion by allowing utility methods to reside alongside the interface itself.

---

## 6. `Optional<T>`
- **What:** A container object to represent optional values instead of using `null`.
- **Why:** Makes absence explicit and encourages safer handling of missing data.

---

## 7. New Date and Time API (`java.time`)
- **What:** A modern, immutable, and timezone-aware API for dates and times.
- **Why:** Fixes flaws in the old `Date` and `Calendar` classes, providing clearer and safer date handling.

---

## 8. CompletableFuture and Concurrency Updates
- **What:** An abstraction for asynchronous, non-blocking programming with composable futures.
- **Why:** Simplifies concurrency and asynchronous workflows, particularly with lambdas.

---

## 9. Nashorn JavaScript Engine
- **What:** A lightweight JavaScript engine for running scripts on the JVM.
- **Why:** Improves support for dynamic languages and polyglot applications.

---

## 10. Method References
- **What:** A shorthand notation to refer to methods or constructors directly.
- **Why:** Makes code more readable and expressive when using lambdas and functional interfaces.

---

## 11. New Collectors and Utilities
- **What:** Built-in collectors for common data transformations in streams (e.g., grouping, joining).
- **Why:** Provide ready-made, efficient operations for frequent collection patterns.

---

## 12. Parallel Streams
- **What:** Streams that can run operations in parallel with minimal syntax change.
- **Why:** Makes parallelism more accessible, though it must be used with care for correctness and performance.

---

## 13. PermGen Removal
- **What:** Permanent Generation memory space removed from JVM.
- **Why:** Simplifies memory management and reduces certain memory-related errors.

---

## 14. Other Enhancements
- Improved type inference.
- Repeating annotations (annotations can be applied multiple times).
- Base64 encoding/decoding utilities.
- Concurrency enhancements in the Fork/Join framework.

---

# Conclusion
Java 8 introduced foundational features that modernized the language. It blended object-oriented programming with 
functional paradigms, improved API evolution, and simplified parallelism — all while maintaining backward compatibility.
