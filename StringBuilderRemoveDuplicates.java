import java.util.HashSet;

public class StringBuilderRemoveDuplicates {
    public static String removeDuplicates(String input) {
        // Initialize an empty StringBuilder and HashSet
        StringBuilder sb = new StringBuilder();
        HashSet<Character> seen = new HashSet<>();

        // Iterate over each character in the string
        for (char c : input.toCharArray()) {
            if (!seen.contains(c)) {
                sb.append(c); // Append character if not seen before
                seen.add(c);  // Mark character as seen
            }
        }

        // Return the StringBuilder as a string without duplicates
        return sb.toString();
    }

    public static void main(String[] args) {
        String input = "programming";

        // Remove duplicates using StringBuilder
        String result = removeDuplicates(input);

        // Print the string without duplicates
        System.out.println("String without duplicates: " + result);
    }
}
