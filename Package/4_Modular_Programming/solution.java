// module: collegeinfo/module-info.java
module collegeinfo{
    exports college.student;
}

// college/student/Student.java
package college.student;
public class Student{
    public void info(){ System.out.println("Student from module"); }
}

// module: app/module-info.java
module app{
    requires collegeinfo;
}

// app/MainApp.java
import college.student.Student;
public class MainApp{
    public static void main(String[] args){
        new Student().info();
    }
}