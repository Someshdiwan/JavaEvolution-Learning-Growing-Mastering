package GenericExceptions;
/*
class CustomException<T> extends Exception {
    private final T errorCode;

    public CustomException(String message, T errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public T getErrorCode() {
        return errorCode;
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            throwException();
        } catch (CustomException<Integer> e) {
            System.out.println("Caught an exception with error code: " + e.getErrorCode());
        }
    }

    public static void throwException() throws CustomException<Integer> {
        throw new CustomException<>("Something went wrong", 1001);
    }
}

*/

//In java generic custom exception is not allowed.
