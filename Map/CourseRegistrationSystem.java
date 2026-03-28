
import java.util.*;
public class CourseRegistrationSystem {
    public static void main(String[] args){
        Map<String,Integer> reg=new HashMap<>();
        reg.put("CS101",40); reg.put("CS102",3); reg.put("CS103",55);
        for(var e:reg.entrySet())
            if(e.getValue()>=50 || e.getValue()<5) System.out.println(e);
    }
}