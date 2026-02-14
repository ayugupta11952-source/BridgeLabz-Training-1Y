import java.util.*;

public class Game {

    static String computerChoice() {
        String[] options = {"rock", "paper", "scissors"};
        return options[(int)(Math.random() * 3)];
    }

    static int winner(String user, String comp) {
        if (user.equals(comp)) return 0;
        if ((user.equals("rock") && comp.equals("scissors")) ||
            (user.equals("paper") && comp.equals("rock")) ||
            (user.equals("scissors") && comp.equals("paper"))) return 1;
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int games = sc.nextInt();
        int userWins = 0, compWins = 0;

        for (int i = 0; i < games; i++) {
            String user = sc.next();
            String comp = computerChoice();
            int res = winner(user, comp);

            if (res == 1) userWins++;
            else if (res == -1) compWins++;

            System.out.println(user + "\t" + comp + "\t" + res);
        }

        double userPct = (userWins * 100.0) / games;
        double compPct = (compWins * 100.0) / games;

        System.out.println(userWins + "\t" + userPct);
        System.out.println(compWins + "\t" + compPct);
    }
}
