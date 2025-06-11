import java.io.*;

class PrintInputStreamExample {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("C:\\Users\\somes\\Downloads\\JAVA SE\\Section23JavaIOStreams\\Serialisation Storing Data in a File\\MyJAVA\\Student1.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));

        // Creating a Student object
        Student s = new Student();

        // Reading data from file
        s.rollno = Integer.parseInt(br.readLine()); // Reading roll number
        s.name = br.readLine(); // Reading name
        s.dept = br.readLine(); // Reading department

        // Printing Student details
        System.out.println("Roll No: " + s.rollno);
        System.out.println("Name: " + s.name);
        System.out.println("Dept: " + s.dept);

        // Closing the reader
        br.close();
    }
}