@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
}

// Making the implementing class public so it can be used outside its package if needed.
class SumOperation implements MathOperation {

    @Override
    public int operate(int a, int b) {
        // Delegate to the add method.
        return add(a, b);
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }
}

public class LambdaExpressionHard {

    public static void main(String[] args) {
        // Lambda expression for addition (explicit parameter types can be omitted due to type inference)
        MathOperation addOperation = (a, b) -> a + b;

        // Lambda expression for subtraction
        MathOperation subtractOperation = (a, b) -> a - b;

        // Demonstration: use the lambda operations internally (results can be used further)
        int a = 10, b = 5;
        int resultAddition = addOperation.operate(a, b);
        int resultSubtraction = subtractOperation.operate(a, b);

        // Process the operations using a helper method with a private access modifier
        processOperation(a, b, addOperation);
        processOperation(a, b, subtractOperation);

        // Demonstration using the SumOperation class
        SumOperation sumOp = new SumOperation();
        int classAddition = sumOp.add(a, b);
        int classMultiplication = sumOp.multiply(a, b);

        // The results (resultAddition, resultSubtraction, classAddition, classMultiplication)
        // are now available for further processing, e.g., logging, storing, or other operations.
    }

    // Helper method changed to private to limit its access to within this class.
    private static void processOperation(int a, int b, MathOperation operation) {
        int result = operation.operate(a, b);
        // The result can be used internally without printing to the console.
    }
}
