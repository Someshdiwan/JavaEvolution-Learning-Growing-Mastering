import com.opencsv.CSVWriter;
import java.io.FileWriter;

public class CSVFileWritingInJava {
    public static void main(String[] args) {
        // Step 1: Path to the CSV file
        String filePath = "/Users/somesh/Java SE/JavaEvolution-Learning-Growing-Mastering/Section23JavaIOStreams/src/MyJAVA/data.csv";

        try {
            // Step 2: FileWriter to write to the file
            FileWriter fileWriter = new FileWriter(filePath);

            // Step 3: CSVWriter from OpenCSV to write CSV rows
            CSVWriter csvWriter = new CSVWriter(fileWriter);

            // Step 4: Write header
            String[] header = { "Name", "Age", "City" };
            csvWriter.writeNext(header);

            // Step 5: Write data rows
            String[] row1 = { "Alice", "25", "Bangalore" };
            String[] row2 = { "Bob", "30", "Delhi" };
            String[] row3 = { "Charlie", "22", "Mumbai" };

            csvWriter.writeNext(row1);
            csvWriter.writeNext(row2);
            csvWriter.writeNext(row3);

            csvWriter.close();

        } catch (Exception e) {
            System.out.println("Something went wrong while writing to the file.");
            e.printStackTrace();
        }
    }
}
