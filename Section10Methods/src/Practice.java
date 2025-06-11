class Practice
{
    public static void main(String[] args)
    {
        A a=new A();
        a.add(5,7);
        a.mul();
    }
}
class A
{
    int x,y,sum,res;
    void add(int x,int y)
    {
        this.x=x;
        this.y=y;
        sum=x+y;
        System.out.println(sum);
    }
    void mul()
    {
        res=x*y;
        System.out.println(res);
    }
}