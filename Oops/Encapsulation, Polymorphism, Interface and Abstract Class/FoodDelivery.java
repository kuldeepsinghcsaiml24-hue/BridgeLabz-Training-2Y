public class FoodDelivery {
    public static void main(String[] args) {
        FoodItem[] order = {
            new VegItem("Paneer Butter Masala", 200, 2),
            new NonVegItem("Chicken Biryani", 250, 1)
        };
        ((VegItem) order[0]).applyDiscount(10);
        ((NonVegItem) order[1]).applyDiscount(5);
        double total = 0;
        for (FoodItem f : order) {
            f.getItemDetails();
            System.out.println("Total: " + f.calculateTotalPrice());
            total += f.calculateTotalPrice();
            System.out.println("---");
        }
        System.out.println("Order Total: " + total);
    }
}

abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) { this.itemName = itemName; this.price = price; this.quantity = quantity; }

    public String getItemName() { return itemName; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }

    public void getItemDetails() { System.out.println(itemName + " x" + quantity + " @ " + price); }
    public abstract double calculateTotalPrice();
}

interface Discountable {
    void applyDiscount(double percent);
    String getDiscountDetails();
}

class VegItem extends FoodItem implements Discountable {
    private double discountPercent = 0;
    public VegItem(String n, double p, int q) { super(n, p, q); }
    public double calculateTotalPrice() { return getPrice() * getQuantity() * (1 - discountPercent / 100.0); }
    public void applyDiscount(double percent) { this.discountPercent = percent; }
    public String getDiscountDetails() { return discountPercent + "% off"; }
}

class NonVegItem extends FoodItem implements Discountable {
    private double discountPercent = 0;
    private double nonVegCharge = 50;
    public NonVegItem(String n, double p, int q) { super(n, p, q); }
    public double calculateTotalPrice() { return (getPrice() * getQuantity() + nonVegCharge) * (1 - discountPercent / 100.0); }
    public void applyDiscount(double percent) { this.discountPercent = percent; }
    public String getDiscountDetails() { return discountPercent + "% off"; }
}
