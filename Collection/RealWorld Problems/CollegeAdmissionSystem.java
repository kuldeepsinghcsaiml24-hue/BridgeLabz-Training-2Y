import java.util.*;
class Student { String name; int marks; Student(String n,int m){name=n;marks=m;} public String toString(){return name+":"+marks;} }
public class CollegeAdmissionSystem {
    public static void main(String[] args){
        List<Student> applicants = new ArrayList<>();
        Set<Student> shortlisted = new HashSet<>();
        Queue<Student> interviewQueue = new LinkedList<>();
        TreeSet<Student> merit = new TreeSet<>((a,b)->b.marks - a.marks);
        applicants.add(new Student("A",85)); applicants.add(new Student("B",90));
        shortlisted.add(new Student("A",85));
        interviewQueue.add(new Student("A",85));
        merit.add(new Student("B",90)); merit.add(new Student("A",85));
        System.out.println(merit);
    }
}
