import java.util.Scanner;

public class Cards {

    public static String[] initializeDeck(String[] suits, String[] ranks) {
        int n = suits.length * ranks.length;
        String[] deck = new String[n];
        int index = 0;
        for (String suit : suits)
            for (String rank : ranks)
                deck[index++] = rank + " of " + suit;
        return deck;
    }

    public static void shuffle(String[] deck) {
        int n = deck.length;
        for (int i = 0; i < n; i++) {
            int random = i + (int)(Math.random() * (n - i));
            String temp = deck[i];
            deck[i] = deck[random];
            deck[random] = temp;
        }
    }

    public static String[][] distribute(String[] deck, int players, int cards) {
        if (players * cards > deck.length)
            return null;
        String[][] result = new String[players][cards];
        int index = 0;
        for (int i = 0; i < players; i++)
            for (int j = 0; j < cards; j++)
                result[i][j] = deck[index++];
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] suits = {"Hearts","Diamonds","Clubs","Spades"};
        String[] ranks = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
        String[] deck = initializeDeck(suits, ranks);
        shuffle(deck);
        int players = sc.nextInt();
        int cards = sc.nextInt();
        String[][] result = distribute(deck, players, cards);
        if (result != null)
            for (int i = 0; i < players; i++) {
                System.out.println("Player " + (i+1));
                for (int j = 0; j < cards; j++)
                    System.out.println(result[i][j]);
            }
    }
}
