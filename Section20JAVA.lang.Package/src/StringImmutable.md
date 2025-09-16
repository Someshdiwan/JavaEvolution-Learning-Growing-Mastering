### 1. Class Declaration:

```java
public class StringImmutable {
```
Here, we declare a public class `StringImmutable`. This class will contain the methods we need for string operations.
The class name is chosen to reflect that we're dealing with string immutability (as strings in Java are immutable).

### 2. Main Method:

```java
public static void main(String[] args) {
```
This is the entry point of the Java program. It's a standard `main` method that Java looks for when you run the program.
The method is `static`, meaning you don't need to create an instance of the class to run it.

Inside this method, we will demonstrate how to use the two string manipulation methods (`appendNtimesUsingStringConcat`
and `appendNtimesUsingStringBuilder`).

### 3. **Creating an Instance of `StringImmutable`:**

```java
StringImmutable si = new StringImmutable();
```
Since the methods `appendNtimesUsingStringConcat` and `appendNtimesUsingStringBuilder` are not `static`,
we create an instance of `StringImmutable` (`si`) so we can call those methods on this instance.

### 4. **Using `appendNtimesUsingStringConcat`:**

```java
String result1 = si.appendNtimesUsingStringConcat('A', 5);
System.out.println(result1); // Output: AAAAA
```
Here, we call the method `appendNtimesUsingStringConcat` with two arguments:
- `'A'` (the character we want to append).
- `5` (the number of times we want to append the character to the string).

The method returns a string of `5` repeated `'A'` characters, and print it.

### 5. **Using `appendNtimesUsingStringBuilder`:**

```java
String result2 = si.appendNtimesUsingStringBuilder('B', 3);
System.out.println(result2); // Output: BBB
```
Similarly, we call `appendNtimesUsingStringBuilder`, passing:
- `'B'` (the character to append).
- `3` (the number of times to append it).

This method uses a `StringBuilder` (more efficient for repeated string concatenations) and returns a string of `3`
repeated `'B'` characters, which is printed.

### 6. **Method 1: `appendNtimesUsingStringConcat`:**

```java
public String appendNtimesUsingStringConcat(char c, int n) {
    String str = "";
    for (int i = 0; i < n; i++) {
        str += c;    // O(s) where s = length(str)
    }
    return str;
}
```
This method demonstrates string concatenation using the `+` operator, which is known to be inefficient for large numbers
of concatenations (due to the string immutability in Java).

- `String str = "";` initializes an empty string.
- The `for` loop runs `n` times (based on the number you pass).
- Each iteration appends the character `c` to `str` using `str += c;`.

In Java, this causes the string to be copied and a new one to be created every time because strings are **immutable** (cannot be changed). This operation takes longer as the string grows, resulting in an overall time complexity of `O(n^2)` (quadratic), where `n` is the number of characters you're concatenating.
- Finally, the method returns the concatenated string.

### 7. **Method 2: `appendNtimesUsingStringBuilder`:**

```java
public String appendNtimesUsingStringBuilder(char c, int n) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < n; i++) {
        sb.append(c);   // O(1)
    }
    return sb.toString();
}
```

This method demonstrates the more efficient approach using `StringBuilder` for string concatenation.
- `StringBuilder sb = new StringBuilder();` creates a `StringBuilder` object. Unlike strings, `StringBuilder` is
  mutable, meaning it can grow without creating new objects each time.
- The `for` loop runs `n` times and appends the character `c` to the `StringBuilder` with `sb.append(c);`.
  This operation is `O(1)` (constant time) because `StringBuilder` efficiently handles string growth internally.
- After the loop, `sb.toString()` converts the `StringBuilder` object into a regular string and returns it.

Using `StringBuilder` results in better performance with a time complexity of `O(n)` (linear time),
as it avoids the costly copying of strings during each iteration.

### 8. **Why These Methods Matter:**
- The first method (`appendNtimesUsingStringConcat`) uses a simple `+=` operator, but it has inefficient
  time complexity due to the immutability of strings in Java.
  It works fine for small `n` values, but for large `n`, the performance degrades drastically.
- The second method (`appendNtimesUsingStringBuilder`) uses `StringBuilder`, which is designed to be
  more efficient for such operations.

It performs better because `StringBuilder` is mutable and avoids the overhead of string concatenation.

### Summary:
- The code demonstrates two ways to build a string by repeating a character multiple times.
- The first approach uses string concatenation (`+=`), which has poor performance for large inputs.
- The second approach uses `StringBuilder`, which is optimized for this task and performs much better.
- We also included a simple example in the `main` method to show how both methods can be used.

String is immutable, meaning you can't change it once created.
When you concatenate two strings, it doesn’t simply add one string at the end of another;
it creates a new string (ouch).

Use a StringBuilder instead (or string.join() on a list in Python), which essentially is a List<Character>.
· String += c → linear
· StringBuilder.append(c) → constant
