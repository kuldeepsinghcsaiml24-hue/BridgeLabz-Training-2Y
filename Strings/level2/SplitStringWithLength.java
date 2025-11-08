import java.util.Scanner;

public class SplitStringWithLength {

    public static String[] split(String text) {
        int count = 1;
        for (int i = 0; i < text.length(); i++)
            if (text.charAt(i) == ' ') count++;
        String[] words = new String[count];
        int start = 0, index = 0;
        for (int i = 0; i <= text.length(); i++) {
            if (i == text.length() || text.charAt(i) == ' ') {
                words[index++] = text.substring(start, i);
                start = i + 1;
            }
        }
        return words;
    }

    public static int findLength(String word) {
        int count = 0;
        try {
            while (true) word.charAt(count++);
        } catch (StringIndexOutOfBoundsException e) {}
        return count;
    }

    public static String[][] wordLengthTable(String[] words) {
        String[][] table = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            table[i][0] = words[i];
            table[i][1] = String.valueOf(findLength(words[i]));
        }
        return table;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[][] result = wordLengthTable(split(text));
        System.out.println("Word\tLength");
        for (String[] row : result)
            System.out.println(row[0] + "\t" + row[1]);
        sc.close();
    }
}
