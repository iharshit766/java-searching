public class StringBuilderExample {
    public static void main(String[] args) {
        // Initialize with a reasonable capacity to avoid resizing
        StringBuilder sb = new StringBuilder(50);

        // Using append() method instead of concatenation with +
        sb.append("Hello");
        sb.append(" ");
        sb.append("World!");

        // Inserting a string at a specific position
        sb.insert(6, "Java ");

        // Replacing a part of the string
        sb.replace(6, 10, "Awesome");

        // Deleting a part of the string
        sb.delete(6, 13);

        // Converting StringBuilder to String
        String result = sb.toString();

        // Printing the final result
        System.out.println(result);
    }
}
