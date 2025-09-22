import java.util.*;

public class Copy2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] matrix = new int[rows][cols];
        int[] flat = new int[rows * cols];
        int k = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
                flat[k++] = matrix[i][j];
            }
        }

        System.out.print("1D Array: ");
        for (int val : flat) System.out.print(val + " ");
    }
}
