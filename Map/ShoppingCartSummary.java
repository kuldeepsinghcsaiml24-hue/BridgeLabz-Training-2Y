
import java.util.*;
public class ShoppingCartSummary {
    public static void main(String[] args){
        Map<String,Double> cart=new LinkedHashMap<>();
        cart.put("Laptop",40000.0);
        cart.put("Mouse",500.0);
        cart.put("Bag",1200.0);
        double sum=cart.values().stream().mapToDouble(Double::doubleValue).sum();
        if(sum>5000) sum*=0.9;
        System.out.println("Total="+sum);
    }
}