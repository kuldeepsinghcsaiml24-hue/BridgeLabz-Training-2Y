// com/school/data/Student.java
package com.school.data;
public class Student{
    public String name; public int m1,m2,m3;
    public Student(String n,int a,int b,int c){name=n;m1=a;m2=b;m3=c;}
    public String toString(){return name+" "+m1+" "+m2+" "+m3;}
}

// com/school/util/Analyzer.java
package com.school.util;
import com.school.data.Student;
public class Analyzer{
    public double calculateAverage(Student s){ return (s.m1+s.m2+s.m3)/3.0; }
    public String findGrade(double avg){
        return avg>=90?"A":avg>=75?"B":"C";
    }
}

// com/school/main/MainApp.java
package com.school.main;
import com.school.data.*; import com.school.util.*;
public class MainApp{
    public static void main(String[] args){
        Student s=new Student("Devansh",90,85,88);
        Analyzer a=new Analyzer();
        double avg=a.calculateAverage(s);
        System.out.println(s);
        System.out.println("Average: "+avg+" Grade: "+a.findGrade(avg));
    }
}