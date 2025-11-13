public class SchoolResultsMain {
    public static void main(String[] args) {
        Subject[] subjects = {
            new Subject("Math", 90),
            new Subject("Science", 85)
        };
        Student student = new Student("John", subjects);
        GradeCalculator calculator = new GradeCalculator();
        String grade = calculator.calculateGrade(student);

        System.out.println("Student: " + student.getName());
        for (Subject s : student.getSubjects()) {
            System.out.println(s.getTitle() + ": " + s.getMarks());
        }
        System.out.println("Final Grade: " + grade);
    }
}
