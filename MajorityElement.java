import java.util.Scanner;

public class MajorityElement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arsi = sc.nextInt();
        int[] arr = new int[arsi];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(majorityElementMethod(arr));
    }

    public static int majorityElementMethod(int[] arr) {
        int candidate = arr[0];
        int count = 1;
        for (int i = 0; i < arr.length; i++) {
            if (count == 0) {
                candidate = arr[i];

            } else if (candidate == arr[i]) {
                count++;
            } else {
                count--;
            }
        }
        return candidate;

    }
}
