public class StringBuilderReverse {
    public static String reverseString(String input) {
        // Create a StringBuilder object and append the input string
        StringBuilder sb = new StringBuilder(input);

        // Use the reverse() method to reverse the string
        sb.reverse();

        // Convert StringBuilder back to a string and return it
        return sb.toString();
    }

    public static void main(String[] args) {
        String input = "hello";

        // Reverse the string using StringBuilder
        String reversed = reverseString(input);

        // Print the reversed string
        System.out.println("Reversed string: " + reversed);
    }
}