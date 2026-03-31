// com/company/hr/Employee.java
package com.company.hr;
public class Employee{
    private int id; private String name; private String dept; private double salary;
    public Employee(int i,String n,String d,double s){id=i;name=n;dept=d;salary=s;}
    public double getSalary(){return salary;} public String getName(){return name;}
    public void setSalary(double s){salary=s;}
}

// com/company/payroll/Payroll.java
package com.company.payroll;
import com.company.hr.Employee;
public class Payroll{
    public void calculateBonus(Employee e){
        e.setSalary(e.getSalary()*1.1);
    }
}

// com/company/main/MainApp.java
package com.company.main;
import com.company.hr.*;
import com.company.payroll.*;
public class MainApp{
    public static void main(String[] args){
        Employee e=new Employee(1,"Devansh","IT",50000);
        new Payroll().calculateBonus(e);
        System.out.println("Salary after bonus: "+e.getSalary());
    }
}