import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s1 = sc.next();
        System.out.print("Enter second string: ");
        String s2 = sc.next();
        sc.close();

        boolean areEqual = true;

        if (s1.length() != s2.length()) {
            areEqual = false;
        } else {
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) != s2.charAt(i)) {
                    areEqual = false;
                    break;
                }
            }
        }

        System.out.println("Using charAt() method comparison: " + (areEqual ? "Equal" : "Not Equal"));
        System.out.println("Using equals() method: " + (s1.equals(s2) ? "Equal" : "Not Equal"));
    }
}
