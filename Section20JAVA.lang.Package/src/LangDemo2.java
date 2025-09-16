/*  Prove that every class is inheriting directly or indirectly from every other class. That is Object Class.
*/

class MyObject {
    public String toString() {
        return "My String";
    }

    public int hashCode() {
        return 100;
    }

    public boolean equals(Object o) {
        return this.hashCode()==o.hashCode();
    }
    /*public void wait() we can not override this methods beacuse it show final */
}

/*class MyObject2 extends MyObject
{

}*/

public class LangDemo2 {
    public static void main(String[] args) {
        /*
        MyObject2 o1=new MyObject2();
        */

        MyObject o2=new MyObject();

        /* System.out.println(o1); */

        System.out.println(o2);

        /* MyObject2 o3=new MyObject2(); */
    }
}
