package Strings.level1;

import java.util.Scanner;

public class NumberFormat {
    static void generateException(String text) {
        int number = Integer.parseInt(text);
        System.out.println(number);
    }

    static void handleException(String text) {
        try {
            int number = Integer.parseInt(text);
            System.out.println(number);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException!");
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

