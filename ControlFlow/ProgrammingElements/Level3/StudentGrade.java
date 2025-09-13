import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Physics marks: ");
        int physics = sc.nextInt();

        System.out.print("Enter Chemistry marks: ");
        int chemistry = sc.nextInt();

        System.out.print("Enter Maths marks: ");
        int maths = sc.nextInt();

        double percentage = (physics + chemistry + maths) / 3.0;
        System.out.println("Average Percentage: " + percentage + "%");

        if (percentage >= 90) {
            System.out.println("Grade: A+ | Excellent Performance");
        } else if (percentage >= 75) {
            System.out.println("Grade: A | Very Good Performance");
        } else if (percentage >= 60) {
            System.out.println("Grade: B | Good Performance");
        } else if (percentage >= 40) {
            System.out.println("Grade: C | Needs Improvement");
        } else {
            System.out.println("Grade: F | Failed");
        }

        sc.close();
    }
}
