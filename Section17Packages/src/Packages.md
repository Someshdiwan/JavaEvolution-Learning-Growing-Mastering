# Java Packages

A **package** in Java is a way to group related classes, interfaces, and sub-packages.  
It helps in **organizing code**, **avoiding name conflicts**, and **controlling access**.

## Types of Packages
1. **Built-in packages** → Provided by Java (e.g., `java.util`, `java.io`, `java.sql`).
2. **User-defined packages** → Created by developers to organize their own code.

## How to Create a Package

```java
// File: MyClass.java
package mypack;

public class MyClass {
    public void show() {
        System.out.println("Hello from mypack!");
    }
}
```

Compile with:

javac -d . MyClass.java

Run with:

java mypack.MyClass

Benefits
	•	Better code organization
	•	Reusability of classes
	•	Encapsulation and access control
	•	Avoids class name collisions
