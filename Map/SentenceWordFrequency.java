
import java.util.*;
public class SentenceWordFrequency {
    public static void main(String[] args){
        String s="Java is fun and Java is powerful";
        s=s.toLowerCase().replaceAll("[^a-z ]"," ");
        Map<String,Integer> map=new HashMap<>();
        for(String w:s.split(" ")) if(!w.isEmpty()) map.put(w,map.getOrDefault(w,0)+1);
        System.out.println(map);
    }
}