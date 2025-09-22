import java.util.*;

public class FizzBuzzArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Invalid");
            return;
        }

        String[] arr = new String[n+1];
        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) arr[i] = "FizzBuzz";
            else if (i % 3 == 0) arr[i] = "Fizz";
            else if (i % 5 == 0) arr[i] = "Buzz";
            else arr[i] = String.valueOf(i);
        }

        for (int i = 1; i <= n; i++) {
            System.out.println("Pos " + i + " = " + arr[i]);
        }
    }
}
