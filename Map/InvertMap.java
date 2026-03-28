
import java.util.*;
public class InvertMap {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("A",1); map.put("B",2); map.put("C",1);
        Map<Integer,List<String>> inv=new HashMap<>();
        for(var e:map.entrySet()){
            inv.computeIfAbsent(e.getValue(),k->new ArrayList<>()).add(e.getKey());
        }
        System.out.println(inv);
    }
}