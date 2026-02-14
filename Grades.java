import java.util.*;

public class Grades {

    static int[][] generateMarks(int students) {
        int[][] marks = new int[students][3];
        for (int i = 0; i < students; i++) {
            marks[i][0] = (int)(Math.random() * 100);
            marks[i][1] = (int)(Math.random() * 100);
            marks[i][2] = (int)(Math.random() * 100);
        }
        return marks;
    }

    static double[][] calculateStats(int[][] marks) {
        double[][] stats = new double[marks.length][3];
        for (int i = 0; i < marks.length; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double avg = total / 3.0;
            double pct = avg;
            stats[i][0] = total;
            stats[i][1] = Math.round(avg * 100.0) / 100.0;
            stats[i][2] = Math.round(pct * 100.0) / 100.0;
        }
        return stats;
    }

    static String[] grades(double[][] stats) {
        String[] g = new String[stats.length];
        for (int i = 0; i < stats.length; i++) {
            double p = stats[i][2];
            if (p >= 90) g[i] = "A";
            else if (p >= 75) g[i] = "B";
            else if (p >= 50) g[i] = "C";
            else g[i] = "F";
        }
        return g;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int students = sc.nextInt();

        int[][] marks = generateMarks(students);
        double[][] stats = calculateStats(marks);
        String[] grades = grades(stats);

        for (int i = 0; i < students; i++) {
            System.out.println(
                marks[i][0] + "\t" +
                marks[i][1] + "\t" +
                marks[i][2] + "\t" +
                stats[i][0] + "\t" +
                stats[i][1] + "\t" +
                stats[i][2] + "\t" +
                grades[i]
            );
        }
    }
}
