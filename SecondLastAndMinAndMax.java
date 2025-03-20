import java.util.Scanner;

public class SecondLastAndMinAndMax {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int arrsize = sc.nextInt();
        int[] arr = new int[arrsize];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        minAndMax(arr);

    }

    public static void minAndMax(int[] arr) {
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
        System.out.println("  " + second);
        // System.out.println(" " + max);
    }
}
