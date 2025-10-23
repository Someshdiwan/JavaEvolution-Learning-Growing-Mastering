class StaticMember {
    // Static variable
    static int count = 0;  // Static variable initialized to 0

    // Static method
    public static void increment() {
        count++;  // Static method to increment the count
    }

    // Static block
    static {
        count = 10;  // Static block initializes the static variable 'count' to 10
    }

    public static void main(String[] args) {
        // Calling the static method
        StaticMember.increment();  // Calling the increment method to increase count by 1

        // Printing the static variable
        System.out.println("Count: " + count);  // Prints the value of count, which is now 11
    }
}
