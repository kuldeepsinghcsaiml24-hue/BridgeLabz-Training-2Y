import java.util.Scanner;

public class ShortestLongestWord {

    public static String[] split(String text) {
        return text.split(" ");
    }

    public static int length(String s) {
        int count = 0;
        try { while (true) s.charAt(count++); } 
        catch (Exception e) {}
        return count;
    }

    public static void findShortestLongest(String[] words) {
        String shortest = words[0], longest = words[0];
        for (String w : words) {
            if (length(w) < length(shortest)) shortest = w;
            if (length(w) > length(longest)) longest = w;
        }
        System.out.println("Shortest: " + shortest);
        System.out.println("Longest: " + longest);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sentence: ");
        String text = sc.nextLine();
        findShortestLongest(split(text));
        sc.close();
    }
}
