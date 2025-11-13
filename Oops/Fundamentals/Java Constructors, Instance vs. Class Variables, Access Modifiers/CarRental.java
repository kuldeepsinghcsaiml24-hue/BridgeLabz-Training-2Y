public class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double costPerDay = 1000.0;

    CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    double calculateTotalCost() {
        return rentalDays * costPerDay;
    }

    public static void main(String[] args) {
        CarRental r1 = new CarRental("Amit", "Hyundai i20", 4);
        System.out.println("Customer: " + r1.customerName);
        System.out.println("Car Model: " + r1.carModel);
        System.out.println("Total Cost: ₹" + r1.calculateTotalCost());
    }
}