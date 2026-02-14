import java.util.*;

public class Length {
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int customLength = findLength(input);
        int builtinLength = input.length();
        System.out.println(customLength);
        System.out.println(builtinLength);
    }
}
