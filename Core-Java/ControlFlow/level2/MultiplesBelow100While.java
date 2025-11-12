import java.util.Scanner;
public class MultiplesBelow100While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer less than 100: ");
        int num = sc.nextInt();
        if (num <= 0 || num >= 100) {
            System.out.println("Invalid input.");
            return;
        }
        int i = 1;
        System.out.println("Multiples of " + num + " below 100:");
        while (i * num < 100) {
            System.out.println(num * i);
            i++;
        }
        sc.close();
    }
}