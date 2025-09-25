public class HashMapPractice2 {
    public static void main(String[] args) {
        System.out.println(simpleHash("ABC"));
        System.out.println(simpleHash("CBA"));
    }

    public static int simpleHash(String key) {
        int sum = 0;
        for (char c : key.toCharArray()) // Convert string to a char array and iterate
        {
            sum += (int) c; // Sum ASCII values of characters
        }
        return sum % 10; // Return sum modulo 10 as the hash
    }
}

// "ABC" ? ASCII values: A (65) + B (66) + C (67) = 198. 198 % 10 = 8
// "CBA" ? ASCII values: C (67) + B (66) + A (65) = 198. 198 % 10 = 8
