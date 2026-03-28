import java.time.*;
import java.util.Scanner;

public class DateArithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter date (yyyy-MM-dd): ");
        LocalDate d = LocalDate.parse(sc.next());
        LocalDate r = d.plusDays(7).plusMonths(1).plusYears(2).minusWeeks(3);
        System.out.println("Result date: " + r);
    }
}
