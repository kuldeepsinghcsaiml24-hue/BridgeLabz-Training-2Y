public class GradeCalculator {
    public String calculateGrade(Student student) {
        int total = 0;
        for (Subject subject : student.getSubjects()) {
            total += subject.getMarks();
        }
        double avg = total / (double) student.getSubjects().length;
        if (avg >= 90) return "A+";
        else if (avg >= 80) return "A";
        else if (avg >= 70) return "B";
        else if (avg >= 60) return "C";
        else return "D";
    }
}
