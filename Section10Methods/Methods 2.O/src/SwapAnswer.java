public class SwapAnswer {
    public static void main(String[] args) {
        int[] nums = {10, 20};
        // use array so changes reflect
        swap(nums);
        System.out.println(nums[0] + " " + nums[1]);

        String name = "Swapping numbers";
        name = changeName(name);
        System.out.println(name);
    }

    // swap numbers method
    static void swap(int[] arr) {
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
        // this change will be valid since array is mutable
    }

    // change name method
    static String changeName(String naam) {
        return "Declaring a method(outside the main method) and called this method inside the main method.";
    }
}

/*
🔹 Why numbers don’t swap:
In Java, method parameters are always passed by value.
When you call swap(a, b), the values 10 and 20 are copied into num1 and num2.
Inside the method, num1 and num2 do swap, but those are just local copies.
The original a and b in main remain unchanged.

👉 That’s why after the swap call, printing a and b still shows 10 20.

🔹 Why name doesn’t change
A String in Java is an immutable object (it can’t be modified once created).
When you pass name to changeName, a copy of the reference is passed.
Inside the method, you reassign naam to point to a new string, but this doesn’t affect the original name variable in main.

So after the method call, name still points to "Swapping numbers".

👉 That’s why printing name still shows "Swapping numbers".

📌 Summary in one line:
Primitives like int only swap local copies, and String can’t be changed because it’s immutable and reassigning
the reference inside a method doesn’t affect the original.
*/
