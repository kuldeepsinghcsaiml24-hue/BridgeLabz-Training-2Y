import java.util.Scanner;

public class ArmstrongCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int temp = n, sum = 0;

        while (temp != 0) {
            int d = temp % 10;
            sum += d * d * d;
            temp /= 10;
        }

        if (sum == n) {
            System.out.println(n + " is an Armstrong Number.");
        } else {
            System.out.println(n + " is NOT an Armstrong Number.");
        }

        sc.close();
    }
}
