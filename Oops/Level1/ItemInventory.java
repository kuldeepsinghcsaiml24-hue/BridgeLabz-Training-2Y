class Item {
    int code;
    String name;
    double price;

    Item(int code, String name, double price) {
        this.code = code;
        this.name = name;
        this.price = price;
    }

    void show(int qty) {
        System.out.println("Code: " + code);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Qty: " + qty);
        System.out.println("Total: " + (price * qty));
    }
}

public class ItemInventory {
    public static void main(String[] args) {
        Item it = new Item(101, "Pen", 10.5);
        it.show(5);
    }
}
