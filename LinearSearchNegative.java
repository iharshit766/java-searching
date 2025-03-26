public class LinearSearchNegative {
    public static int findFirstNegative(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                return i; // Return index of the first negative number
            }
        }
        return -1; // Return -1 if no negative number is found
    }

    public static void main(String[] args) {
        int[] numbers = {3, 7, 1, -5, 9, -2, 6};
        int result = findFirstNegative(numbers);

        if (result != -1) {
            System.out.println("First negative number found at index: " + result);
        } else {
            System.out.println("No negative number found in the array.");
        }
    }
}
