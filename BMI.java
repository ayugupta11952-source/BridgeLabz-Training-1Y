import java.util.Scanner;

public class BMI {

    public static String[][] calculateBMI(double[][] data) {
        String[][] result = new String[data.length][4];
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightMeter = data[i][1] / 100.0;
            double bmi = weight / (heightMeter * heightMeter);
            String status;
            if (bmi < 18.5)
                status = "Underweight";
            else if (bmi < 24.9)
                status = "Normal";
            else if (bmi < 29.9)
                status = "Overweight";
            else
                status = "Obese";
            result[i][0] = String.valueOf(data[i][1]);
            result[i][1] = String.valueOf(weight);
            result[i][2] = String.format("%.2f", bmi);
            result[i][3] = status;
        }
        return result;
    }

    public static void display(String[][] data) {
        System.out.println("Height(cm)\tWeight(kg)\tBMI\tStatus");
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t\t" + data[i][1] + "\t\t" + data[i][2] + "\t" + data[i][3]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] persons = new double[10][2];
        for (int i = 0; i < 10; i++) {
            persons[i][0] = sc.nextDouble();
            persons[i][1] = sc.nextDouble();
        }
        String[][] result = calculateBMI(persons);
        display(result);
    }
}
