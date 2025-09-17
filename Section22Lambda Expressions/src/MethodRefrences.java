interface MyRefrences {
    public void display(String str);
}

public class MethodRefrences {
    public static void reverse(String str) {
        StringBuffer sb = new StringBuffer(str);
        sb.reverse(); //Reverse method inside string buffer.
        System.err.println(sb);
    }

    //If the method is not static.
    public void reverse1(String str) {
        StringBuffer sb = new StringBuffer(str);
        sb.reverse(); //Reverse method inside string buffer.
        System.err.println(sb);
    }

    public static void main(String[] args) {
        MethodRefrences MD = new MethodRefrences();

        MyRefrences R3 = MD::reverse1;

        MyRefrences R2=MethodRefrences::reverse;
        //This is a like Scope resolution in C++.

        MyRefrences R1=System.out::println;
        //System = Class and Out = is an object inside that class and println = is static.

        R1.display("Hello");
        R2.display("Hello");
        R3.display("Non Static Method");
    }
}
