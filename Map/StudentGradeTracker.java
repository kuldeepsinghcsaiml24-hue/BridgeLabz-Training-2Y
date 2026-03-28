
import java.util.*;
public class StudentGradeTracker {
    public static void main(String[] args){
        Map<String,Double> map=new TreeMap<>();
        map.put("Aman",88.0);
        map.put("Ria",92.0);
        map.put("John",77.0);
        map.put("Ria",95.0);
        map.remove("John");
        for(var e:map.entrySet()) System.out.println(e.getKey()+"="+e.getValue());
    }
}