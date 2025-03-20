public class BinarySearch {

    // Method to perform binary search using a simple for loop
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        for (int i = left; i <= right;) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] > target) {
                right = mid - 1;
            }

            else {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = { 1, 3, 5, 7, 9, 11, 13, 15, 17 };
        int target = 7;

        int result = binarySearch(arr, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found.");
        }
    }
}
