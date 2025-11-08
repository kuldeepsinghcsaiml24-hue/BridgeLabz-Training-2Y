package Strings.level1;

import java.util.Scanner;

public class ToLowerCaseComparison {
    static String toLowerManual(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'A' && c <= 'Z')
                result += (char)(c + 32);
            else
                result += c;
        }
        return result;
    }

    static boolean compareUsingCharAt(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String manual = toLowerManual(text);
        String builtin = text.toLowerCase();

        System.out.println("Manual lower: " + manual);
        System.out.println("Built-in lower: " + builtin);
        System.out.println("Comparison: " + compareUsingCharAt(manual, builtin));
        sc.close();
    }
}

