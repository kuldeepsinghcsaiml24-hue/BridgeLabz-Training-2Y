package Strings.level1;

public class NullPointerDemo {
    static void generateException() {
        String text = null;
        System.out.println(text.length()); 
    }

    static void handleException() {
        String text = null;
        try {
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException!");
        }
    }

    public static void main(String[] args) {
        try {
            generateException();
        } catch (Exception e) {
            System.out.println("Program crashed! Now handling properly:");
            handleException();
        }
    }
}

