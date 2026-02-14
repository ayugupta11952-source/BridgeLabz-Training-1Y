import java.util.Scanner;

   class upto02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int num;

        System.out.println("Enter numbers (0 to stop, negative number to break):");

        while (true) {
            num = sc.nextInt();

            if (num < 0) {
                System.out.println("Negative number entered. Stopping program.");
                break;
            }

            if (num == 0) {
                break;
            }

            sum += num;
        }

        System.out.println("Sum of entered numbers: " + sum);
        sc.close();
    }
}
