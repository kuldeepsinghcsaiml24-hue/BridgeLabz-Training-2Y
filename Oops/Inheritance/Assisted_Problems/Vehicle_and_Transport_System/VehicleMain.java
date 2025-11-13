public class VehicleMain {
    public static void main(String[] args){
        Vehicle[] fleet = { new Car(180,"Petrol",5), new Truck(120,"Diesel",10000.0), new Motorcycle(140,"Petrol",false) };
        for(Vehicle v: fleet){ v.displayInfo(); System.out.println("---"); }
    }
}