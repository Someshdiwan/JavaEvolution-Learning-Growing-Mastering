import java.io.*;

public class SerilalizationIutputStreamFinal {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("C:\\Users\\somes\\Downloads\\JAVA SE\\Section23JavaIOStreams\\Serialisation Storing Data in a File\\MyJAVA\\Student3.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        StudentFinal s = ( StudentFinal ) ois.readObject();

        System.out.println(s);
        fis.close();
        ois.close();
    }
}