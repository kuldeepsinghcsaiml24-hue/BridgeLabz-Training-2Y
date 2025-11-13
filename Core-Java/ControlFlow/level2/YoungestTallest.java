import java.util.Scanner;
public class YoungestTallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age of Amar: ");
        int age1 = sc.nextInt();
        System.out.print("Enter height of Amar: ");
        int h1 = sc.nextInt();
        System.out.print("Enter age of Akbar: ");
        int age2 = sc.nextInt();
        System.out.print("Enter height of Akbar: ");
        int h2 = sc.nextInt();
        System.out.print("Enter age of Anthony: ");
        int age3 = sc.nextInt();
        System.out.print("Enter height of Anthony: ");
        int h3 = sc.nextInt();

        int youngest = Math.min(age1, Math.min(age2, age3));
        int tallest = Math.max(h1, Math.max(h2, h3));

        if (youngest == age1) System.out.println("Youngest: Amar");
        else if (youngest == age2) System.out.println("Youngest: Akbar");
        else System.out.println("Youngest: Anthony");

        if (tallest == h1) System.out.println("Tallest: Amar");
        else if (tallest == h2) System.out.println("Tallest: Akbar");
        else System.out.println("Tallest: Anthony");

        sc.close();
    }
}