public class BillGenerator {
    public double generateBill(Product[] products) {
        double total = 0;
        for (Product p : products) {
            total += p.getTotal();
        }
        return total;
    }
}
