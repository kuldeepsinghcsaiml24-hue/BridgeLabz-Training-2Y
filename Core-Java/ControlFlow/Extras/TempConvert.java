import java.util.*;

public class TempConvert {
    static double toC(double f) { return (f - 32) * 5 / 9; }
    static double toF(double c) { return (c * 9 / 5) + 32; }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temp: ");
        double t = sc.nextDouble();
        System.out.print("Convert to (C/F): ");
        char ch = sc.next().toUpperCase().charAt(0);
        if (ch == 'C') System.out.println("Celsius = " + toC(t));
        else System.out.println("Fahrenheit = " + toF(t));
    }
}
