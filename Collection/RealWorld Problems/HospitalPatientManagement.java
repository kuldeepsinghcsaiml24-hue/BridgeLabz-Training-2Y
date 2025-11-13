import java.util.*;
class PatientInfo{ String name; PatientInfo(String n){name=n;} public String toString(){return name;} }
public class HospitalPatientManagement {
    public static void main(String[] args){
        Set<PatientInfo> admitted = new HashSet<>();
        Queue<PatientInfo> waiting = new LinkedList<>();
        Stack<PatientInfo> discharged = new Stack<>();
        List<PatientInfo> history = new ArrayList<>();
        waiting.add(new PatientInfo("P1")); admitted.add(new PatientInfo("P1"));
        history.add(new PatientInfo("P1")); System.out.println(history);
    }
}
