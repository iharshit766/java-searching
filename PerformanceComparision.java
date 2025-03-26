import java.io.*;

public class PerformanceComparision {
    public static void main(String[] args) {
        compareStringBuilderAndBuffer();
        compareFileReaders("largefile.txt"); // Change this to the path of your large file
    }

    private static void compareStringBuilderAndBuffer() {
        String text = "hello";
        int iterations = 1_000_000;

        // Measure time for StringBuilder
        long startTime = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            sb.append(text);
        }
        long endTime = System.nanoTime();
        System.out.println("StringBuilder Time: " + (endTime - startTime) / 1_000_000 + " ms");

        // Measure time for StringBuffer
        startTime = System.nanoTime();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            sbf.append(text);
        }
        endTime = System.nanoTime();
        System.out.println("StringBuffer Time: " + (endTime - startTime) / 1_000_000 + " ms");
    }

    private static void compareFileReaders(String filePath) {
        long startTime, endTime;

        // Using FileReader
        startTime = System.nanoTime();
        try (FileReader fileReader = new FileReader(filePath);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            int wordCount = 0;
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                wordCount += line.split("\\s+").length;
            }
            System.out.println("FileReader Word Count: " + wordCount);
        } catch (IOException e) {
            System.err.println("Error reading file with FileReader: " + e.getMessage());
        }
        endTime = System.nanoTime();
        System.out.println("FileReader Time: " + (endTime - startTime) / 1_000_000 + " ms");

        // Using InputStreamReader
        startTime = System.nanoTime();
        try (FileInputStream fileInputStream = new FileInputStream(filePath);
             InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8");
             BufferedReader bufferedReader = new BufferedReader(inputStreamReader)) {
            int wordCount = 0;
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                wordCount += line.split("\\s+").length;
            }
            System.out.println("InputStreamReader Word Count: " + wordCount);
        } catch (IOException e) {
            System.err.println("Error reading file with InputStreamReader: " + e.getMessage());
        }
        endTime = System.nanoTime();
        System.out.println("InputStreamReader Time: " + (endTime - startTime) / 1_000_000 + " ms");
    }
}
