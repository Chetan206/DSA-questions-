import java.util.ArrayList;

public class Insertion__Sort {

    public static void main(String[] args) {
//
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the value in Array");
        // int arrSize = sc.nextInt();
        // int[] arr = new int[arrSize];
        // for (int i = 0; i < arr.length; i++) {
        // arr[i] = sc.nextInt();
        }
        // Arrays.sort(arr);
        // bubbleSortMethod(arr);
        // selectionSortMethod(arr);
        // findMinAndMax(arr);
        // reverseArray(arr);
        /// mediumRotateArray(arr); 1212121212121212
        // reverseLinkedlist();
        // findSecondLargestNumber(arr);
        // for (int i : arr) {
        // System.out.print(i + " ");
        // }
        System.out.println(reverseIntegerCode(-123));
    }

    public static void bubbleSortMethod(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;

                }
            }
        }
    }

    public static void selectionSortMethod(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int smallest = i;
            for (int j = 0; j < arr.length; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;

        }
    }

    public static void findMinAndMax(int[] arr) {
        ArrayList<Integer> arlist = new ArrayList<>();
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }
            arlist.add(arr[i]);
        }

        // System.out.println("Max element In Array " + max);
        // System.out.println("Min Element In Array " + min);
        System.out.println("arlist Minimum Element " + min);
        System.out.println("ArList Maximum Element " + max);
    }

    public static void mediumRotateArray(int[] arr) {
        int k = 3;
        for (int i = 1; i <= k; i++) {
            int last = arr[arr.length - 1];
            for (int j = arr.length - 1; j > 0; j--) {
                arr[i] = arr[i - 1];

            }
            arr[0] = last;

        }

    }

    public static void reverseArray(int[] arr) {
        ArrayList<Integer> arlist = new ArrayList<>();
        for (int j = arr.length - 1; j >= 0; j--) {
            arlist.add(arr[j]);
        }
        System.out.println("Out Put Of reverse Array");
        System.out.println(arlist);
    }

    public static void findSecondLargestNumber(int[] arr) {
        int first = arr[0];
        int second = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            } else if (arr[i] > first) {
                first = arr[i];
            }
        }
        System.out.println("Its is second largest number " + second);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > first) {
                first = arr[i];
            }
        }
        System.out.println("First Largest Number " + first);
    }

    static int reverseIntegerCode(int x) {
        int rev = 0;
        while (x != 0) {
            int digit = x % 10;
            if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10) {
                return 0;
            }
            rev = (rev * 10) + digit;
            x = x / 10;
        }
        return rev;
    }
}
