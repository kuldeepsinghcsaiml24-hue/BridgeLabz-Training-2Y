import java.util.*;

public class PalindromeCheck {
    static boolean isPal(String s) {
        s = s.toLowerCase();
        return s.equals(new StringBuilder(s).reverse().toString());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.next();
        System.out.println(isPal(s) ? "Palindrome" : "Not Palindrome");
    }
}
