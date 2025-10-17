import java.io.FileWriter;
import java.io.IOException;

class AppendLogsToFile {
    public static void addLogsToFile(String filepath, String log1, String log2){
        try {
            // Create a FileWriter in append mode
            FileWriter writer = new FileWriter(filepath, true);

            // Append text to the file
            writer.write(log1 + "\n");  // Write log1 and move to new line
            writer.write(log2 + "\n");  // Write log2 and move to new line

            // Close the writer to save changes
            writer.close();
        } catch (IOException e) {
            System.out.println("An error occurred");
        }
    }
    public static void main (String[] args) throws java.lang.Exception
    {
        String filepath = "/Users/somesh/Java SE/JavaEvolution-Learning-Growing-Mastering/Section23JavaIOStreams/src/MyJAVA/logs.txt";
        String log1 = "log 1";
        String log2 = "log 2";
        addLogsToFile(filepath, log1, log2);
    }
}
