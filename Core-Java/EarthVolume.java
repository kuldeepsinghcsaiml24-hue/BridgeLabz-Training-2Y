public class EarthVolume {
    public static void main(String[] args) {
        double rKm = 6378.0;
        double volumeKm3 = (4.0 / 3.0) * Math.PI * Math.pow(rKm, 3);
        // 1 mile = 1.6 km -> 1 km^3 = (1/1.6)^3 mile^3
        double volumeMi3 = volumeKm3 / Math.pow(1.6, 3);

        System.out.println("The volume of earth in cubic kilometers is " +
            String.format("%.2f", volumeKm3) + " and cubic miles is " +
            String.format("%.2f", volumeMi3));
    }
}
