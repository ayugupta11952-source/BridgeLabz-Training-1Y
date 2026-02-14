import java.util.*;

public class Voting{

    static int[] generateAges(int n) {
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) ages[i] = (int)(Math.random() * 90);
        return ages;
    }

    static String[][] checkVoting(int[] ages) {
        String[][] table = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            table[i][0] = String.valueOf(ages[i]);
            table[i][1] = (ages[i] >= 18) ? "true" : "false";
        }
        return table;
    }

    static void display(String[][] table) {
        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i][0] + "\t" + table[i][1]);
        }
    }

    public static void main(String[] args) {
        int[] ages = generateAges(10);
        display(checkVoting(ages));
    }
}
