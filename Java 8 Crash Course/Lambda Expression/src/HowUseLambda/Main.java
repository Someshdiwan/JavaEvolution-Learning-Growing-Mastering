package HowUseLambda;

public class Main {
    public static void main(String[] args) {
        Employee E = () -> "Software Engineer";
        //Functional interface acts as a data type or type for Lambda Expression.
        //Interface reference can be used to hold Lambda Expression.
        //Using Lambda expression, we don't need to use any separate implementation class.
        System.out.println(E.getName());

        Employee editor = () -> "Editor";
        System.out.println(editor.getName());
    }
}
