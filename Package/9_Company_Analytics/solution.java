// com/company/analytics/sales/SalesReport.java
package com.company.analytics.sales;
public class SalesReport{
    public void print(){System.out.println("Sales: North=100, South=150");}
}

// com/company/analytics/hr/EmployeeReport.java
package com.company.analytics.hr;
public class EmployeeReport{
    public void print(){System.out.println("Employee Performance OK");}
}

// MainApp.java
import com.company.analytics.sales.*;
import com.company.analytics.hr.*;
public class MainApp{
    public static void main(String[] args){
        new SalesReport().print();
        new EmployeeReport().print();
    }
}