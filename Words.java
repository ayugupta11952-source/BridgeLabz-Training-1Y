import java.util.*;

public class Words {

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

    static String[][] wordLengthTable(String[] words) {
        String[][] table = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            table[i][0] = words[i];
            table[i][1] = String.valueOf(findLength(words[i]));
        }
        return table;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[] words = splitWords(text);
        String[][] table = wordLengthTable(words);

        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i][0] + "\t" + Integer.parseInt(table[i][1]));
        }
    }
}
