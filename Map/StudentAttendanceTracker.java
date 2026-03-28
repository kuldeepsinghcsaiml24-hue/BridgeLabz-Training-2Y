
import java.util.*;
public class StudentAttendanceTracker {
    public static void main(String[] args){
        Map<String,Integer> att=new HashMap<>();
        List<String> students=List.of("A","B","C","D","E");
        for(String s:students) att.put(s,0);
        for(int i=0;i<15;i++){
            for(String p:List.of("A","C","E")) att.put(p,att.get(p)+1);
        }
        for(var e:att.entrySet()) if(e.getValue()<10) System.out.println(e.getKey());
    }
}