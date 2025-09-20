package GenericExceptions;

// Custom Exception without generics
class CustomException2 extends Exception {
    private final int errorCode;

    public CustomException2(String message, int errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public int getErrorCode() {
        return errorCode;
    }
}

public class Main3 {
    public static void main(String[] args) {
        try {
            throwException();
        } catch (CustomException2 e) {
            System.out.println("Caught an exception with error code: " + e.getErrorCode());
        }
    }

    public static void throwException() throws CustomException2 {
        throw new CustomException2("Something went wrong", 1001);
    }
}
