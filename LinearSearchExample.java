public class LinearSearchExample {
    public static int linearSearch(int[] arr, int target) {
        // Iterate through the array
        for (int i = 0; i < arr.length; i++) {
            // Return early if the target element is found
            if (arr[i] == target) {
                return i;
            }
        }
        // Return -1 if the element is not found
        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = {10, 25, 30, 45, 50};
        int target = 30;

        int result = linearSearch(numbers, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
