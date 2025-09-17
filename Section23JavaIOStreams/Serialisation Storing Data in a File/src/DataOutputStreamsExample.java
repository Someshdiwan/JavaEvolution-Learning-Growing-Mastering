// Serialisation: using DataInput and DataOutput Streams
import java.io.*;
import java.io.FileOutputStream;

class Student11 {
    int rollno;
    String name;
    float avg;
    String dept;
}

public class DataOutputStreamsExample {
    public static void main(String[] args)throws Exception {
        FileOutputStream fos=new FileOutputStream("/Users/somesh/Java SE/JavaEvolution-Learning-Growing-Mastering/Section23JavaIOStreams/src/MyJAVA/Student1.txt");
        DataOutputStream dos=new DataOutputStream(fos);

        Student1 s1=new Student1();
        s1.rollno=10;
        s1.name="John";
        s1.dept="CSE";
        s1.avg=75.9f;
        dos.writeInt(s1.rollno);
        //Writes a string to the underlying output stream using modified UTF-8 encoding in a machine-independent manner.

        dos.writeUTF(s1.name);
        dos.writeUTF(s1.dept);
        dos.writeFloat(s1.avg);

        dos.close();
        fos.close();
        //output as Binary File.
    }
}
