References vs Objects vs Instances, and then static vs instance members (variables and methods).

⸻

References vs Objects vs Instances:

Person p1 = new Person();

	•	p1 → This is a reference variable.

It lives on the stack (usually) and holds the memory address of the object created. It’s like the remote control to your TV.
•	new Person() → This creates an object in heap memory.
The object contains all the instance variables defined in the Person class. Each new keyword call makes a brand new object.
•	Instance → An instance just means “an object of a class.” When we say “p1 is an instance of Person,” we mean it’s one 
specific realization of the class Person.
•	Class → Think blueprint. Objects are the houses built from the blueprint.

A single class can be used to create many instances (objects), each with its own state.

Example:

Person p1 = new Person("Alice");
Person p2 = new Person("Bob");

	•	Both p1 and p2 are references.
	•	Each reference points to its own object instance (Alice and Bob).
	•	Both objects come from the same class definition.

⸻

Static Variables (a.k.a. Class Variables)

class Counter {
static int count = 0;
Counter() {
count++;
}
}

	•	Shared across all instances. No matter how many objects you create, only one copy of count exists.
	•	Accessed via Counter.count, though you can technically use obj.count (not recommended).
	•	They exist in method area memory (class-level memory), not per object.

Use Cases:
1.	Counters / tracking number of objects
2.	Unique IDs
3.	Constants (like Math.PI)
4.	Shared resources (like a cached configuration or a singleton instance)

⸻

Instance Variables
•	Declared without static.
•	Each object (instance) gets its own separate copy.
•	Changing one instance variable doesn’t affect another object.

Example:

class Person {
String name; // instance variable
static int population = 0; // class variable

    Person(String name) {
        this.name = name;
        population++;
    }
}

	•	Every Person has its own name.
	•	All Person objects share the population count.

⸻

Static Methods vs Instance Methods:

Static Methods
•	Declared with static.
•	Belong to the class itself, not any instance.
•	Can be called with the class name:
Math.sqrt(25);
•	Restrictions:
•	Cannot access instance variables directly (they don’t know which object you mean).
•	Cannot use this or super (no current object context).
•	They can only:
•	Use static variables and call static methods directly.
•	Work with instance stuff only if you pass an object reference to them.

Example:

class MathUtil {
static int square(int x) {
return x * x;
}
}

Instance Methods
•	Belong to an object.
•	Require an instance to call:
p1.sayHello();
•	Can access:
•	Both instance variables (through this)
•	And static variables (since they’re global to the class)

⸻
Key Idea
•	Static = belongs to the class.
•	Instance = belongs to the object.

Or:
The blueprint (class) has some things that are universal (static), and others that are unique to each house (instance).

⸻
