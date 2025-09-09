public class VariableArgumentsForStrings {
    static void showList(int start, String ...S)
    {
        for(int i=0; i<S.length;i++) {
            System.out.println(start+ /*i+1+*/ ". "+S[i]);
            start++;
        }
    }
    public static void main(String... args) {
        showList(5,"John","Smith","Ajay","Ahmed","Mark","List of name show you variable arguments");
    }
}
