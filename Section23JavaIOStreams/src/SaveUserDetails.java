import java.io.FileWriter;
import java.io.IOException;

class SaveUserDetails {
    public static void saveUserDetails(String filepath, String content){
        try {
            // Create a FileWriter object for writing to a file
            FileWriter writer = new FileWriter(filepath);

            // Write text to the file
            writer.write(content);

            // Close the writer to save changes
            writer.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }

    public static void main (String[] args) throws java.lang.Exception {
        String content = "{name : Test, age: 45, city: London}";
        String filepath = "/Users/somesh/Java SE/JavaEvolution-Learning-Growing-Mastering/Section23JavaIOStreams/src/MyJAVA/userDetails.txt";
        saveUserDetails(filepath, content);
    }
}
