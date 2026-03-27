import java.util.*;

public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int maxSize = 10;
        int[] factors = new int[maxSize];
        int idx = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                if (idx == factors.length) {
                    int[] temp = new int[factors.length * 2];
                    System.arraycopy(factors, 0, temp, 0, factors.length);
                    factors = temp;
                }
                factors[idx++] = i;
            }
        }

        System.out.print("Factors: ");
        for (int i = 0; i < idx; i++) {
            System.out.print(factors[i] + " ");
        }
    }
}
