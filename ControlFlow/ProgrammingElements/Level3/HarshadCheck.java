import java.util.Scanner;

public class HarshadCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int temp = n, sum = 0;

        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }

        if (n % sum == 0) {
            System.out.println(n + " is a Harshad Number.");
        } else {
            System.out.println(n + " is NOT a Harshad Number.");
        }

        sc.close();
    }
}
