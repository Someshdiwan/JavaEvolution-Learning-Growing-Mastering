class student
{
    int studentID;
    String name;

    student(int studentID, String name)
    {
        this.studentID =studentID;
        this.name =name;
    }
   /*
    public String toString()
    {
        return studentID + " "+name;
    }
    */

    /*
    The toString method for class Object returns a string consisting of the name of the class of which the object
    is an instance, the at-sign character `@',
    and the unsigned hexadecimal representation of the hash code of the object.

    In other words, this method returns a string equal to the value of:

    getClass().getName() + '@' + Integer.toHexString(hashCode())

    The Objects.toIdentityString method returns the string for an object equal to the string that

    would be returned if neither the toString nor hashCode methods were overridden by the object's class.
    */
}
public class toStringMethod
{
    public static void main(String[] args)
    {
        student s = new student(1,"Bruce");
        student s2 = new student(2, "Jackie");

        System.out.println(s.toString());
        System.out.println(s2.toString());
    }
}
