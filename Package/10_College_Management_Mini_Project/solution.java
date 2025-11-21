// college/student/Student.java
package college.student;
public class Student{ public void show(){System.out.println("Student info");} }

// college/faculty/Faculty.java
package college.faculty;
public class Faculty{ public void show(){System.out.println("Faculty info");} }

// college/department/Department.java
package college.department;
public class Department{ public void show(){System.out.println("Dept info");} }

// college/main/MainApp.java
package college.main;
import static java.lang.System.out;
import college.student.*; import college.faculty.*; import college.department.*;
public class MainApp{
    public static void main(String[] args){
        out.println("=== College Info ===");
        new Student().show();
        new Faculty().show();
        new Department().show();
    }
}