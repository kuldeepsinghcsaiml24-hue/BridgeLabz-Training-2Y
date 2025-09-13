class CartItem {
    String item;
    double price;
    int qty;

    CartItem(String item, double price, int qty) {
        this.item = item;
        this.price = price;
        this.qty = qty;
    }

    void add(int q) {
        qty += q;
    }

    void remove(int q) {
        if (q <= qty) qty -= q;
    }

    void show() {
        System.out.println("Item: " + item + ", Qty: " + qty + ", Price: " + price);
        System.out.println("Total: " + (price * qty));
    }
}

public class ShoppingCart {
    public static void main(String[] args) {
        CartItem c = new CartItem("Book", 200, 2);
        c.show();
        c.add(1);
        c.remove(1);
        c.show();
    }
}
