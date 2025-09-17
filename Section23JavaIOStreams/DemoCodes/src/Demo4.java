import java.io.FileOutputStream;
import java.io.IOException;

class Demo4 {
    public static void main(String[] args) {
        try {
            FileOutputStream fout = new FileOutputStream("/Users/somesh/Java SE/JavaEvolution-Learning-Growing-Mastering/Section23JavaIOStreams/DemoCodes/TXT Files/Demo4.txt");

            String myText = "Chill bro don't worry, work your ass off.";

            byte[] myData = myText.getBytes();

            System.out.println("Data Written");

            fout.write(myData);

            //fout.write(65); //Override the ASCII Value
            //Writes 'A' into the file. ASCII Value.
            fout.close();
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }
}

/*
This program writes data into a file named myFile.txt using FileOutputStream.
- It first prepares a string "Welcome to JAVA", converts it to bytes
(though it doesn’t actually write it), and writes only a single byte 65 ('A' character) into the file.
- It uses streaming (byte-by-byte) to write data.

- fout is a reference to the FileOutputStream object.

FileOutputStream → The class (type).
new FileOutputStream(...) → Creates a new object in memory.
So fout is not the object itself—it's like a remote control or pointer that lets you
interact with the FileOutputStream object created by new.

Extra Quick Notes:
- getBytes() converts the string into a byte array (but here it's not actually used to write).
- fout.write(65) writes the ASCII character 'A' into myFile.txt.
- Yes, fout is a reference (not the actual object itself).

This how we use FileOutputstream class to write the data into file,
by how you write data by streaming the data and how streaming a data by converting into bytes
This is for write data into file using output stream.
*/
