import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double baseIn = input.nextDouble();
        double heightIn = input.nextDouble();

        double areaIn2 = 0.5 * baseIn * heightIn;
        double areaCm2 = areaIn2 * 6.4516; // 1 in^2 = 6.4516 cm^2

        System.out.println("The area of the triangle is " +
                           String.format("%.2f", areaIn2) + " square inches and " +
                           String.format("%.2f", areaCm2) + " square centimeters");
        input.close();
    }
}
