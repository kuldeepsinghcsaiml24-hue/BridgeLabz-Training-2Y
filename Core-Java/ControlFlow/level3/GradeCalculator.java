import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks in Physics: ");
        double phy = sc.nextDouble();
        System.out.print("Enter marks in Chemistry: ");
        double chem = sc.nextDouble();
        System.out.print("Enter marks in Maths: ");
        double math = sc.nextDouble();

        double avg = (phy + chem + math) / 3.0;
        System.out.println("Average Marks: " + avg);

        if (avg >= 90) {
            System.out.println("Grade: A+ (Excellent)");
        } else if (avg >= 80) {
            System.out.println("Grade: A (Very Good)");
        } else if (avg >= 70) {
            System.out.println("Grade: B (Good)");
        } else if (avg >= 60) {
            System.out.println("Grade: C (Average)");
        } else if (avg >= 50) {
            System.out.println("Grade: D (Pass)");
        } else {
            System.out.println("Grade: F (Fail)");
        }
    }
}