import java.util.Scanner;

public class grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter marks in Physics: ");
        float physics = sc.nextFloat();

        System.out.print("Enter marks in Chemistry: ");
        float chemistry = sc.nextFloat();

        System.out.print("Enter marks in Maths: ");
        float maths = sc.nextFloat();

        
        float total = physics + chemistry + maths;
        float percentage = total / 3;

       
        char grade;
        if (percentage >= 90) {
            grade = 'A';
        } else if (percentage >= 75) {
            grade = 'B';
        } else if (percentage >= 60) {
            grade = 'C';
        } else if (percentage >= 50) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        
        System.out.println("Percentage = " + percentage + "%");
        System.out.println("Grade = " + grade);

        sc.close();
    }
}
