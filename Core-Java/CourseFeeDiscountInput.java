import java.util.Scanner;

public class CourseFeeDiscountInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double fee = input.nextDouble();
        double discountPercent = input.nextDouble();

        double discount = fee * discountPercent / 100.0;
        double finalFee = fee - discount;

        System.out.println("The discount amount is INR " + String.format("%.2f", discount) +
                           " and final discounted fee is INR " + String.format("%.2f", finalFee));
        input.close();
    }
}
