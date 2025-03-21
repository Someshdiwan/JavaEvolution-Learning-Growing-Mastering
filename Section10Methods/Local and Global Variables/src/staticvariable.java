public class staticvariable {
        static int a=10;
        void fun()
        {
            int b=10;
            System.out.println(a+" "+b);
            ++a; ++b;
        }
        public static void main(String[] args)
        {
            staticvariable s = new staticvariable();
            s.fun();
            s.fun();
        }
}