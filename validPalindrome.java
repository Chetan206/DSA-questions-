import java.util.Arrays;
import java.util.Scanner;

public class validPalindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write Your Strign");
        String s = sc.nextLine();
        System.out.println(validStringPalindrome(s));

    }

    public static boolean validStringPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                sb.append(Character.toLowerCase(c));
            }
            char[] charArray = sb.toString().toCharArray();
            Arrays.sort(charArray);
            String sortedString = new String(charArray);
            String reversedString = new StringBuilder(sortedString).reverse().toString();
            return sortedString.equals(reversedString);

        }
        return false;
    }
}