import java.util.Scanner;

public class MostFrequentCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int[] freq = new int[256];
        for (char ch : str.toCharArray())
            freq[ch]++;

        int max = 0;
        char most = ' ';
        for (char ch : str.toCharArray()) {
            if (freq[ch] > max) {
                max = freq[ch];
                most = ch;
            }
        }

        System.out.println("Most Frequent Character: '" + most + "'");
    }
}
