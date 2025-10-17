import com.opencsv.CSVReader;
import java.io.FileReader;

public class ReadEmployeeCSVFile {
    public static String filePath = "/Users/somesh/Java SE/JavaEvolution-Learning-Growing-Mastering/Section23JavaIOStreams/src/MyJAVA/Employee.csv";

    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader(filePath);
            CSVReader csvReader = new CSVReader(fileReader);

            String[] row = csvReader.readNext();
            int rowNum = 0;

            while (row != null) {
                System.out.print("Row " + rowNum + ": ");
                for (int i = 0; i < row.length; i++) {
                    System.out.print(row[i] + " ");
                }
                System.out.println();

                row = csvReader.readNext();
                rowNum++;
            }
            csvReader.close();
        } catch (Exception e) {
            System.out.println("Error reading CSV file");
            e.printStackTrace();
        }
    }
}
