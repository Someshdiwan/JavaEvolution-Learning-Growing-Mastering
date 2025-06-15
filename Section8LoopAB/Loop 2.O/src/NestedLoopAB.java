public class NestedLoopAB {
    public static void main(String[] args) {
        for(int i =1; i<=5; i++)
        {
            for(int j=0; j<=5; j++)
            {
                System.out.print("("+i+","+j+") ");
            }
            System.out.println(" "); //Print on new line hence println();
        }
    }
}
