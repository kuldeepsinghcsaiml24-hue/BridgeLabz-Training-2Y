class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }
}

class PostgraduateStudent extends Student {
    public PostgraduateStudent(int rollNumber, String name, double CGPA) {
        super(rollNumber, name, CGPA);
    }

    public void display() {
        System.out.println("Roll No: " + rollNumber + ", Name: " + name + ", CGPA: " + getCGPA());
    }

    public static void main(String[] args) {
        PostgraduateStudent s = new PostgraduateStudent(101, "Rohan", 8.7);
        s.display();
        s.setCGPA(9.0);
        s.display();
    }
}