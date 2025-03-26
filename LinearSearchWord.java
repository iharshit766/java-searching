public class LinearSearchWord {
    public static String findSentenceWithWord(String[] sentences, String word) {
        for (String sentence : sentences) {
            if (sentence.contains(word)) {
                return sentence; // Return the first sentence containing the word
            }
        }
        return "Not Found"; // Return "Not Found" if no sentence contains the word
    }

    public static void main(String[] args) {
        String[] sentences = {
                "The quick brown fox jumps over the lazy dog.",
                "Java is a popular programming language.",
                "Linear search is simple but not always efficient.",
                "Data structures and algorithms are fundamental to computing."
        };

        String word = "Java";
        String result = findSentenceWithWord(sentences, word);

        System.out.println("Result: " + result);
    }
}