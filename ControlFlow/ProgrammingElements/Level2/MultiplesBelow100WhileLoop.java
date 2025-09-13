import java.util.Scanner;

public class MultiplesBelow100WhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number less than 100: ");
        int number = sc.nextInt();

        if (number > 0 && number < 100) {
            int counter = 100;
            System.out.println("Multiples of " + number + " below 100 are:");
            while (counter >= 1) {
                if (counter % number == 0) {
                    System.out.println(counter);
                }
                counter--;
            }
        } else {
            System.out.println("Enter a positive integer less than 100.");
        }
    }
}
