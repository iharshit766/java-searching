import java.io.*;

public class FileReaderExample2 {
    public static void main(String[] args) {
        String fileName = "sample.txt"; // Specify the file path

        // Try-with-resources to ensure the file is closed properly
        try (FileReader fileReader = new FileReader(fileName);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line); // Print each line to the console
            }

        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}
