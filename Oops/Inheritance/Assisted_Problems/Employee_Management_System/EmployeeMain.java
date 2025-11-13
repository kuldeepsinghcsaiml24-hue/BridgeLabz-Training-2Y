public class EmployeeMain {
    public static void main(String[] args){
        Employee[] emps = { new Manager("Alice",101,90000,5), new Developer("Bob",102,70000,"Java"), new Intern("Charlie",103,20000,6) };
        for(Employee e: emps){ e.displayDetails(); System.out.println("---"); }
    }
}