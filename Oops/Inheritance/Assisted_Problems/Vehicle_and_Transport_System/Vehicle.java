class Vehicle {
    int maxSpeed; String fuelType;
    Vehicle(int maxSpeed,String fuelType){this.maxSpeed=maxSpeed;this.fuelType=fuelType;}
    void displayInfo(){ System.out.println("MaxSpeed:"+maxSpeed+", FuelType:"+fuelType); }
}