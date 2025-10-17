import com.opencsv.CSVWriter;
import java.io.FileWriter;

public class WritingUserLoginDetailsCSVFile {
    // Static file path to the CSV file you want to write to (change as needed)
    public static String filePath = "/Users/somesh/Java SE/JavaEvolution-Learning-Growing-Mastering/Section23JavaIOStreams/src/MyJAVA/users.csv";

    public static void main(String[] args) {
        try {
            // Step 1: Create a FileWriter to write to the CSV file
            FileWriter fileWriter = new FileWriter(filePath);

            // Step 2: Wrap FileWriter with CSVWriter from OpenCSV
            CSVWriter csvWriter = new CSVWriter(fileWriter);

            // Step 3: Write the header row (optional)
            String[] header = {"Name", "Age", "Email"};
            csvWriter.writeNext(header);

            // Step 4: Write data rows to the CSV file
            String[] row1 = {"John", "30", "john@example.com"};
            String[] row2 = {"Jane", "25", "jane@example.com"};
            String[] row3 = {"Alice", "28", "alice@example.com"};

            csvWriter.writeNext(row1);
            csvWriter.writeNext(row2);
            csvWriter.writeNext(row3);

            // Step 5: Close the CSVWriter to save and free resources
            csvWriter.close();

        } catch (Exception e) {
            // Step 6: Handle exceptions such as file write error
            System.out.println("Error writing CSV file");
            e.printStackTrace();
        }
    }
}
