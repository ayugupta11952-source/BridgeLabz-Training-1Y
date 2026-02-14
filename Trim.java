import java.util.*;

public class Trim {

    static int[] trimIndexes(String s) {
        int start = 0;
        int end = s.length() - 1;

        while (start <= end && s.charAt(start) == ' ') start++;
        while (end >= start && s.charAt(end) == ' ') end--;

        return new int[]{start, end};
    }

    static String substringCustom(String s, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) result += s.charAt(i);
        return result;
    }

    static boolean compareStrings(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        int[] idx = trimIndexes(text);
        String custom = substringCustom(text, idx[0], idx[1]);
        String builtin = text.trim();

        System.out.println(custom);
        System.out.println(compareStrings(custom, builtin));
    }
}
