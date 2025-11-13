class Intern extends Employee {
    int duration;
    Intern(String name,int id,double salary,int duration){super(name,id,salary);this.duration=duration;}
    void displayDetails(){ super.displayDetails(); System.out.println("DurationMonths:"+duration); }
}