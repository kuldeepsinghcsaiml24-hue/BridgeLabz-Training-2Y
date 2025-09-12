import java.util.Scanner;

public class NaturalNumberSumWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();

        if (n >= 0) {
            int sumFormula = n * (n + 1) / 2;

            int sumLoop = 0, i = 1;
            while (i <= n) {
                sumLoop += i;
                i++;
            }

            System.out.println("Formula result: " + sumFormula);
            System.out.println("While loop result: " + sumLoop);
        } else {
            System.out.println("Not a natural number!");
        }

        scanner.close();
    }
}
