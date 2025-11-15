
import java.util.*;
public class CountryCapitalLookup {
    public static void main(String[] args){
        Map<String,String> map=new TreeMap<>();
        map.put("India","Delhi"); map.put("USA","Washington");
        System.out.println(map.getOrDefault("India","Unknown"));
        for(var e:map.entrySet()) System.out.println(e);
    }
}