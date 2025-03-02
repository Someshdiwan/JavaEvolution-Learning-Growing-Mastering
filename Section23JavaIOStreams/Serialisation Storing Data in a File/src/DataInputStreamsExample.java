// Serialisation: using DataInput and DataOutput Streams
import java.io.*;
import java.io.FileOutputStream;

public class DataInputStreamsExample {
    public static void main(String[] args)throws Exception {
        FileInputStream fis=new FileInputStream("C:\\Users\\somes\\Downloads\\JAVA SE\\Section23JavaIOStreams\\Serialisation Storing Data in a File\\MyJAVA\\Student2.txt");
        DataInputStream dis=new DataInputStream((fis));

        Student1 s=new Student1();
        s.rollno=dis.readInt();
        s.name=dis.readUTF();
        s.dept=dis.readUTF();
        s.avg=dis.readFloat();
        //Order Must be same. to read the data in the file using Input Stream

        System.out.println("Roll No: "+s.rollno);
        System.out.println("Name: "+s.name);
        System.out.println("Average: "+s.avg);
        System.out.println("Dept: "+s.dept);

        dis.close();
        dis.close();
    }
}
