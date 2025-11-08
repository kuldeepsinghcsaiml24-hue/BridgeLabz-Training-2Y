package Strings.level1;

import java.util.Scanner;

public class IllegalArgument {
    static void generateException(String text) {
        System.out.println(text.substring(5, 2)); // invalid indices
    }

    static void handleException(String text) {
        try {
            System.out.println(text.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();
        try {
            generateException(text);
        } catch (Exception e) {
            System.out.println("Runtime error occurred, now handling:");
            handleException(text);
        }
        sc.close();
    }
}
