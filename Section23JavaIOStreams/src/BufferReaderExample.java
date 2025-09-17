import java.io.BufferedReader;
import java.io.FileReader;

public class BufferReaderExample {
    public static void main(String[] args)throws Exception {
        // Creating a FileReader to read the file character by character.
        FileReader fis = new FileReader("/Users/somesh/Java SE/JavaEvolution-Learning-Growing-Mastering/Section23JavaIOStreams/src/MyJAVA/BufferTest.txt");

        BufferedReader bis = new BufferedReader(fis);
        // BufferedReader is used to read text efficiently from a character-based input stream.

        System.out.print(( char ) bis.read());
        System.out.print(( char ) bis.read());
        System.out.print(( char ) bis.read());
        bis.mark(10);

        System.out.print(( char ) bis.read());
        System.out.print(( char ) bis.read());
        bis.reset();

        System.out.print(( char ) bis.read());
        System.out.print(( char ) bis.read());

        // Reading and printing the remaining line from the file.
        System.out.println("String "+bis.readLine());

        bis.close();
    }
}
