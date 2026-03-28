
import java.util.*;
public class WebsiteVisitTracker {
    public static void main(String[] args){
        Map<String,Integer> vis=new HashMap<>();
        String[] pages={"home","about","products","home","products","contact","home"};
        for(String p:pages) vis.put(p,vis.getOrDefault(p,0)+1);
        vis.entrySet().stream().sorted((a,b)->b.getValue()-a.getValue()).forEach(System.out::println);
    }
}