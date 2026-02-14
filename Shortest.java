import java.util.*;

public class Shortest {

    static int findLength(String s) {
        int count = 0;
        try {
            while (true) {
                s.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }
        return count;
    }

    static String[] splitWords(String text) {
        int len = findLength(text);
        int spaces = 0;
        for (int i = 0; i < len; i++) if (text.charAt(i) == ' ') spaces++;

        int[] indexes = new int[spaces + 2];
        int idx = 0;
        indexes[idx++] = -1;

        for (int i = 0; i < len; i++) if (text.charAt(i) == ' ') indexes[idx++] = i;
        indexes[idx] = len;

        String[] words = new String[indexes.length - 1];
        for (int i = 0; i < words.length; i++) {
            String w = "";
            for (int j = indexes[i] + 1; j < indexes[i + 1]; j++) w += text.charAt(j);
            words[i] = w;
        }
        return words;
    }

    static int[] shortestLongest(String[] words) {
        int min = findLength(words[0]);
        int max = min;

        for (int i = 1; i < words.length; i++) {
            int len = findLength(words[i]);
            if (len < min) min = len;
            if (len > max) max = len;
        }
        return new int[]{min, max};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[] words = splitWords(text);
        int[] result = shortestLongest(words);
        System.out.println(result[0]);
        System.out.println(result[1]);
    }
}
