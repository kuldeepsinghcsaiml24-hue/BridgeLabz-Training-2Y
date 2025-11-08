import java.util.Scanner;

public class BMICalculator {

    public static double calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100.0;
        return weight / (heightM * heightM);
    }

    public static String getStatus(double bmi) {
        if (bmi < 18.5)
            return "Underweight";
        else if (bmi < 25)
            return "Normal";
        else if (bmi < 30)
            return "Overweight";
        else
            return "Obese";
    }

    public static String[][] computeBMI(double[][] data) {
        String[][] result = new String[data.length][4];
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double height = data[i][1];
            double bmi = calculateBMI(weight, height);
            String status = getStatus(bmi);
            result[i][0] = String.format("%.2f", height);
            result[i][1] = String.format("%.2f", weight);
            result[i][2] = String.format("%.2f", bmi);
            result[i][3] = status;
        }
        return result;
    }

    public static void display(String[][] table) {
        System.out.printf("%-10s %-10s %-10s %-15s%n", "Height(cm)", "Weight(kg)", "BMI", "Status");
        for (String[] row : table) {
            System.out.printf("%-10s %-10s %-10s %-15s%n", row[0], row[1], row[2], row[3]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] members = new double[10][2];
        System.out.println("Enter height (cm) and weight (kg) for 10 persons:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Person " + (i + 1) + " Height (cm): ");
            members[i][1] = sc.nextDouble();
            System.out.print("Person " + (i + 1) + " Weight (kg): ");
            members[i][0] = sc.nextDouble();
        }
        String[][] result = computeBMI(members);
        display(result);
        sc.close();
    }
}
