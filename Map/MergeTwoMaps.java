
import java.util.*;
public class MergeTwoMaps {
    public static void main(String[] args){
        Map<String,Integer> a=Map.of("A",1,"B",2);
        Map<String,Integer> b=Map.of("B",3,"C",4);
        Map<String,Integer> res=new HashMap<>(a);
        for(var e:b.entrySet()){
            res.put(e.getKey(), res.getOrDefault(e.getKey(),0)+e.getValue());
        }
        System.out.println(res);
    }
}