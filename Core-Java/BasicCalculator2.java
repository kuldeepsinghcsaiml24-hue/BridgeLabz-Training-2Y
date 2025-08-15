import java.util.Scanner;

public class BasicCalculator2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double number1 = sc.nextDouble();
        double number2 = sc.nextDouble();

        double add = number1 + number2;
        double sub = number1 - number2;
        double mul = number1 * number2;
        String div = (number2 == 0) ? "undefined" : String.format("%.2f", number1 / number2);

        System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers " +
                           number1 + " and " + number2 + " is " + add + ", " + sub + ", " + mul + ", and " + div);
        sc.close();
    }
}
