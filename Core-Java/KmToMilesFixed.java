public class KmToMilesFixed {
    public static void main(String[] args) {
        double km = 10.8;
        // Using 1 mile = 1.6 km => miles = km / 1.6
        double miles = km / 1.6;
        System.out.println("The distance " + km + " km in miles is " + String.format("%.2f", miles));
    }
}
