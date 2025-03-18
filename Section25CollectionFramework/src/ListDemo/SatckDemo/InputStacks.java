package ListDemo.SatckDemo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class InputStacks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        System.out.print("Enter the number of elements to push: ");

        int n = sc.nextInt(); // Take the number of elements as input

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            stack.push(sc.nextInt()); // Push elements into the stack
        }

        System.out.println("\nStack contents: " + stack); // Print stack contents

        // Save stack data to a file
        saveStackToFile(stack, "C://Users//somes//Downloads//JAVA SE\\Section25CollectionFramework\\src\\ListDemo\\SatckDemo\\stack_data.txt");
        sc.close();
    }

    public static void saveStackToFile(Stack<Integer> stack, String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename)))
        {
            for (int item : stack)
            {
                writer.write(item + "\n"); // Write each stack element on a new line
            }
            System.out.println("Stack contents saved to " + filename);
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}