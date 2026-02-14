import java.util.Scanner;

public class Palindrome {

    public static boolean logic1(String text) {
        int start = 0;
        int end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start) != text.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }

    public static boolean logic2(String text, int start, int end) {
        if (start >= end)
            return true;
        if (text.charAt(start) != text.charAt(end))
            return false;
        return logic2(text, start + 1, end - 1);
    }

    public static char[] reverse(String text) {
        char[] rev = new char[text.length()];
        for (int i = 0; i < text.length(); i++)
            rev[i] = text.charAt(text.length() - 1 - i);
        return rev;
    }

    public static boolean logic3(String text) {
        char[] original = text.toCharArray();
        char[] rev = reverse(text);
        for (int i = 0; i < original.length; i++)
            if (original[i] != rev[i])
                return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        System.out.println(logic1(text));
        System.out.println(logic2(text, 0, text.length() - 1));
        System.out.println(logic3(text));
    }
}
