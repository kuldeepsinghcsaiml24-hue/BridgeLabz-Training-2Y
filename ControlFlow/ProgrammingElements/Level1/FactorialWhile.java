import java.util.Scanner;

public class FactorialWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();

        if (n >= 0) {
            long factorial = 1;
            int i = 1;
            while (i <= n) {
                factorial *= i;
                i++;
            }
            System.out.println("Factorial of " + n + " = " + factorial);
        } else {
            System.out.println("Not a natural number!");
        }

        scanner.close();
    }
}
