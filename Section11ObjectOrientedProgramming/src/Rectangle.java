class RectangleTest {
    public double lenght;
    public double bradth;

    public double Area() {
        return lenght * bradth;
    }

    public double perimeter() {
        return 2*(lenght+bradth);
    }

    public boolean isSquare() {
        return lenght == bradth;
    }
}

class Rectangle1 {
    public static void main(String[] args) {
        RectangleTest r = new RectangleTest();
        r.lenght=10.5;
        r.bradth=5.5;
        System.out.println("Area is: "+r.Area());
        System.out.println("Perimeter is: "+r.perimeter());
        System.out.println("isIt a Square: "+r.isSquare());
    }
}

/*
Encapsulation is one of the fundamental principles of Object-Oriented Programming (OOP).
It refers to hiding the internal details of an object and only exposing the necessary parts through well-defined methods.

In simple terms, encapsulation is the process of wrapping data (variables) and code (methods) together into a single
unit (class) while restricting direct access to the data.

Encapsulation in Java (OOP Concept)
Encapsulation is one of the fundamental principles of Object-Oriented Programming (OOP).
It refers to hiding the internal details of an object and only exposing the necessary parts through well-defined methods.

In simple terms, encapsulation is the process of wrapping data (variables) and code (methods) together into a single
unit (class) while restricting direct access to the data.

Key Features of Encapsulation:

Data Hiding:
The variables (fields) of a class are kept private to prevent direct access from outside the class.
Controlled Access:
The class provides getter and setter methods to access and modify private variables.
Improves Maintainability:
Code becomes easier to modify without affecting other parts of the program.
Enhances Security:
Prevents unauthorized access to data by restricting direct modification.
*/
