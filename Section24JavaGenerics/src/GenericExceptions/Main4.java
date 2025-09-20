package GenericExceptions;

public class Main4 {
    public static <T extends Exception> void throwGenericException(Class<T> exceptionClass) throws T {
        try {
            throw exceptionClass.getDeclaredConstructor(String.class).newInstance("Generic Exception");
        } catch (Exception e) {
            throw (T) e;  // Casting to generic type.
        }
    }

    public static void main(String[] args) {
        try {
            throwGenericException(IllegalArgumentException.class);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
