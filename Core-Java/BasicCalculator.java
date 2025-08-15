import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();

        double add = number1 + number2;
        double sub = number1 - number2;
        double mul = number1 * number2;
        String divStr = (number2 == 0) ? "undefined" : String.format("%.4f", (number1 / number2));

        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " +
                           String.format("%.2f", number1) + " and " + String.format("%.2f", number2) +
                           " is " + String.format("%.4f", add) + ", " +
                           String.format("%.4f", sub) + ", " +
                           String.format("%.4f", mul) + ", and " + divStr);
        input.close();
    }
}
