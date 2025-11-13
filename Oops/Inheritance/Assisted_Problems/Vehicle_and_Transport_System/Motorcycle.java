class Motorcycle extends Vehicle {
    boolean hasCarrier;
    Motorcycle(int maxSpeed,String fuelType,boolean hasCarrier){super(maxSpeed,fuelType);this.hasCarrier=hasCarrier;}
    void displayInfo(){ super.displayInfo(); System.out.println("HasCarrier:"+hasCarrier); }
}