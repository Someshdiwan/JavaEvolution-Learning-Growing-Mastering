import java.io.FileOutputStream;
public class Demo5 {
    public static void main(String args[]) {
        try {
            FileOutputStream fout=new FileOutputStream("/Users/somesh/Java SE/JavaEvolution-Learning-Growing-Mastering/Section23JavaIOStreams/DemoCodes/TXT Files/Demo5.txt");

            String s="converting string into byte array";

            byte b[]=s.getBytes();

            fout.write(b);
            fout.close();

            System.out.println("success");
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}

/*
getBytes --> Encodes this String into a sequence of bytes using the default charset, storing the result into a new byte array.

This program writes the full string "Welcome to JAVA" into a file named myFile.txt using FileOutputStream.
The string is converted into a byte array using getBytes().
The entire byte array is written to the file. Displays "success" when done.
*/
