import java.io.*;
import java.nio.charset.StandardCharsets;

public class InputStreamReaderExample {
    public static void main(String[] args) {
        // Specify the file path
        String filePath = "example.txt";

        // Using InputStreamReader wrapped with BufferedReader for efficiency
        try (FileInputStream fis = new FileInputStream(filePath);
             InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
             BufferedReader br = new BufferedReader(isr)) {

            String line;
            // Reading file line by line
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            // Handling IOException properly
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}