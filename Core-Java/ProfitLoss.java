public class ProfitLoss {
    public static void main(String[] args) {
        double costPrice = 129;
        double sellingPrice = 191;
        double profit = sellingPrice - costPrice;
        double profitPercent = (profit / costPrice) * 100.0;

        System.out.println(
            "The Cost Price is INR " + String.format("%.2f", costPrice) +
            " and Selling Price is INR " + String.format("%.2f", sellingPrice) + "\n" +
            "The Profit is INR " + String.format("%.2f", profit) +
            " and the Profit Percentage is " + String.format("%.2f", profitPercent)
        );
    }
}
