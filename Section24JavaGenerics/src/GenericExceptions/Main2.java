package GenericExceptions;

/*
class DetailedException<T> extends Exception {
    private T details;

    public DetailedException(String message, T details) {
        super(message);
        this.details = details;
    }

    public T getDetails() {
        return details;
    }
}

public class Main2 {
    public static void main(String[] args) {
        try {
            throw new DetailedException<Integer>("An error occurred", 404);
        } catch (DetailedException<Integer> e) {
            System.out.println(e.getMessage());
            System.out.println(e.getDetails());
        }
    }
}
*/
