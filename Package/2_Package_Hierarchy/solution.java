// com/university/department/cse/Course.java
package com.university.department.cse;
public class Course{
    public void show(){
        System.out.println("CSE Course: Java Programming");
    }
}

// MainApp.java
import com.university.department.cse.Course;
public class MainApp{
    public static void main(String[] args){
        new Course().show();
    }
}