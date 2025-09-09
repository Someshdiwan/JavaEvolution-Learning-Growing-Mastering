public class MethodOverloading {
    static int max(byte  x, int y) {
        return x>y ? x:y;
        //return, if x is greater than y then, return x otherwise return y.
    }
    static float max(float x, float y) {
        if(x>y)
            return x;
        else
            return y;
    }
    public static void main(String[] args) {
        byte a=10,b=5;
        System.out.println(max(a,b));
        System.out.println(max(10.9f,5));
    }
}
