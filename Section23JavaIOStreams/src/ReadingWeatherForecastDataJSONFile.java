import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Set;

public class ReadingWeatherForecastDataJSONFile {
    public static String filePath = "/Users/somesh/Java SE/JavaEvolution-Learning-Growing-Mastering/Section23JavaIOStreams/src/MyJAVA/forecast.json";

    public static void main(String[] args) {
        try {
            // Step 1: Read entire file as a String
            String jsonContent = new String(Files.readAllBytes(Paths.get(filePath)));

            // Step 2: Parse JSON string to JsonObject
            JsonObject obj = JsonParser.parseString(jsonContent).getAsJsonObject();

            // Step 3: Iterate through keys
            Set<String> keys = obj.keySet();
            for (String key : keys) {
                System.out.println(key + " = " + obj.get(key));
            }

        } catch (Exception e) {
            System.out.println("Error reading file");
            e.printStackTrace();
        }
    }
}
