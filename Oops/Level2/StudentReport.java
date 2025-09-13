class Student {
    String n;
    int roll;
    int marks;

    Student(String n, int roll, int marks) {
        this.n = n;
        this.roll = roll;
        this.marks = marks;
    }

    String grade() {
        if (marks >= 90) return "A";
        else if (marks >= 75) return "B";
        else if (marks >= 50) return "C";
        else return "D";
    }

    void show() {
        System.out.println("Name: " + n);
        System.out.println("Roll: " + roll);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade());
    }
}

public class StudentReport {
    public static void main(String[] args) {
        Student s = new Student("Aman", 1, 82);
        s.show();
    }
}
