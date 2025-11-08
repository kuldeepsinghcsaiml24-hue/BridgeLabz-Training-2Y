import java.util.Scanner;

public class CharacterTypeDisplay {

    public static String charType(char ch) {
        ch = Character.toLowerCase(ch);
        if (!Character.isLetter(ch)) return "Not a Letter";
        return "aeiou".indexOf(ch) != -1 ? "Vowel" : "Consonant";
    }

    public static void displayType(String text) {
        System.out.println("Char\tType");
        for (int i = 0; i < text.length(); i++) {
            System.out.println(text.charAt(i) + "\t" + charType(text.charAt(i)));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        displayType(text);
        sc.close();
    }
}

