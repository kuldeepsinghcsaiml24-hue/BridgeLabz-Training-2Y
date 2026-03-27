import java.util.*;

public class ArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] arr = new double[10];
        double sum = 0;
        int i = 0;

        while (i < 10) {
            double n = sc.nextDouble();
            if (n <= 0) break;
            arr[i++] = n;
        }

        for (int j = 0; j < i; j++) sum += arr[j];
        System.out.println("Sum = " + sum);
    }
}
