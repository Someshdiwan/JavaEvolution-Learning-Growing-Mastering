public class GenericDemo {
    public static void main(String[] args) {
       /* Object obj = new String("Hello");

        String str = (String)obj;*/

        Object obj[]=new Object[3];
        //Capable to store any type of object.
        obj[0]="hi";
        obj[1]="bye";

        String s[]=new String[3];
        //Store only strings

        //obj[2]=new Integer(10);
        String str;

        for(int i=0;i<3;i++)
        {
            str=(String)obj[i];
            System.out.println(str);
        }
    }
}
