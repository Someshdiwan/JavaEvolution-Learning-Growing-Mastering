package Package2;

import java.util.StringTokenizer;

public class ToenizerDemo {
    public static void main(String[] args) {
        // Example 1: Using semicolon (;) as delimiter between pairs
        // String data = "name=Vijay; address=delhi; country=india; dept=cse";

        // Example 2: Using newline (\n) as delimiter between pairs
        String data = "name=Vijay\naddress=delhi\ncountry=india\ndept=cse";

        // Example 3: Using space as a delimiter between pairs
        // String data = "name=Vijay address=delhi country=india dept=cse";

        // Creating StringTokenizer
        // Example A: Using "=" and ";" as delimiters
        // StringTokenizer stk = new StringTokenizer(data, "=;");

        // Example B: Using "=" only as a delimiter
        StringTokenizer stk = new StringTokenizer(data, "=");

        // Note: In Example 2, "\n" also acts as a delimiter automatically
        // because StringTokenizer treats whitespace characters (space, tab, newline) as default delimiters
        // unless explicitly told otherwise.

        // Extracting tokens
        String s;
        while (stk.hasMoreTokens()) {
            s = stk.nextToken(); // fetches next token
            System.out.println(s);
        }
    }
}

/*
1. Input String
   - The string contains structured key-value pairs separated by delimiters.
   - Example: "name=Vijay; address=delhi; country=india; dept=cse"

2. Delimiters
   - Characters like '=', ';', '\n', or space are used to break the string.
   - "=" → separates keys from values.
   - ";" → separates multiple key-value pairs.
   - "\n" → separates pairs by newlines.
   - If no delimiters are explicitly given, StringTokenizer uses default (whitespace).

3. StringTokenizer Object
   - Constructor: StringTokenizer(String str, String delimiters)
   - It scans the string and splits it into tokens based on the provided delimiters.

4. Methods
   - hasMoreTokens() → returns true if more tokens are available.
   - nextToken() → returns the next token.
   - countTokens() → returns number of tokens left.

5. Example Outputs
   - For data = "name=Vijay; address=delhi"
   - With delimiters "=;" → tokens: [name, Vijay, address, delhi]
   - With delimiter "=" → tokens: [name, Vijay; address, delhi]
     (because ";" is treated as part of value if not given as delimiter)

6. Important Notes
   - Tokens are sequentially extracted; order matters.
   - Delimiters themselves are not returned (unless explicitly configured).
   - StringTokenizer is simple but considered **legacy** (since JDK 1.0).
   - Modern alternatives: `String.split(regex)` or `Scanner`.
*/
