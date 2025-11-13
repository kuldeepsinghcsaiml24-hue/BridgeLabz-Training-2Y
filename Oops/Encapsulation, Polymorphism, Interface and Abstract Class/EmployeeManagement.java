public class EmployeeManagement {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        FullTimeEmployee f = new FullTimeEmployee(1, "Amit", 50000, 160);
        PartTimeEmployee p = new PartTimeEmployee(2, "Neha", 300, 80);
        FullTimeEmployee f2 = new FullTimeEmployee(3, "Ravi", 60000, 160);

        f.assignDepartment("IT"); p.assignDepartment("Support"); f2.assignDepartment("HR");

        employees[0] = f; employees[1] = p; employees[2] = f2;

        for (Employee e : employees) {
            if (e instanceof Employee) {
                e.displayDetails();
                if (e instanceof Department) {
                    System.out.println("Department: " + ((Department) e).getDepartmentDetails());
                }
                System.out.println("Calculated Salary: " + e.calculateSalary());
                System.out.println("---");
            }
        }
    }
}

abstract class Employee {
    private int employeeId;
    private String name;
    private double baseSalary;

    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public int getEmployeeId() { return employeeId; }
    public String getName() { return name; }
    public double getBaseSalary() { return baseSalary; }
    public void setBaseSalary(double baseSalary) { this.baseSalary = baseSalary; }

    public void displayDetails() {
        System.out.println("ID: " + employeeId + ", Name: " + name + ", Base Salary: " + baseSalary);
    }

    public abstract double calculateSalary();
}

interface Department {
    void assignDepartment(String dept);
    String getDepartmentDetails();
}

class FullTimeEmployee extends Employee implements Department {
    private int workHoursPerMonth;
    private String department;

    public FullTimeEmployee(int id, String name, double baseSalary, int workHoursPerMonth) {
        super(id, name, baseSalary);
        this.workHoursPerMonth = workHoursPerMonth;
    }

    public double calculateSalary() {
        return getBaseSalary();
    }

    public void assignDepartment(String dept) { this.department = dept; }
    public String getDepartmentDetails() { return department; }
}

class PartTimeEmployee extends Employee implements Department {
    private int hoursWorked;
    private double hourlyRate;
    private String department;

    public PartTimeEmployee(int id, String name, double hourlyRate, int hoursWorked) {
        super(id, name, 0);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    public void assignDepartment(String dept) { this.department = dept; }
    public String getDepartmentDetails() { return department; }
}
