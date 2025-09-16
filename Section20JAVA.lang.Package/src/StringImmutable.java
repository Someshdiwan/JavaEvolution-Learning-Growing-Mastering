public class StringImmutable {
    public static void main(String[] args) {
        StringImmutable si = new StringImmutable();

        String result1 = si.appendNtimesUsingStringConcat('A', 5);

        System.out.println(result1); // Output: AAAAA

        String result2 = si.appendNtimesUsingStringBuilder('B', 3);
        System.out.println(result2); // Output: BBB
    }

    // Inefficient: O(n^2) complexity.
    // Har iteration me new String banega (String immutable hoti hai).
    // str += c ka matlab hai ek naya object banta hai aur purane characters copy hote hain.
    public String appendNtimesUsingStringConcat(char c, int n) {
        String str = "";

        for (int i = 0; i < n; i++) {
            str += c;    // O(s) where s = length(str)
        }
        return str;   // Return the result as a String
    }

    // Efficient: O(n) complexity.
    // StringBuilder mutable hota hai → har append O(1) time me hota hai.
    public String appendNtimesUsingStringBuilder(char c, int n) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            sb.append(c);   // O(1)
        }
        return sb.toString();
    }
}

/*
1. String immutable hoti hai → har concat new object banata hai.
   - Complexity: O(n^2) when repeatedly appending in loop.
   - Example: "A" + "A" + "A"... har step me purani string copy hoti hai.

2. StringBuilder mutable hai → same buffer ke andar character append hote hain.
   - Complexity: O(n).
   - Isliye loops me zyada fast hota hai.

3. StringBuffer bhi similar hai but thread-safe (synchronized), thoda slow hota hai.

4. General rule:
   - Agar string constant chhoti hai → String okay hai.
   - Agar loop ke andar append karna hai (dynamic building) → StringBuilder best hai.
*/
