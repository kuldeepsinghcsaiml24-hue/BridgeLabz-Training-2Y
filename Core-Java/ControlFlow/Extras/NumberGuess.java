import java.util.*;

public class NumberGuess {
    static int genGuess(Random r) {
        return r.nextInt(100) + 1;
    }

    static String getFb(Scanner sc) {
        System.out.print("Enter feedback (high/low/correct): ");
        return sc.next().toLowerCase();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int g;
        String fb;
        do {
            g = genGuess(r);
            System.out.println("Is your number " + g + "?");
            fb = getFb(sc);
        } while (!fb.equals("correct"));
        System.out.println("Yay! Guessed it!");
    }
}
