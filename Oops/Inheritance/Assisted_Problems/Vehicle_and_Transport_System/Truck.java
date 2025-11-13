class Truck extends Vehicle {
    double loadCapacity;
    Truck(int maxSpeed,String fuelType,double loadCapacity){super(maxSpeed,fuelType);this.loadCapacity=loadCapacity;}
    void displayInfo(){ super.displayInfo(); System.out.println("LoadCapacity:"+loadCapacity); }
}