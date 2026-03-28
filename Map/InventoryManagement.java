
import java.util.*;
public class InventoryManagement {
    public static void main(String[] args){
        Map<String,Integer> inv=new HashMap<>();
        inv.put("Sugar",50);
        inv.put("Oil",20);
        inv.put("Rice",0);
        inv.put("Oil",inv.get("Oil")-5);
        inv.put("Sugar",inv.get("Sugar")+30);
        for(var e:inv.entrySet())
            if(e.getValue()<=0) System.out.println(e.getKey()+" out of stock");
    }
}