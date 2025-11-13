public class SmartVehicleDashboard {
    interface VehicleDisplay { void displaySpeed(); default void displayBattery(){ System.out.println("Battery: 80%"); } }
    static class Electric implements VehicleDisplay { public void displaySpeed(){ System.out.println("Speed: 120 km/h"); } }
    public static void main(String[] args){
        Electric e = new Electric();
        e.displaySpeed();
        e.displayBattery();
    }
}
