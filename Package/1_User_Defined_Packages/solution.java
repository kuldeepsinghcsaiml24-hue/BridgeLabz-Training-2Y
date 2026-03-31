// college/student/Student.java
package college.student;
public class Student {
    public void show(String name,int roll){
        System.out.println("Student: "+name+" Roll: "+roll);
    }
}

// college/faculty/Faculty.java
package college.faculty;
public class Faculty {
    public void show(String name,String subject){
        System.out.println("Faculty: "+name+" Subject: "+subject);
    }
}

// MainApp.java
import college.student.Student;
import college.faculty.Faculty;
public class MainApp{
    public static void main(String[] args){
        new Student().show("KULDEEP",101);
        new Faculty().show("Rahul","Maths");
    }
}