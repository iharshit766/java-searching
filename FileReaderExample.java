import java.io.*;

public class FileReaderExample {
    public static void main(String[] args) {
        // Specify the file path
        String filePath = "example.txt";

        // Using FileReader wrapped with BufferedReader for efficiency
        try (FileReader fr = new FileReader(filePath);
             BufferedReader br = new BufferedReader(fr)) {

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
