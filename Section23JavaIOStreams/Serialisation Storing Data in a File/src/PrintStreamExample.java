import java.io.*;
class Student
{
    int rollno;
    String name;
    String dept;

   /* // Constructor to initialize Student object
    public Student(int rollno, String name, String dept)
    {
        this.rollno = rollno;
        this.name = name;
        this.dept = dept;
    }*/
}
class PrintStreamDemo
{
    public static void main(String[] args) throws Exception
    {
        FileOutputStream fos=new FileOutputStream("C:\\Users\\somes\\Downloads\\JAVA SE\\Section23JavaIOStreams\\Serialisation Storing Data in a File\\MyJAVA\\Student1.txt");
        PrintStream ps=new PrintStream(fos);

        Student s=new Student();
        s.rollno=10;
        s.name="John";
        s.dept="CSE";

        ps.println(s.rollno);
        ps.println(s.name);
        ps.println(s.dept);

        //ps=print stream. methods in println().
        //System.out.print ...Same as print-stream methods.

        //ps.println();
        //ps.print();

        ps.close();
        fos.close();
    }
}