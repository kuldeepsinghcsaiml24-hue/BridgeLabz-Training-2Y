public class GroceryBillMain {
    public static void main(String[] args) {
        Customer customer = new Customer("Alice");
        Product[] products = {
            new Product("Apples", 3.0, 2),
            new Product("Milk", 2.0, 1)
        };
        BillGenerator generator = new BillGenerator();
        double total = generator.generateBill(products);

        System.out.println("Customer: " + customer.getName());
        for (Product p : products) {
            System.out.println(p.getName() + " - Qty: " + p.getQuantity() + ", Price: $" + p.getPrice() + ", Total: $" + p.getTotal());
        }
        System.out.println("Final Bill: $" + total);
    }
}
