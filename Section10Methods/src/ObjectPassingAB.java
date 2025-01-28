public class ObjectPassingAB
{
    static void change(int X[], int index, int value)
    {
        X[index]=value;
    }

    static void change2(int x, int value)
    {
        x=value;
    }
    public static void main(String[] args)
    {
        int A[]={2,4,6,8,10};
        change(A,2,20);

        for(int x:A) //Acessing all elements of A and print it.
        {
            System.out.println(x);
        }
    }
}