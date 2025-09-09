public class MethofAB1 {
    static int max(int x, int y) //Return type int.
    {
        if(x>y)
            return x;
        else
            return y;
    }
    public static void main(String[] args) {
        int a=10,b=15;
        //Object of Class.
        MethofAB1 mp = new MethofAB1();
        System.out.println(mp.max(a,b)); //Just like obj of string we do it in previous
    }
}
