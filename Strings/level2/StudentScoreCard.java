import java.util.Random;

public class StudentScoreCard {

    public static int[][] generateScores(int n) {
        Random r = new Random();
        int[][] scores = new int[n][3];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < 3; j++)
                scores[i][j] = r.nextInt(41) + 60; // random 60–100
        return scores;
    }

    public static double[] calculateResults(int[] marks) {
        int total = marks[0] + marks[1] + marks[2];
        double avg = total / 3.0;
        double percent = Math.round((avg) * 100.0) / 100.0;
        return new double[]{total, avg, percent};
    }

    public static char getGrade(double percent) {
        if (percent >= 90) return 'A';
        else if (percent >= 80) return 'B';
        else if (percent >= 70) return 'C';
        else if (percent >= 60) return 'D';
        else return 'F';
    }

    public static void main(String[] args) {
        int[][] scores = generateScores(5);
        System.out.println("Stu\tPhy\tChem\tMath\tTotal\tAvg\t%\tGrade");
        for (int i = 0; i < scores.length; i++) {
            double[] res = calculateResults(scores[i]);
            System.out.printf("%d\t%d\t%d\t%d\t%.0f\t%.2f\t%.2f\t%c\n",
                    i + 1, scores[i][0], scores[i][1], scores[i][2],
                    res[0], res[1], res[2], getGrade(res[2]));
        }
    }
}
