import java.util.Scanner;

public class Unique{

    public static int getLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {}
        return count;
    }

    public static char[] uniqueChars(String text) {
        int len = getLength(text);
        char[] temp = new char[len];
        int index = 0;
        for (int i = 0; i < len; i++) {
            char ch = text.charAt(i);
            boolean unique = true;
            for (int j = 0; j < i; j++) {
                if (ch == text.charAt(j)) {
                    unique = false;
                    break;
                }
            }
            if (unique) {
                temp[index++] = ch;
            }
        }
        char[] result = new char[index];
        for (int i = 0; i < index; i++)
            result[i] = temp[i];
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        char[] result = uniqueChars(text);
        for (char c : result)
            System.out.print(c + " ");
    }
}
