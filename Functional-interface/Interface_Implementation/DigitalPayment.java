public class DigitalPayment {
    interface Payment { void pay(double amount); }
    static class UPI implements Payment { public void pay(double amount){ System.out.println("UPI paid: " + amount); } }
    static class CreditCard implements Payment { public void pay(double amount){ System.out.println("CreditCard paid: " + amount); } }
    static class Wallet implements Payment { public void pay(double amount){ System.out.println("Wallet paid: " + amount); } }
    public static void main(String[] args){
        Payment[] methods = { new UPI(), new CreditCard(), new Wallet() };
        for(Payment p: methods) p.pay(250.0);
    }
}
