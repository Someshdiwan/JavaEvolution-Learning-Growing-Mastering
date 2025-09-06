class Student11 {
    private final String id;
    // Constructor initializes 'id' with the provided value
    public Student11(String id) {
        this.id = id;
    }
    // Getter method for 'id', providing read-only access
    public String getId() {
        return id;
    }
}
public class GetAndSetAdvance {
    public static void main(String[] args) {
        Student11 student = new Student11("S123");

        System.out.println(student.getId());
        // student.setId("S456");
        // Error: No setter method available
    }
}

/*
It seems like you're demonstrating the concept of a read-only property in Java by creating a `GetAndSerAdvance`
class (though the class name seems to be a typo—it's referring to a "Student" in the constructor).

Here's a breakdown of your example and a few adjustments for clarity:

Key Concepts in Your Code:
1. Read-only Property: The `id` field is marked as `final`, meaning it cannot be modified after being initialized in the constructor.
The `getId()` method is the only way to access the `id` value, making it read-only.

2. No Setter Method**: By not providing a setter method, the value of `id` cannot be changed once it’s set in the constructor.

This is a way of ensuring immutability or protecting the integrity of the object's state.

Updated Example with Corrections:

Explanation:
- The `id` field: It's marked as `private final`, which means it’s initialized once and can't be modified after that.
- Constructor: The constructor takes a parameter `id` and assigns it to the field.
- Getter: The `getId()` method allows reading the value of `id` but prevents modification.
- No setter: There is no setter method like `setId()`, so the `id` is effectively read-only.

### Potential Use Case:
This design pattern is useful for creating immutable objects,
where the state of an object doesn't change after it’s created, ensuring its consistency throughout the program.

For example, it’s common in scenarios involving identifiers, configuration settings, or other values that should not
change once set.
*/
