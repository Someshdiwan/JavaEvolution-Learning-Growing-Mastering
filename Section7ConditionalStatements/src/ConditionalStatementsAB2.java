public class ConditionalStatementsAB2 {
    public static void main(String[] args) {
     int a = 5, b =15, c=4;

     if(a>b && a<c)
     {
         System.out.println("Positive");
     }
     else if (b>c)
     {
         System.out.println("Negative");
     }
     else
     {
         System.out.println(c);
     }
    }
}