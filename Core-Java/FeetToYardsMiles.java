import java.util.Scanner;

public class FeetToYardsMiles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double feet = input.nextDouble();

        double yards = feet / 3.0;          // 1 yard = 3 feet
        double miles = feet / 5280.0;       // 1 mile = 5280 feet

        System.out.println("The distance " + String.format("%.2f", feet) +
                           " feet is " + String.format("%.2f", yards) +
                           " yards and " + String.format("%.4f", miles) + " miles");
        input.close();
    }
}
