import java.util.Scanner;

public class harshadno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int originalNum = num;
        int digit, sum = 0;

        while (num > 0) {
            digit = num % 10;
            sum = sum + digit;
            num = num / 10;
        }

        if (originalNum % sum == 0) {
            System.out.println("Harshad Number");
        } else {
            System.out.println("Not a Harshad Number");
        }

        sc.close();
    }
}
