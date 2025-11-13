public class ECommercePlatform {
    public static void main(String[] args) {
        Product[] items = {
            new Electronics(1, "Laptop", 70000),
            new Clothing(2, "T-Shirt", 800),
            new Groceries(3, "Rice", 1200)
        };
        for (Product p : items) printFinalPrice(p);
    }

    public static void printFinalPrice(Product p) {
        double tax = (p instanceof Taxable) ? ((Taxable) p).calculateTax() : 0;
        double discount = p.calculateDiscount();
        double finalPrice = p.getPrice() + tax - discount;
        System.out.println(p.getName() + " -> Price: " + p.getPrice() + ", Tax: " + tax + ", Discount: " + discount + ", Final: " + finalPrice);
    }
}

abstract class Product {
    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public int getProductId() { return productId; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public abstract double calculateDiscount();
}

interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

class Electronics extends Product implements Taxable {
    public Electronics(int id, String name, double price) { super(id, name, price); }
    public double calculateDiscount() { return getPrice() * 0.10; }
    public double calculateTax() { return getPrice() * 0.18; }
    public String getTaxDetails() { return "GST 18%"; }
}

class Clothing extends Product implements Taxable {
    public Clothing(int id, String name, double price) { super(id, name, price); }
    public double calculateDiscount() { return getPrice() * 0.15; }
    public double calculateTax() { return getPrice() * 0.12; }
    public String getTaxDetails() { return "GST 12%"; }
}

class Groceries extends Product {
    public Groceries(int id, String name, double price) { super(id, name, price); }
    public double calculateDiscount() { return 0; }
}
