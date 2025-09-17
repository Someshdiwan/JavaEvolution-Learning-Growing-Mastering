// Abstract Parent class with an abstract method
abstract class Parent1 {
    // Abstract method (must be implemented by child classes)
    abstract public void display();
}

// Child class that overrides the abstract method
class Child2 extends Parent1 {
    @Override
    public void display() {
        System.out.println("Child2 implementation of display()");
    }
}

// Regular Parent class with a concrete method
class Parent {
    public void display() {
        System.out.println("Parent display method");
    }
}

// Child class that overrides the display() method
class Child extends Parent {
    @Override
    public void display() {
        System.out.println("Child implementation of display()");
    }
}

// Main class to test
public class Main {
    public static void main(String[] args) {
        // Test abstract inheritance
        Parent1 obj1 = new Child2();
        obj1.display();

        // Test regular inheritance
        Parent obj2 = new Child();
        obj2.display();
    }
}

/*
1. abstract class + abstract method
   - Abstract class ke andar abstract method declare hota hai (sirf signature, body nahi hoti).
   - Har child class ko us abstract method ko implement karna mandatory hota hai.
   - Example: Parent1 ke andar `display()` abstract hai → Child2 ne usko override karke body di.

2. @Override annotation
   - Jab child class parent class ke method ko override karti hai,
     tab @Override lagane se compiler check karega ki method correctly override hua hai ya nahi.
   - Agar signature galat likha, to compiler error dega.
   - Isse bugs avoid hote hain.

3. Concrete Parent class
   - Agar parent class ke method already defined hain (non-abstract),
     to child class us method ko override kar sakti hai.
   - Example: Parent class ka `display()` → Child ne apna `display()` implement kiya.

4. Polymorphism in action
   - `Parent1 obj1 = new Child2();` → Abstract parent reference, but runtime pe Child2 ka method call hoga.
   - `Parent obj2 = new Child();` → Normal parent reference, runtime pe Child ka method call hoga.
   - Ye hi runtime polymorphism / dynamic method dispatch ka example hai.

5. Key Point:
   - Abstract method override karna mandatory hai.
   - Normal method override karna optional hai (agar behavior change karna ho to).
   - @Override annotation lagana best practice hai.
*/
