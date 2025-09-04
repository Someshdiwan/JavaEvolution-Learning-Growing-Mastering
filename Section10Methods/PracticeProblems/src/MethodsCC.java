class MethodsCC {
    public static void squareAndCube(int x) {
        System.out.println(x * x);
        System.out.println(x * x * x);
    }
    public static void main (String[] args) {
        int a = 2;
        int b = 3;
        int c = 4;
        squareAndCube(a);
        squareAndCube(b);
        squareAndCube(c);
    }
}

/* 
why we use x in System.out.println.

In the method squareAndCube(int x), the x is a parameter.
It acts as a placeholder for the value that you pass to the method when you call it.

How it works:
When you call squareAndCube(a), the value of a (which is 2) is passed to the method.
Inside the method, x takes the value of a, so x = 2.
Now, when you write System.out.println(x * x), it calculates 2 * 2 and prints 4.
Similarly, System.out.println(x * x * x) calculates 2 * 2 * 2 and prints 8.

Why use x?
x is a variable that holds the value passed to the method.
It allows the method to work with any value you pass, making the method reusable.

For example, when you call squareAndCube(b), x becomes 3, and when you call squareAndCube(c), x becomes 4.

Key Takeaway:
x is just a placeholder for the value you pass to the method.
It makes the method flexible and reusable for different inputs.

Methods improve code in several ways:

Reusability: You can write a method once and call it multiple times, avoiding code duplication.
For example, in the given problem, squareAndCube is called three times instead of writing the same logic three times.
Modularity: Methods break down complex tasks into smaller, manageable parts.
This makes the code easier to understand, debug, and maintain.

Readability: By giving meaningful names to methods, your code becomes more readable.

For example, squareAndCube clearly indicates what the method does.

Maintainability: If you need to change the logic, you only need to update it in one place (the method),
rather than in multiple places.
*/
