import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.ArrayList;

public class ReadCitiesFile {
    // Method to read and print the contents of a file
    public static void readFile(String filePath) {
        try {
            // Read all lines from the file into an ArrayList
            ArrayList<String> lines = new ArrayList<>(Files.readAllLines(Paths.get(filePath)));

            // Print each line using a for loop
            for (int i = 0; i < lines.size(); i++) {
                System.out.println(lines.get(i));
            }

        } catch (IOException e) {
            // Handling file-related exceptions
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        String filePath = "/Users/somesh/Java SE/JavaEvolution-Learning-Growing-Mastering/Section23JavaIOStreams/src/MyJAVA/cities.txt";  // File path to be read
        readFile(filePath);  // Calling the readFile method
    }
}
