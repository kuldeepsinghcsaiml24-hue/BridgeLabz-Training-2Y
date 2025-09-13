class PalindromeChecker {
    String txt;

    PalindromeChecker(String txt) {
        this.txt = txt;
    }

    boolean isPal() {
        String rev = new StringBuilder(txt).reverse().toString();
        return txt.equalsIgnoreCase(rev);
    }

    void show() {
        if (isPal()) System.out.println(txt + " is a Palindrome");
        else System.out.println(txt + " is NOT a Palindrome");
    }
}

public class PalindromeChecker {
    public static void main(String[] args) {
        PalindromeChecker p = new PalindromeChecker("madam");
        p.show();
    }
}
