import java.util.Arrays;

public class Valid_Anargam {

    public static void main(String[] args) {
        System.out.println(isAnargam("anagram", "nagaram"));
        System.out.println(isAnargam("rat", "car"));
    }

    public static boolean isAnargam(String s, String t) {
        if (s.length() != t.length())
            return false;
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        Arrays.sort(sArray);
        Arrays.sort(tArray);
        return Arrays.equals(sArray, tArray);
    }
}