class ThrowThrowsDemo
{
    static int meth1()
    {
        return 10 / 0;
    }

    static void meth2()
    {
        meth2();
    }

    static void meth3()
    {
        meth3();
    }

    public static class TryCatchBasic {
        public static void main(String[] args) {
            try
            {
                meth3();
            }
            catch (Throwable e)
            {
                System.out.println("Caught: "+e);
            }
        }
    }
}

/*
Classes inside another class should be static if accessed in static main.
Handle base cases in recursive methods to avoid infinite loops.
ArithmeticException is unchecked, so it should be handled properly if meth1() is used.
*/
