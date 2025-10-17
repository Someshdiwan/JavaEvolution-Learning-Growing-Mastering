import java.io.RandomAccessFile;
import java.io.IOException;

class ReadingSpecificByte {
    // Function to read a specific byte from the file
    public static char readSpecificByte(String filepath, int position) {
        try {

            RandomAccessFile file = new RandomAccessFile(filepath, "r");
            // Directly move to the specified position
            file.seek(position);

            // Read and display the byte at the position
            byte data = file.readByte();

            return (char)data;  // data is in integer/number form, so here we are converting it to character
        } catch (IOException e) {
            return '0';
        }
    }

    public static void main(String[] args) {
        String filepath = "/Users/somesh/Java SE/JavaEvolution-Learning-Growing-Mastering/Section23JavaIOStreams/src/MyJAVA/Data.txt"; // Ensure the file exists
        int position = 0;               // Position of the byte to read (1-based indexing)

        // Call the function to read the specific byte
        System.out.println(readSpecificByte(filepath, position));
    }
}
