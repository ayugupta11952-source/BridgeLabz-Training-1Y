import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int originalNum = num;
        int digit, sum = 0;
        while (num > 0) {
            digit = num % 10;          
            sum = sum + (digit * digit * digit);  
            num = num / 10;           
        } 
        if (sum == originalNum) {
            System.out.println(originalNum + " is an Armstrong number.");
        } else {
            System.out.println(originalNum + " is not an Armstrong number.");
        }
    }
}
