
import java.util.*;
public class ExamResultReport {
    public static void main(String[] args){
        Map<String,Map<String,Integer>> data=new HashMap<>();
        data.put("Math",Map.of("A",90,"B",70));
        data.put("Science",Map.of("A",95,"C",85));
        for(String sub:data.keySet()){
            var m=data.get(sub);
            String top=Collections.max(m.entrySet(),Map.Entry.comparingByValue()).getKey();
            System.out.println(sub+" Topper="+top);
        }
    }
}