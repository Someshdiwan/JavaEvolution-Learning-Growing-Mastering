class RegularExpressionChallange3 {
    public static void main(String[] args) {
        String str = "a!B@c#1$2%3";

        System.out.println(str.replaceAll("[^a-zA-Z0-9]", " "));
    }
}

/*
Remove Special Characters from a String

Logic: String str = "a!B@c#1$2%3";
Only alphabets and capital letters and numbers are allowed
method called str.replace() and str.replaceAll()
what is allowed is [^a-zA-Z0-9] use symbol not ^ if not among this.
*/
