import java.io.*;

class Student1 {
    int rollno;
    String name;
    String dept;
    float avg;
}

public class DataInputStreamsExample2 {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("/Users/somesh/Java SE/JavaEvolution-Learning-Growing-Mastering/Section23JavaIOStreams/src/MyJAVA/Student2.txt");
        DataInputStream dis = new DataInputStream(fis);

        // Serialisation: using DataInput and DataOutput Streams.

        Student1 s = new Student1();

        s.rollno = dis.readInt();
        s.name = dis.readUTF();
        s.dept = dis.readUTF();
        s.avg = dis.readFloat();

        // Order Must be same. to read the data in the file using Input Stream.

        System.out.println("Roll No: " + s.rollno);
        System.out.println("Name: " + s.name);
        System.out.println("Average: " + s.avg);
        System.out.println("Dept: " + s.dept);

        dis.close();
    }
}
