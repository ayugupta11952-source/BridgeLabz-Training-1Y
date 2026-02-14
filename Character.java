import java.util.*;

public class Character {

    static String checkChar(char c) {
        if (c >= 'A' && c <= 'Z') c = (char)(c + 32);
        if (c >= 'a' && c <= 'z') {
            if ("aeiou".indexOf(c) >= 0) return "Vowel";
            else return "Consonant";
        }
        return "Not a Letter";
    }

    static String[][] analyze(String text) {
        String[][] table = new String[text.length()][2];
        for (int i = 0; i < text.length(); i++) {
            table[i][0] = String.valueOf(text.charAt(i));
            table[i][1] = checkChar(text.charAt(i));
        }
        return table;
    }

    static void display(String[][] table) {
        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i][0] + "\t" + table[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        display(analyze(text));
    }
}
