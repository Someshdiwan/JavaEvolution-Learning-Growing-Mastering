public class ForLoopAB4 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        // Using a for-each loop to print elements
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}

/*
The for-each loop (also known as the enhanced for loop) in Java is used to traverse elements of arrays or collections in a simplified and readable way.
It eliminates the need for managing an index manually and works well when you just need to access each element, rather than modifying the array or list.

for (dataType element : arrayOrCollection) {
         Body of the loop
         You can use 'element' directly in the loop
        }

*/