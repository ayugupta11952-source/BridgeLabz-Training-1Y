import java.util.Scanner;

public class digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int count = 0;
        int temp = Math.abs(num);

        if (temp == 0) {
            count = 1;
        } else {
            while (temp > 0) {
                temp = temp / 10;
                count++;
            }
		}
        System.out.println("Number of digits = " + count);
    }
}
