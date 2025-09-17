import java.io.*;

class StudentFinal implements Serializable {
    private int rollno;
    private String name;
    private float avg;
    private String dept;
    public static int Data = 10;
    public transient int t;

    public StudentFinal() {

    }

    public StudentFinal(int r, String n, float a, String d) {
        rollno = r;
        name = n;
        avg = a;
        dept = d;
        Data = 500;
        t = 500;
    }

    public String toString() {
        return "\nStudent Details\n" +
                "\nRoll: " + rollno +
                "\nName: " + name +
                "\nAverage: " + avg +
                "\nDept: " + dept +
                "\nData: " + Data +
                "\nTransient: " + t + "\n";
    }
}

public class SerilalizationOutputStreamFinal {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("/Users/somesh/Java SE/JavaEvolution-Learning-Growing-Mastering/Section23JavaIOStreams/src/MyJAVA/Student3.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        StudentFinal s = new StudentFinal(10, "John", 89.9f, "CSE");
        oos.writeObject(s);
        fos.close();
        oos.close();
    }
}
