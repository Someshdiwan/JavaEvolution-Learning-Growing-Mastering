import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.List;

public class FindLongestCommentLength {
    // Method to find length of longest comment
    public static int findLongestComment(String filePath) {
        try {
            // Read all lines from the file
            List<String> lines = Files.readAllLines(Paths.get(filePath));

            int maxLength = 0;

            // Loop through each line to find the longest
            for (int i = 0; i < lines.size(); i++) {
                int length = lines.get(i).length();
                if (length > maxLength) {
                    maxLength = length;
                }
            }

            return maxLength;

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            return -1;
        }
    }
    public static void main(String[] args) {
        String filePath = "";
        System.out.println(findLongestComment(filePath));
    }
}
