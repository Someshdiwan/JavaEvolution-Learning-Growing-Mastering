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

/*
1. @FunctionalInterface:
   - Ek interface jisme sirf ek abstract method hota hai.
   - `MathOperation` ke andar `operate(int a, int b)` method define hai.
   - Isko lambda expressions ke saath use kiya ja sakta hai.

2. SumOperation Class:
   - `implements MathOperation` → means interface ka contract follow karna.
   - `operate(a, b)` ko override kiya aur andar `add()` method ko call karaya.
   - Additional methods bhi banaye:
     ✔ add(a, b) → numbers ko add karega.
     ✔ multiply(a, b) → numbers ko multiply karega.

3. Lambda Expressions:
   - `MathOperation addOperation = (a, b) -> a + b;`
     → addition ke liye ek inline implementation (lambda).
   - `MathOperation subtractOperation = (a, b) -> a - b;`
     → subtraction ke liye lambda.

   ✔ Lambdas = concise alternative instead of creating full classes.

4. Main Logic:
   - a = 10, b = 5
   - `addOperation.operate(a, b)` → 15
   - `subtractOperation.operate(a, b)` → 5
   - `SumOperation sumOp.add(a, b)` → 15
   - `SumOperation sumOp.multiply(a, b)` → 50

5. processOperation Method:
   - Ek helper method jo `MathOperation` ko input leta hai.
   - Isme operation performs hota hai aur result internally handle hota hai.
   - Private rakha hai, kyunki sirf is class ke andar kaam karna hai.

✔ FunctionalInterface = single abstract method (SAM).
✔ Lambda = short & clean way to implement functional interfaces.
✔ `SumOperation` class → traditional way, Lambda → modern concise way.
✔ Helper method `processOperation()` dikhata hai kaise reusable lambdas pass karke operations handle karte ho.
✔ Ye program ek mini calculator example hai using both OOP (class) and FP (lambda).
*/
