import java.util.Scanner;

public class Binary {

    public static void main(String[] args) {
        // int arr[] = { 1, 2, 3, 4, 5, 6, 7, 89, 6, 9 };
        // int target = 6;
        // int result = binarySeach(arr, target);
        // if (result != -1) {
        // System.out.println("Real Output " + result);
        // } else {
        // System.out.println("Output is Not found");
        // }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Array Size");
        int arrsize = sc.nextInt();
        int arr[] = new int[arrsize];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        findMinAndMAx(arr);
    }

    public static int binarySeach(int arr[], int target) {
        int left = 0;
        int right = arr.length - 1;
        for (int i = left; i <= right;) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static void findMinAndMAx(int arr[]) {
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Min Element " + min);
        System.out.println("Max Element " + max);

    }
}