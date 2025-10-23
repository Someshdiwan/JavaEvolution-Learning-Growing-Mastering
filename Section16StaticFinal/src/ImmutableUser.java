import java.util.Date;

// ImmutableUser class example. Demonstrates how to create an immutable class in Java.
public final class ImmutableUser {
    // 1. Make class final so it cannot be subclassed

    // 2. Make all fields private and final
    private final String username;
    private final Date dateOfBirth; // Date is mutable, so handle with care

    // Constructor performs defensive copying for mutable fields.
    public ImmutableUser(String username, Date dateOfBirth) {
        this.username = username;
        // 3. Perform a defensive copy for mutable objects
        this.dateOfBirth = new Date(dateOfBirth.getTime());
    }

    // 4. No setters — immutability maintained
    public String getUsername() {
        return username;
    }

    // 5. Return a copy instead of the original reference to prevent external modification.
    public Date getDateOfBirth() {
        return new Date(dateOfBirth.getTime());
    }

    public static void main(String[] args) {
        Date dob = new Date();
        ImmutableUser user = new ImmutableUser("Alice", dob);

        System.out.println("Username: " + user.getUsername());
        System.out.println("Date of Birth: " + user.getDateOfBirth());

        // Trying to modify original Date object won't affect the ImmutableUser
        dob.setTime(0);
        System.out.println("Modified Original Date: " + dob);
        System.out.println("Immutable User Date of Birth: " + user.getDateOfBirth());
    }
}
