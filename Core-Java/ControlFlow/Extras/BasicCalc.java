import java.util.*;

public class BasicCalc {
    static double add(double a, double b) { return a + b; }
    static double sub(double a, double b) { return a - b; }
    static double mul(double a, double b) { return a * b; }
    static double div(double a, double b) { return a / b; }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        double a = sc.nextDouble(), b = sc.nextDouble();
        System.out.print("Enter op (+ - * /): ");
        char op = sc.next().charAt(0);

        switch (op) {
            case '+': System.out.println("Result = " + add(a, b)); break;
            case '-': System.out.println("Result = " + sub(a, b)); break;
            case '*': System.out.println("Result = " + mul(a, b)); break;
            case '/': System.out.println("Result = " + div(a, b)); break;
            default: System.out.println("Invalid operator");
        }
    }
}
