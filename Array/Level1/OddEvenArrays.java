import java.util.*;

public class OddEvenArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Not Natural");
            return;
        }

        int[] odd = new int[n/2 + 1];
        int[] even = new int[n/2 + 1];
        int oi = 0, ei = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) even[ei++] = i;
            else odd[oi++] = i;
        }

        System.out.print("Odd: ");
        for (int i = 0; i < oi; i++) System.out.print(odd[i] + " ");
        System.out.println();

        System.out.print("Even: ");
        for (int i = 0; i < ei; i++) System.out.print(even[i] + " ");
    }
}
