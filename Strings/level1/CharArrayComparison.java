package Strings.level1;

import java.util.Scanner;

public class CharArrayComparison {
    static char[] customToCharArray(String s) {
        char[] arr = new char[s.length()];
        for (int i = 0; i < s.length(); i++) arr[i] = s.charAt(i);
        return arr;
    }

    static boolean compareArrays(char[] a, char[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String s = sc.next();
        char[] manual = customToCharArray(s);
        char[] builtin = s.toCharArray();

        System.out.println("Comparison result: " + compareArrays(manual, builtin));
        sc.close();
    }
}
