public class DoWhileLoop1 {
    public static void main(String[] args) {
        // Example 1: A 'while' loop that never executes because the condition is false at the start
        /*int i = 100;
        while(i < 100)
        {
            System.out.println(i); // This line will never be reached
            i = i * 2;
        }*/

        // Example 2: A 'do-while' loop that executes at least once even if the condition is false
        /*int i = 100;
        do
        {
            System.out.println(i); // This will print once even though i is not < 100
            i = i * 2;
        }
        while(i < 100);*/

        // Example 3: Infinite loop using while(true) and byte data type overflow
        byte i = 1; // byte range is -128 to 127
        /*while(true)
        {
            System.out.println(i); // Will eventually overflow after reaching 127 to -128
            i++;
        }*/

        // Example 4: Simple 'if-else' structure where condition is always true
        if(true)
        {
            System.out.println(i); // Prints 1
            i++; // i becomes 2 (not printed)
        }
        else
            System.out.println("Bye"); // This will never execute due to 'if(true)'
    }
}
