public class LangDemo {
    public static void main(String[] args) {
        Object o1=new Object();
        System.out.println(o1);
        //It will call Two String Method of an object.

        System.out.println(o1.toString());

        /*Object o2=new Object();*/
        /*System.out.println(o1.equals(o2));*/

        //It will return true if the both the reference hold the same object
        Object o2=o1;

        //HashCode Unique Number of object given to this oneby JAVA.
        System.out.println(o1.hashCode());
    }
}
