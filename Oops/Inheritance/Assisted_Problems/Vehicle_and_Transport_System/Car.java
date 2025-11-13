class Car extends Vehicle {
    int seatCapacity;
    Car(int maxSpeed,String fuelType,int seatCapacity){super(maxSpeed,fuelType);this.seatCapacity=seatCapacity;}
    void displayInfo(){ super.displayInfo(); System.out.println("Seats:"+seatCapacity); }
}