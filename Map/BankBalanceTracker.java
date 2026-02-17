
import java.util.*;
public class BankBalanceTracker {
    public static void main(String[] args){
        Map<String,Double> bal=new HashMap<>();
        bal.put("101",10000.0);
        bal.put("102",25000.0);
        bal.put("103",5000.0);
        bal.put("102",bal.get("102")+5000);
        double max=Collections.max(bal.values());
        bal.entrySet().stream().sorted((a,b)->Double.compare(b.getValue(),a.getValue())).forEach(System.out::println);
    }
}