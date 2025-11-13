import java.util.*;
class Product { String name; int stock; Product(String n,int s){name=n;stock=s;} public String toString(){return name+":"+stock;} }
public class InventoryRestockSystem {
    public static void main(String[] args){
        Set<String> productNames = new HashSet<>();
        List<Product> products = new ArrayList<>();
        Queue<Product> restock = new LinkedList<>();
        Stack<Product> recent = new Stack<>();
        products.add(new Product("Milk",2)); products.add(new Product("Bread",10));
        for(Product p: products) if(p.stock<5) { restock.add(p); productNames.add(p.name); }
        while(!restock.isEmpty()){ Product p=restock.poll(); p.stock+=10; recent.push(p); }
        System.out.println(products);
    }
}
