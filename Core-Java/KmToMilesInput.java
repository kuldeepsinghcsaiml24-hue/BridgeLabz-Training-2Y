import java.util.Scanner;

public class KmToMilesInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double km;
        // Take user input for km
        km = input.nextDouble();
        double miles = km / 1.6; // 1 mile = 1.6 km
        System.out.println("The total miles is " + String.format("%.2f", miles) +
                           " mile for the given " + String.format("%.2f", km) + " km");
        input.close();
    }
}
