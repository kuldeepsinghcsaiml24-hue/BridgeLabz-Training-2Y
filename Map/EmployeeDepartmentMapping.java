
import java.util.*;
public class EmployeeDepartmentMapping {
    public static void main(String[] args){
        Map<Integer,String> emp=new HashMap<>();
        emp.put(1,"HR"); emp.put(2,"IT"); emp.put(3,"HR");
        emp.put(2,"Finance");
        Map<String,List<Integer>> rev=new HashMap<>();
        for(var e:emp.entrySet())
            rev.computeIfAbsent(e.getValue(),k->new ArrayList<>()).add(e.getKey());
        System.out.println(rev);
    }
}