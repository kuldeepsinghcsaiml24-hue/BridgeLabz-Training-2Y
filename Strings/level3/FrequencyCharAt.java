import java.util.Scanner;

public class FrequencyCharAt {

    public static String[][] findFrequency(String text) {
        int[] freq = new int[256];
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        String[][] result = new String[text.length()][2];
        int index = 0;
        boolean[] added = new boolean[256];
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (!added[c]) {
                result[index][0] = String.valueOf(c);
                result[index][1] = String.valueOf(freq[c]);
                added[c] = true;
                index++;
            }
        }

        String[][] output = new String[index][2];
        System.arraycopy(result, 0, output, 0, index);
        return output;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        String[][] freq = findFrequency(text);
        System.out.println("Character  Frequency");
        for (String[] row : freq)
            System.out.println("   " + row[0] + "          " + row[1]);
        sc.close();
    }
}
