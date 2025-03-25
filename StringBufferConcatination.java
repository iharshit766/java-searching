public class StringBufferConcatination {
    public static String concatenateStrings(String[] strings) {
        // Create a new StringBuffer object
        StringBuffer sb = new StringBuffer();

        // Iterate through each string in the array and append it
        for (String str : strings) {
            sb.append(str);
        }

        // Return the concatenated string
        return sb.toString();
    }

    public static void main(String[] args) {
        String[] words = {"Hello", " ", "World", "!", " Welcome", " to", " Java"};

        // Concatenate strings using StringBuffer
        String result = concatenateStrings(words);

        // Print the concatenated string
        System.out.println("Concatenated String: " + result);
    }
}